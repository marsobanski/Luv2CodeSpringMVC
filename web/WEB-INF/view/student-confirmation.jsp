<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 01/02/2022
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
    Student ${student.firstName} ${student.lastName} from ${student.country} is confirmed<br>
<%--    Country from properties: ${student.countryPropertie}<br>--%>
    Favorite language: ${student.favoriteLanguage} <br>
    Operating on:
    <ul>
        <c:forEach var="system" items="${student.operatingSystems}">
            <li>
                ${system}
            </li>
        </c:forEach>
    </ul>
</body>
</html>
