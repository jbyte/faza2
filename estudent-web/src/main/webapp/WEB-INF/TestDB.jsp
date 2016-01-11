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
    Id: ${u.id} Name: ${u.ime} LastName: ${u.priimek} <br />
	</c:forEach>

	<h1>Add New</h1>
	<form method="post" action="addUser">
		Name: <input type="text" name="ime" />
		LastName: <input type="text" name="priimek" />
		<button>Add</button>
	</form>
</body>
</html>