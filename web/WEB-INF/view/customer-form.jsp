<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 05.04.2022
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer form</title>
    <style>
        .error {color: red}
    </style>
</head>
<body>
    <form:form action="processForm" modelAttribute="customer">
        First name: <form:input path="firstName"/>
        <form:errors path="firstName" cssClass="error"/>
        <br>
        Last name (*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br>
        Free passes (*): <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br>
        Postal code: <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>
        <br>
        Course code: <form:input path="courseCode"/>
        <form:errors path="courseCode" cssClass="error"/>
        <br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
