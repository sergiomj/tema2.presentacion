package Persistencia;

import java.util.ArrayList;

import Infraestructuras.DAOException;
import Infraestructuras.Departamentos;
import Infraestructuras.Empleados;

public interface DatabaseDAOInterface {

	public ArrayList<Departamentos> listarDep();
	
	public ArrayList<Empleados> listarEmp();
	
	public void insertaDepartamento(Departamentos d);
	
	public void insertarEmpleado(Empleados e) throws DAOException;
	
}
