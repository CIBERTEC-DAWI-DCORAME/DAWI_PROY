<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-bootstrap-tags" prefix="sb"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sb:head />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	<div class="container">
	<h1>Registre sus datos</h1>
		<s:form action="registro" theme="bootstrap">
			<s:textfield label="Nombre" name="objUsuario.nombre" placeholder="Ingrese su nombre"/>
			<s:textfield label="Apellido" name="objUsuario.apellido" placeholder="Ingrese su apellido"/>
			<s:textfield type="email" label="Usuario" name="usuario" placeholder="Ingrese email"/>
			<s:textfield type="password" label="Contraseña" name="clave" placeholder="Ingrese su contraseña"/>
			<s:textfield type="date" label="Fecha de nacimiento" name="objUsuario.fecNac" placeholder="año/mes/dia"/>
			<s:select list="#{'-1':'Seleccione', '0':'Miraflores', '1':'Breña', '2':'San Juan de Lurigancho', '3':'Lima' }" name="sede" label="Sede"/>
			<s:submit value="Registrar" cssClass="btn btn-primary"/>
		</s:form>
		<br>
		<s:property value="rptLogin"/>
	</div>
</body>
</html>
