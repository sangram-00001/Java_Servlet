<%
String name = (String) session.getAttribute("username");

if(name == null){
    response.sendRedirect("login.jsp");
}
%>

<!DOCTYPE html>
<html>
<head>
<title>Profile</title>
</head>

<body>

<h2>Profile Page</h2>

Welcome <%= session.getAttribute("username") %><br>

Email: <%= session.getAttribute("useremail") %><br><br>

<a href="home.jsp">Home</a>
<a href="logout.jsp">Logout</a>

</body>
</html>