package Servicios;

import java.util.ArrayList;

import Infraestructuras.DAOException;
import Infraestructuras.Departamentos;
import Infraestructuras.Empleados;
import Persistencia.DatabaseDAOInterface;

public class DBService implements DBServiceInterface{

	private DatabaseDAOInterface daoInterface;
	
	public DBService(DatabaseDAOInterface dao){
		this.daoInterface = dao;
	}
	
	public ArrayList<Departamentos> listarDep(){
		return daoInterface.listarDep();
	}
	
	public ArrayList<Empleados> listarEmp(){
		return daoInterface.listarEmp();
	}
	
	public void insertaDepartamento(Departamentos d){
		daoInterface.insertaDepartamento(d);
	}
	
	public void insertarEmpleado(Empleados e) throws DAOException{
		daoInterface.insertarEmpleado(e);
	}
}
