<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 05.04.2022
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer confirmation</title>
</head>
<body>
    Customer ${customer.firstName} ${customer.lastName} is confirmed.
    <br>
    Free passes: ${customer.freePasses}
    <br>
    Postal code: ${customer.postalCode}
    <br>
    Course code: ${customer.courseCode}
</body>
</html>
