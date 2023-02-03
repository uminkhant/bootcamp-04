<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello jstl</title>
<style>

body{
	margin:0;
	padding:0;
}
.container{

	margin-top: 3rem;
	padding :3px;
}
</style>
</head>
<body>

<div class="container">
		
	<h3>Operators</h3>
	<br />
	<h4>Arithmetic </h4>
	<p>Plus : 5+3 = ${5+3 }</p>
	<p>Divided : 20 / 5 = ${20 / 5}</p>
	
	<h3>Relationals</h3>
	<p>Less than or equal : 5 is lesson than or equal to 5 = ${5 le 5 }  </p>
	
	<h3>Logical</h3>
	<p>Or : 5 is less than 10 and greater than 1 = ${5 le 10 && 5 gt 1 }</p>
	
	
	<h4>Others</h4>
	<a href="person">Get person name</a>
	
	<br />
	<h3>JSTL TEST</h3>
	<a href="jstlTest">Go to JSTL Test</a>
	
	
</div>
</body>
</html>