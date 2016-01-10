<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>All Users</h1>
	<c:forEach var="u" items="${users}">
    Id: ${u.id} Name: ${u.name} LastName: ${u.lastname} <br />
	</c:forEach>

	<h1>Add New</h1>
	<form method="post" action="addUser">
		Name: <input type="text" name="name" />
		LastName: <input type="text" name="lastname" />
		<button>Add</button>
	</form>
</body>
</html>