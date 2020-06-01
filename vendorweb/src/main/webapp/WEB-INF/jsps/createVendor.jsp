<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="saveVen" method="post">
		<pre>

	<div class="container" style="background-color: #f1f1f1">
		<label for="id"><b>Id</b></label>
		<input type="text" placeholder="Enter ID" name="id" required />
		<label for="code"><b>Code</b></label>
		<input type="text" name="code" placeholder="Enter Code" />
		<label for="name"><b>Code</b></label>
		<input type="text" name="name" placeholder="Enter Name" />

		Contract <input type="radio" name="type" value="Contract" />
		Regular <input type="radio" name="type" value="Regular" /> 
		
		<label for="email"><b>Email</b></label>
		<input type="email" name="email" placeholder="Enter Email" />
		
		<label for="phone"><b>Phone</b></label>
		<input type="text" name="phone" placeholder="Enter Phone" />
		
		<label for="address"><b>Address</b></label>
		<textarea name="address" rows="9" cols="70"
					placeholder="Enter Address"> </textarea>  
	
		<button type="submit">Save</button>
	</div>


	
	</pre>
	</form>
	${msg }
	<a href="displayVendors">View All</a>
</body>
</html>