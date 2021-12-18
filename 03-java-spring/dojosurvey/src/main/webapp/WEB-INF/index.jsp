<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey</title>
</head>
<body>
<h2>Welcome to the Coding Dojo Survey!</h2>
<form action="/welcome" method="POST">
<p> Name: <input type="text" name="firstName"> </p>
<p> Email: <input type="text" name="email"> </p>
<p> Program:
	<select name= "program">
	<option value="java">Java</option>
	<option value="mern">Mern</option>
	<option value="Python">Python</option>
	
	</select> 
	</p>
<p><button>Submit</button></p>


</form>

</body>
</html>