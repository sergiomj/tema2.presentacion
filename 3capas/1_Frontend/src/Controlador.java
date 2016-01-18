
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Infraestructuras.DAOException;
import Infraestructuras.Departamentos;
import Infraestructuras.Empleados;
import Persistencia.DatabaseDAO;
import Servicios.DBService;
import Servicios.DBServiceInterface;

/**
 * Servlet implementation class Controlador
 */
@WebServlet(description = "Controlador de departamentos", urlPatterns = { "/controlador" })
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DBServiceInterface dbservice;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String opString = request.getParameter("accion");

		// DEPARTAMENTOS
		if (opString.equals("alta"))
			response.sendRedirect("alta.jsp");
		if (opString.equals("listado")) {

			dbservice = new DBService(new DatabaseDAO());

			ArrayList<Departamentos> lista = dbservice.listarDep();
			request.setAttribute("departamentos", lista);
			RequestDispatcher rd = request.getRequestDispatcher("/listado.jsp");
			rd.forward(request, response);
		}

		if (opString.equals("insertar")) {

			Departamentos dep = (Departamentos) request.getAttribute("depart");
			dbservice = new DBService(new DatabaseDAO());
			dbservice.insertaDepartamento(dep);
			response.sendRedirect("index.jsp");

		}

		// EMPLEADOS
		if (opString.equals("altaemp"))
			response.sendRedirect("altaempleado.jsp");
		if (opString.equals("listadoemp")) {

			dbservice = new DBService(new DatabaseDAO());

			ArrayList<Empleados> lista = dbservice.listarEmp();
			request.setAttribute("empleados", lista);
			RequestDispatcher rd = request.getRequestDispatcher("/listaempleados.jsp");
			rd.forward(request, response);
		}
		if (opString.equals("insertaremp")) {
			Empleados emp = (Empleados) request.getAttribute("emple");
			dbservice = new DBService(new DatabaseDAO());
			try {
				dbservice.insertarEmpleado(emp);
			} catch (DAOException e) {
				e.printStackTrace();
			}
			response.sendRedirect("index.jsp");
		}

	}

}
