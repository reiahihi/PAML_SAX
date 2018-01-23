<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: ${PACKAGE_NAME}
// *****        ******        ******    ***** Project: PAML_SAX
// *****    *    ****    *    ******    ***** Date: 23-Jan-18
// *****    **    **    **    ******    ***** Time: 09:40
// *****    ***        ***    ******    ***** Name: ${NAME}
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form action="ListServlet" method="post">
    <select id="check" name="check">
        <option value="1">Search by id</option>
        <option value="2">Search by name</option>
    </select>
    <input type="text" id="iText" name="iText" />
    <input type="submit" value="search">
</form>

<table border="1" cellspacing="0" cellpadding="5">

    <caption><h1>List of Employee</h1></caption>

    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
        <td>gender</td>
        <td>role</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="e">
        <tr>
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td>${e.age}</td>
            <td>${e.gender}</td>
            <td>${e.role}</td>

        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
