<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="struts" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
		<h2 align="center">Login page</h2>

		<struts:form action="loginProcess">

			<struts:textfield label="Username"  name="username"></struts:textfield>
			<struts:password label="Password"  name="password"></struts:password>

			<struts:submit value="LOGIN"></struts:submit>

		</struts:form>

</body>
</html>