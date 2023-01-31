<%@page import="com.jdc.mkt.Counter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
		<h3>Scope Test</h3>
		<ul>
			<li>
				<p class="txt-primary fs-20">


					<% Counter c1 = (Counter)request.getAttribute("counter"); %>
					
					Request Scope :
					<% if ( c1 != null) { %>
							
						<%= c1.getCount() %>
							
					<% }else{ %>
						0
					<% }%>
					
					
				</p>
			</li>
			<li>
				<p class="txt-primary fs-20">
				
				<% Counter c2 = (Counter)session.getAttribute("counter"); %>
					
					Session Scope :
					<% if ( c2 != null) { %>
							
						<%= c2.getCount() %>
							
					<% }else{ %>
						0
					<% }%>
				
				</p>
			</li>
			<li>
				<p class="txt-primary fs-20">
				
				<% Counter c3 = (Counter)application.getAttribute("counter"); %>
					
					Application Scope :
					<% if ( c3 != null) { %>
							
						<%= c3.getCount() %>
							
					<% }else{ %>
						0
					<% }%>
				</p>
			</li>
			<li><a href="sendValue" class="btn btn-outline-danger">Send
					Value</a></li>
		</ul>



	</div>
</body>
</html>