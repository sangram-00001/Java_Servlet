<%@ page language="java" %>

<html>
<body>

<form method="post">
Number 1: <input type="text" name="num1"><br>
Number 2: <input type="text" name="num2"><br>
<input type="submit" value="Add">
</form>

<%
String n1 = request.getParameter("num1");
String n2 = request.getParameter("num2");

if(n1 != null && n2 != null){

int a = Integer.parseInt(n1);
int b = Integer.parseInt(n2);
int sum = a + b;
%>

Result = <%= sum %>

<%
}
%>

</body>
</html>