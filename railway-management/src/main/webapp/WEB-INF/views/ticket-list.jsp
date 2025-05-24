<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Ticket List</title>
</head>
<body>
<h2>All Tickets</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Train ID</th>
        <th>Passenger</th>
        <th>Date of Journey</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${tickets}" var="ticket">
        <tr>
            <td>${ticket.id}</td>
            <td>${ticket.trainId}</td>
            <td>${ticket.passengerName}</td>
            <td>${ticket.dateOfJourney}</td>
            <td><a href="/ticket/cancel/${ticket.id}">Cancel</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
