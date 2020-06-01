<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateVendor" method="post">
		<pre>

	<div class="container" style="background-color: #f1f1f1">
		<label for="id"><b>Id</b></label>
		<input type="text" placeholder="Enter ID" name="id" required  value ="${vendor.id }"/>
		<label for="code"><b>Code</b></label>
		<input type="text" name="code" placeholder="Enter Code" value ="${vendor.code }"/>
		<label for="name"><b>Code</b></label>
		<input type="text" name="name" placeholder="Enter Name" value ="${vendor.name }" />

		Contract <input type="radio" name="type" value="Contract" value ='Contract' ${vendor.type }=='Contact'?'checked':''/>
		Regular <input type="radio" name="type" value="Regular" value ='Regular' ${vendor.type }=='Regular'?'checked':''/> 
		
		<label for="email"><b>Email</b></label>
		<input type="email" name="email" placeholder="Enter Email" value ="${vendor.email }"/>
		
		<label for="phone"><b>Phone</b></label>
		<input type="text" name="phone" placeholder="Enter Phone" value ="${vendor.phone }"/>
		
		<label for="address"><b>Address</b></label>
		<textarea name="address" rows="9" cols="70"
					placeholder="Enter Address">${vendor.address } </textarea>  
	
		<button type="submit">Save</button>
	</div>


	
	</pre>
	</form>
	${msg }
	<a href="displayVendors">View All</a>
</body>
</html>