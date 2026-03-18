<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<html>
<head>
<title>Result</title>
</head>

<body>

<h2>Result</h2>

<%
double r = (Double)request.getAttribute("res");
%>

Result = <%= r %>

<br><br>

<a href="index.jsp">Back</a>

</body>
</html>