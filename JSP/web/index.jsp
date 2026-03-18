<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title>Simple JSP Calculator</title>
</head>

<body>

<h2>Calculator</h2>

<form action="calculate.jsp" method="post">

    Number 1:
    <input type="number" name="num1" required>
    <br><br>

    Number 2:
    <input type="number" name="num2" required>
    <br><br>

    Operation:
    <select name="operation">
        <option value="add">Addition</option>
        <option value="sub">Subtraction</option>
        <option value="mul">Multiplication</option>
        <option value="div">Division</option>
    </select>

    <br><br>

    <input type="submit" value="Calculate">

</form>

</body>
</html>