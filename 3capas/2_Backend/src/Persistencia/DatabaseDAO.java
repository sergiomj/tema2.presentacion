package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Infraestructuras.DAOException;
import Infraestructuras.Departamentos;
import Infraestructuras.Empleados;

@SuppressWarnings("unused")
public class DatabaseDAO implements DatabaseDAOInterface{

	public Connection getConnection() {
		Connection conexion = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ignacio", "root", "toor");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexion;
	}

	public ArrayList<Departamentos> listarDep() {
		ArrayList<Departamentos> departamentos = new ArrayList<Departamentos>();
		try {
			Connection conexion = getConnection();
			Statement sentencia = conexion.createStatement();
			String sql = "Select * from departamentos";
			ResultSet resul = sentencia.executeQuery(sql);
			while (resul.next()) {

				Departamentos d = new Departamentos(resul.getByte("dept_no"), resul.getString("dnombre"),
						resul.getString("loc"));
				departamentos.add(d);

			}
			conexion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return (departamentos);

	}

	public ArrayList<Empleados> listarEmp() {
		ArrayList<Empleados> empleados = new ArrayList<Empleados>();
		try {
			Connection conexion = getConnection();
			Statement sentencia = conexion.createStatement();
			String sql = "SELECT * FROM empleados";
			ResultSet resul = sentencia.executeQuery(sql);
			while (resul.next()) {
				Empleados e = new Empleados(resul.getInt("emp_no"), resul.getString("apellido"),
						resul.getString("oficio"), resul.getInt("dir"), resul.getDate("fecha_alt").toString(),
						resul.getFloat("salario"), resul.getFloat("comision"), resul.getInt("dept_no"));
				empleados.add(e);
			}
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empleados;
	}

	public void insertaDepartamento(Departamentos d) {

		try {
			Connection conexion = getConnection();
			Statement sentencia = conexion.createStatement();
			String sql = "insert into departamentos values('" + d.getDeptno() + "','" + d.getDnombre() + "','"
					+ d.getLoc() + "')";
			if (d.getDeptno() != 0)
				sentencia.execute(sql);
			conexion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertarEmpleado(Empleados e) throws DAOException {
		try {
			PreparedStatement insertar = null;
			Connection conexion = getConnection();
			if (insertar == null) {
				insertar = conexion.prepareStatement(
						"INSERT INTO empleados (emp_no, apellido, oficio, dir, fecha_alt, salario, comision, dept_no) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
				insertar.setShort(1, (short) e.getEmpno());
				insertar.setString(2, e.getApellido());
				insertar.setString(3, e.getOficio());
				insertar.setInt(4, e.getDir());
				insertar.setDate(5, fecha(e.getFechaalt()));
				insertar.setFloat(6, e.getSalario());
				insertar.setFloat(7, e.getComision());
				insertar.setByte(8, (byte) e.getDeptno());
				insertar.executeUpdate();
			}
		} catch (Exception ex) {
			throw new DAOException("Se ha producido un error al insertar empleado", ex);
		}

	}

	public java.sql.Date fecha(String fecha) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date dateutil = null;
		java.sql.Date date = null;
		
		try {
			dateutil = sdf1.parse(fecha);
			date = new java.sql.Date(dateutil.getTime());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
