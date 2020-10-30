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
		<h1>Ingreso al sistema</h1>
		<s:form action="login" theme="bootstrap">
			<s:textfield label="Usuario" name="cliente.email" />
			<s:textfield type="password" label="Password" name="cliente.password" />
			<s:submit value="Ingresar" cssClass="btn btn-success" />
		</s:form>
		<br>
		<s:actionerror theme="bootstrap" />
		<s:actionmessage theme="bootstrap" />
		<!-- <s:property value="rptLogin" /> -->
		<s:if test="rptLogin == 'error'">Si es usuario nuevo ingrese <a
				href="registro.jsp">aqui</a>
		</s:if>
	</div>


</body>
</html>
