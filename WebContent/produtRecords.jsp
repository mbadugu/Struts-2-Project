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
		
	<h2 align="center">Product Records</h2>
			
	<s:form action="allProducts">
		
		<table border=2 align="center">
			 <s:property value="#session.userid"/>	 
			<tr><th>ProductName</th><th>ProductDescription</th><th>ProductPrice</th><th>ProductId</th></tr>
			
			<s:iterator value="productsList" id="productHib">
				<tr > 
					<td><s:property value="name"/></td>
					<td><s:property value="description"/></td>
					<td><s:property value="price"/></td>
					<td><s:property value="id"/> 
						<s:url id="edit" action="populateProduct">
							<s:param value="#productHib.id" name="id"/>
							<s:param value="#productHib.price" name="price"/>
							<s:param value="#productHib.description" name="description"/>
							<s:param value="#productHib.name" name="name"/>
						</s:url> 
						<s:a href="%{edit}">Edit</s:a>
						&nbsp;|&nbsp;
						<s:url id="delete" action="productDeleteUpdate">
							<s:param value="#productHib.id" name="id"/>
						</s:url> 
						<s:a href="%{delete}">Delete</s:a>
					</td>
				</tr>
				
			</s:iterator>
					
		</table> 
				 
 	</s:form>
 	<div align="center">
		<a href="addProduct.jsp" >
			<button>Add Product</button>
		</a>
		</div>
 	
 	
</body>
</html>
