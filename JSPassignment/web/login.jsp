<%@ page language="java" %>

<%
String username = request.getParameter("username");

if(username != null){
session.setAttribute("user", username);
}
%>

<html>
<body>

<form method="post">
Enter Username:
<input type="text" name="username">
<input type="submit" value="Login">
</form>

<%
String user = (String)session.getAttribute("user");

if(user != null){
%>

<h3>Welcome <%= user %></h3>

<%
}
%>

</body>
</html>