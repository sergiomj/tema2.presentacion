<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="Infraestructuras.*"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LISTADO DE EMPLEADOS</title>
</head>
<body>

<center>


<h2> LISTADO DE DEPARTAMENTOS</h2>

<table border="1">



<tr>
	<th>Número de Empleado</th>
	<th>Apellido</th>
	<th>Oficio</th>
	<th>Director</th>
	<th>Fecha de Alta</th>
	<th>Salario</th>
	<th>Comision</th>
	<th>Número de Departamento</th>
</tr>
<%
ArrayList<Empleados> listaemp=(ArrayList<Empleados>) request.getAttribute("empleados");
if (listaemp!=null)
	for(int i=0;i<listaemp.size();i++){
		Empleados e=(Empleados) listaemp.get(i); %>
		<tr> <td> <%=e.getEmpno() %> </td>
			 <td> <%=e.getApellido() %> </td>
			 <td> <%=e.getOficio() %> </td>
			 <td> <%=e.getDir() %> </td>
			 <td> <%=e.getFechaalt() %> </td>
			 <td> <%=e.getSalario() %> </td>
			 <td> <%=e.getComision() %> </td>
			 <td> <%=e.getDeptno() %> </td>
		</tr>
<%	} %>

</table>
<br/>
<br/>
<a href="index.jsp">Inicio</a>

</center>

</body>
</html>