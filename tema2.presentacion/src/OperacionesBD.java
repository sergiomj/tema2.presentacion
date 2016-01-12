import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import ejemplo.Departamentos;

public class OperacionesBD {

	public Connection getConnection() {
		Connection conexion = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.135/examen3", "root", "contraseña");
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

	public void insertaDepartmaneto(Departamentos d) {

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

}
