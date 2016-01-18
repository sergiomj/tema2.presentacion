<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ALTA DE EMPLEADO</title>
</head>

<jsp:useBean id="emple" scope="request"
	class="Infraestructuras.Empleados"></jsp:useBean>
<jsp:setProperty property="*" name="emple" />
<%
	if (request.getParameter("empno") != null) {
%>
<jsp:forward page="/controlador?accion=insertaremp" />
<%
	}
%>


<body>



	<center>
		<h2>ENTRADA DE DATOS DE EMPLEADOS</h2>
		<br />
		<form method="post">
			<p>
				Número de empleado: <input name="empno" type="number" size="10" placeholder="Numérico" maxlength="4">
			</p>
			<p>
				Apellido: <input name="apellido" type="text" size="30" maxlength="10">
			</p>
			<p>
				Oficio: <input name="oficio" type="text" size="30" maxlength="10">
			</p>
			<p>
				Director: <input name="dir" type="number" size="10" placeholder="Numérico" maxlength="11">
			</p>
			<p>
				Fecha de Alta: <input name="fechaalt" type="date" placeholder="MM-dd-yyyy">
			</p>
			<p>
				Salario: <input name="salario" type="number" size="8" placeholder="Decimal(6,2)" maxlength="8">
			</p>
			<p>
				Comision: <input name="comision" type="number" size=8 placeholder="Decimal(6,2)" maxlength="8">
			</p>
			<p>
				Número de Departamento: <input name="deptno" type="number" size="10" maxlength="2" placeholder="Numérico">
			</p>
			<input type="submit" name="insertar" value="Insertar Empleado.">
			<input type="reset" name="cancelar" value="Cancelar Entrada">

		</form>
</body>
</html>