<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Train List</title>
</head>
<body>
<h2>All Trains</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Source</th>
        <th>Destination</th>
        <th>Departure</th>
        <th>Arrival</th>
    </tr>
    <c:forEach items="${trains}" var="train">
        <tr>
            <td>${train.id}</td>
            <td>${train.name}</td>
            <td>${train.source}</td>
            <td>${train.destination}</td>
            <td>${train.departureTime}</td>
            <td>${train.arrivalTime}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
