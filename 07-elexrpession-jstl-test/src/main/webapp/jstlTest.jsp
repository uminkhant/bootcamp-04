<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello JSTL</h3>
	<c:set var="nam" value="sithu" scope="session"></c:set>
	<c:set var="obj" value="object test" scope="session"></c:set>

	<c:if test="${!empty nam }">
		<c:out value="${nam }"></c:out>
		
	</c:if>
	<br />
	
	<c:if test="${! empty obj }">
	
		<c:out value="object is = ${obj } "></c:out>
	</c:if>
	
	 
</body>
</html>