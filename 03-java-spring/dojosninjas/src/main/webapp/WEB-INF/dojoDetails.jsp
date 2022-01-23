<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Details</title>
</head>
<body>
<h1><c:out value="${dojo.name}"/> Location Ninjas</h1>
<table>
<tr>
<th>First Name:</th>
<th>Last Name:</th>
<th>Age:</th>
<tr>
<c:forEach items="${dojo.ninjas }" var=ninja>
<td><c:out value="${ninja.firstname}"/></td>
<td><c:out value="${ninja.lastname}"/></td>
<td><c:out value="${ninja.age}"/></td>
</c:forEach>
</tr>
</table>
</body>
</html>