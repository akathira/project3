<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>success page</title>
</head>
<body>
	<h1>From success page</h1>
	<h2> List of product</h2>
	<c:forEach var="product" items="${catalog}">
	      ${product}
	      </c:forEach>
</body>
</html>

