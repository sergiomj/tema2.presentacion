

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejemplo.Departamentos;

/**
 * Servlet implementation class Controlador
 */
@WebServlet(description = "Controlador de departamentos", urlPatterns = { "/controlador" })
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String opString= request.getParameter("accion");
			
			if (opString.equals("alta")) response.sendRedirect("alta.jsp");
			if (opString.equals("listado")) {
				OperacionesBD operacionesBD=new OperacionesBD();
				ArrayList<Departamentos> lista=operacionesBD.listarDep();
				request.setAttribute("departamentos", lista);
				RequestDispatcher rd=request.getRequestDispatcher("/listado.jsp");
				rd.forward(request, response);
			}
			
			if (opString.equals("insertar")) {
				
				Departamentos dep=(Departamentos)request.getAttribute("depart");
				OperacionesBD operacionesBD=new OperacionesBD();
				operacionesBD.insertaDepartmaneto(dep);
				response.sendRedirect("index.jsp");
				
			}
			
	}

}
