<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="ejemplo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LISTADO DE DEPARTAMENTOS</title>
</head>
<body>

<center>

<h2> LISTADO DE DEPARTAMENTOS</h2>

<table border="1">



<tr>
	<th>Departamento</th>
	<th>Nombre</th>
	<th>Localidad</th>
</tr>
<%
ArrayList<Departamentos> listadep=(ArrayList<Departamentos>) request.getAttribute("departamentos");
if (listadep!=null)
	for(int i=0;i<listadep.size();i++){
		Departamentos d=(Departamentos) listadep.get(i); %>
		<tr> <td> <%=d.getDeptno() %> </td>
			 <td> <%=d.getDnombre() %> </td>
			 <td> <%=d.getLoc() %> </td>
		</tr>
<%	} %>

</table>
<br/>
<br/>
<a href="index.jsp">Inicio</a>

</center>


</body>
</html>