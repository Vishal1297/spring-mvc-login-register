<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="heading">
			<h1>What You Want To Do ?</h1>
		</div>
		<div class="option">
			<a href="showLogin">
				<button type="button">Login</button>
			</a>
		</div>

		<div class="option">
			<a href="showRegister">
				<button type="button">Register</button>
			</a>
		</div>
	</div>
</body>
</html>