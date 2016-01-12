<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALTA DE DEPARTAMENTO</title>
</head>


<!--  Formulario de entrada de datos e inserción en el JAVABean Departamento -->

<jsp:useBean id="depart" scope="request" class="ejemplo.Departamentos"></jsp:useBean>
<jsp:setProperty property="*" name="depart"/>
<%	if(request.getParameter("deptno")!=null) {   %>
		<jsp:forward page="/controlador?accion=insertar"/>
	<% } %>
	






<body>


<center> <h2> ENTRADA DE DATOS DE DEPARTAMENTOS</h2>
<br/>
<form method="post">
	<p> Número de departamento: <input name="deptno" type="text" size="5"> </p>
	<p> Nombre: <input name="dnombre" type="text" size="15"> </p>
	<p> Localidad: <input name="loc" type="text" size="15"> </p>
	<input type="submit" name="insertar" value="Insertar departamento.">
	<input type="reset" name="cancelar" value="Cancelar Entrada" >

</form>


</center>


</body>
</html>