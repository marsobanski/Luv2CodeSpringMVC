<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 01/02/2022
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br>
        Last name: <form:input path="lastName"/>
        <br>
        Country:
        <form:select path="country">
<%--            <form:option value="Brazil" label="Brazil"/>--%>
<%--            <form:option value="France" label="France"/>--%>
<%--            <form:option value="Germany" label="Germany"/>--%>
<%--            <form:option value="India" label="India"/>--%>
            <form:options items="${student.countryOptions}"/>
        </form:select>
        <br>
<%--        zaczytywanie z countries.properties--%>
<%--        <form:select path="countryPropertie">--%>
<%--            <form:options items="${countryOptionsProperties}"/>--%>
<%--        </form:select>--%>
        <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
        <br>
        <form:checkboxes path="operatingSystems" items="${student.operatingSystemsOptions}"/>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
