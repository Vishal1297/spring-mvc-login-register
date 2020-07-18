<%@ page language="java" contentType="text/html; charset=UTF-8" isErrorPage="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<div class="heading">
			<h1>${message}</h1>
		</div>
		<div class="option">
			<a href="<c:url value="${link}" />">
				<button type="button">Retry</button>
			</a>
		</div>
	</div>
</body>
</html>