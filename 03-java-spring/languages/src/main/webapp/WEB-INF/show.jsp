<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details:</title>
</head>
<body>
<a href="/">Dashboard</a>


<c:out value="${thisLang.name}"/>
<c:out value="${thisLang.creator}"/>
<c:out value="${thisLang.currentVersion}"/>

<p><a href="/edit/${thisLang.id}">Edit</a>
<form method="POST" action="/delete/${thisLang.id}">
<input type="hidden" name="_method" value="delete">
<button>Delete Language</button>
 </form>

</body>
</html>