<%@ page language="java" %>

<html>
<body>

<form method="post">
Name: <input type="text" name="name"><br>
Email: <input type="text" name="email"><br>
<input type="submit" value="Submit">
</form>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");

if(name != null && email != null){
%>

<h3>Entered Details</h3>
Name: <%= name %> <br>
Email: <%= email %>

<%
}
%>

</body>
</html>