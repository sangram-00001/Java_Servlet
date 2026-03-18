<%
String name = request.getParameter("name");
String email = request.getParameter("email");

if(name != null && email != null){

    session.setAttribute("username", name);
    session.setAttribute("useremail", email);
}
%>

<!DOCTYPE html>
<html>
<head>
<title>Home</title>
</head>

<body>

<h2>Welcome <%= session.getAttribute("username") %></h2>

<p>Email: <%= session.getAttribute("useremail") %></p>

<a href="profile.jsp">Go to Profile</a><br>
<a href="about.jsp">About Page</a><br>
<a href="logout.jsp">Logout</a>

</body>
</html>