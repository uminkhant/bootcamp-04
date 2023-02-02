<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.container {
	margin-top: 2em;
	padding: 3px;
}
</style>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">

<title></title>
</head>
<body>
	<div class="container">
	<h1>Hello</h1>
		<form action="cookieTest" class="form"  method="get" >
			<div class="form-group">Name :<label for=""></label><input name="user" type="text" class="form-control" /></div>
			<div class="form-group">Age<label for=""></label><input name="age" type="text" class="form-control" /></div>
			<button class="btn btn-outline-primary">Send User</button>
		</form>
	</div>
</body>
</html>