<%
String name = (String) session.getAttribute("username");

if(name == null){
    response.sendRedirect("login.jsp");
}
%>

<!DOCTYPE html>
<html>
<head>
<title>About</title>
</head>

<body>

<h2>About Page</h2>

Hello <%= session.getAttribute("username") %>

<p>This is a session tracking example using HttpSession.</p>

<a href="home.jsp">Home</a>
<a href="logout.jsp">Logout</a>

</body>
</html>