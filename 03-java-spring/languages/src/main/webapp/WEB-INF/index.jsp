<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages!</title>
</head>
<body>
<h2>Welcome to Languages!</h2>
<hr>
<Table border=1>
<thead>

<tr>
<td> Name </td>
<td> Creator </td>
<td> Version </td>
<td> Action </td>
</tr>

</thead>
<tbody>
<c:forEach items="${allLanguages}" var="lang">
<tr>
<td> <a href="/show/${lang.id}">${lang.name}</a></td>
<td>${lang.creator}</td>
<td>${lang.currentVersion}</td>
<td><a href="/edit/${lang.id}">Edit</a> | <a href="/delete/${lang.id}">Delete</a></td>
</c:forEach>
</tr>
</tbody>
</Table>

<h3>Create New Language</h3>
<form:form action="/" method="POST" modelAttribute="language">
<p>
<form:label path="name">Name:</form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p>
<p>
<form:label path="creator">Creator:</form:label>
<form:errors path="creator"/>
<form:input path="creator"/>
</p>
<p>
<form:label path="currentVersion">Current Version:</form:label>
<form:errors path="currentVersion"/>
<form:input path="currentVersion"/>
</p>


<button>Submit New Language</button>
</form:form>

</body>
</html> 
