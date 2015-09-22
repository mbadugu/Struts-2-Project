<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
		<h2 align="center"><s:text name="register.header"></s:text></h2>

		<s:form action="registerProcess">

			<s:textfield key="register.uname"  name="userName"></s:textfield>
			<s:textfield key="register.fname"  name="firstName"></s:textfield>
			<s:textfield key="register.lname"  name="lastName"></s:textfield>
			<s:textfield key="register.email"  name="email"></s:textfield>
			<s:textfield key="register.phone"  name="phone"></s:textfield>

			<s:submit key="register.submit"></s:submit>

		</s:form>

</body>
</html>