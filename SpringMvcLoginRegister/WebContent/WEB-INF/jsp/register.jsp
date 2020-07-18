<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="heading">
			<h1>Registeration</h1>
		</div>
		<form:form action="register" modelAttribute="user" method="post">
			<table>
				<tr>
					<td><label>Name</label></td>
					<td><form:input path="name" required="true" value="" /></td>
				</tr>
				<tr>
					<td><label>User Name</label></td>
					<td><form:input path="username" required="true" value="" /></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><form:password path="password" required="true" value="" /></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><form:input type="email" path="email" required="true"
							value="" /></td>
				</tr>
				<tr>
					<td colspan="2"><form:button type="submit" name="register">Register</form:button></td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value="/" />">
							<button type="button" name="register">Home</button>
						</a>
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>