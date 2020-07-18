<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<div class="heading">
			<h1>Login Form</h1>
		</div>
		<form:form action="login" modelAttribute="login" method="post">
			<table>
				<tr>
					<td><label>Username</label></td>
					<td><form:input path="username" value="" required="true" /></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><form:password path="password" value="" required="true" /></td>
				</tr>
				<tr>
					<td colspan="2"><form:button type="submit" name="login">Login</form:button></td>
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