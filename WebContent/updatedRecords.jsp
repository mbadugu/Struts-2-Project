<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Page</title>
</head>
<body>
		
			<h2 align="center"> Updated Product Records</h2>
		
		
			
			<table border=2 align="center">

				<tr><th>ProductId</th><th>ProductName</th><th>ProductPrice</th><th>ProductDescription</th></tr>
				<s:iterator value="productsList" var="productHib">
					<tr>
						<td><s:property value="#productHib.id"/></td>
						<td><s:property value="#productHib.name"/></td>
						<td><s:property value="#productHib.price"/></td>
						<td><s:property value="#productHib.description"/></td>
						
						
					</tr>
 				</s:iterator>
			</table>
		
</body>
</html>