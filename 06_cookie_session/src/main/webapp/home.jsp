<%@page import="com.jdc.mkt.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Home</h3>

<h3>Cookies </h3><br />

<% Cookie[] cks = request.getCookies(); %>

<% for(Cookie ck : cks){ %>


	<%= ck.getName()  %>: <%= ck.getValue() %>
	<%= ck.getAttribute("user") %> : <%= ck.getAttribute("age") %>
	
<%} %>


</body>
</html>