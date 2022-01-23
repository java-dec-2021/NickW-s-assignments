<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create A Dojo!</title>
</head>
<body>
<h1>Create New Dojo</h1>
<form:form method="POST" action="/dojo/createDojo" modelAttribute="dojo">
<p>
<form:label path="name">Name:</form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p>

<button>Create Dojo</button>
</form:form>
</body>
</html>