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


	<h3>IF / Out</h3>

	<c:if test="${!empty nam }">
		<c:out value="${nam }"></c:out>

	</c:if>
	<br />

	<c:if test="${! empty obj }">

		<c:out value="object is = ${obj } "></c:out>
	</c:if>

	<h3>For Each Test</h3>

	<c:forEach var="n" items="${nameList }" varStatus="l">

		<c:out value="${l.index+1 } Name :${n }"></c:out>
		<br />
	</c:forEach>

	<h3>c choose /c when /c otherwise</h3>

	<c:choose>
		<c:when test="${person ne null }">
				<p>${person.getId()} : ${person.getName() }</p>
		</c:when>
		<c:otherwise>
			<p>There is no person !</p>
		</c:otherwise>
	</c:choose>

</body>





</html>