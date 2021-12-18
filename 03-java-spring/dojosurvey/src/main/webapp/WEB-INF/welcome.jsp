<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey</title>
</head>
<body>
<h2>Here Are Your Results!</h2>
 Name: <c:out value="${firstName}"/> 
 Email: <c:out value="${email}"/> 
 Program: <c:out value="${program}"/>
</body>
</html>