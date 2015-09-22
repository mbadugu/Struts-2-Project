<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Using AJAX</title>
<script src="jquery-2.js"></script>
         <script type="text/javascript">
             function doAjaxPost() {
            	// get the form values
            	 var id = $('#id').val();
                 var name = $('#name').val();
                 var description = $('#description').val();
                 var price = $('#price').val();
                 var submit = $('#submit').val();
                 
                 $.ajax({
                     type: "POST",
                     url: "http://http://localhost:8089/Structs2Proj/populateProduct.action",
                     data:
                     		"submit=" + submit,
                     success: function(response){
                     // we have the response
                     $('#info').html(response);
                 },
                 error: function(e){
                     alert('Error: ' + e);
                 }
             });
         }
     </script>      




</head>
<body>
	<s:form action="editRecord">
				
				
				<s:textfield label="ProductId" id="id" name="id" value="%{populateProduct.id}"></s:textfield>
				<s:textfield label="ProductName" id="name" name="name" value="%{populateProduct.name}"></s:textfield>
				<s:textfield label="ProductDescription" id="description"  name="description" value="%{populateProduct.description}"></s:textfield>
				<s:textfield label="ProductPrice" id="price" name="price" value="%{populateProduct.price}"></s:textfield>
				<s:submit id="submit" value="SUBMIT" ></s:submit>
	</s:form>
	 <div id="info" style="color: green;"></div>
</body>
</html>