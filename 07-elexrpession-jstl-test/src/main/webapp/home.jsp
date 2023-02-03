<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<title>Home</title>
</head>
<body>

	<div class="container mt-2">
		<form action="home" class="form" method="post">
			<div class="form-group">
				<label for=""></label><input type="text" class="form-control mb-2"
					name="name" />
			</div>
			<div class="form-group">
				<label for=""></label><input type="number" class="form-control mb-2"
					name="age" />
			</div>
			<button class="btn btn-outline-primary">Send</button>
		</form>

		<br />

		<c:choose>
			<c:when test="${persons ne null }">

				<table class="table table-stripped">
					<tr>
						<th>No</th>
						<th>Name</th>
						<th>Age</th>
					</tr>

					<c:forEach var="p" items="${persons }" varStatus="l">
						<tr>
							<td>${l.index+1 }</td>
							<td>${p.getName() }</td>
							<td>${p.getAge() }</td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<p class="text-primary">There is no persons !</p>
			</c:otherwise>
		</c:choose>

	</div>
</body>
</html>