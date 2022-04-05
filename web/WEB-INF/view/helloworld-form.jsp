<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 01/02/2022
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World Form</title>
</head>
<body>
    ProcessForm:
    <br>
    <form action="processForm" method="get">
        <input type="text" name="studentName" placeholder="What's your name?">
        <br>
        <input type="submit">
    </form>
    <br><br>

    ProcessFormV2:
    <form action="processFormV2" method="get">
        <input type="text" name="dudeName" placeholder="What you shout?">
        <br>
        <input type="submit">
    </form>
    <br><br>

    ProcessFormV3:
    <form action="processFormV3" method="get">
        <input type="text" name="personName" placeholder="What you say?">
        <br>
        <input type="submit">
    </form>
</body>
</html>
