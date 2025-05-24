<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Book Ticket</title>
</head>
<body>
<h2>Book Ticket</h2>
<form action="/ticket/book" method="post">
    Train ID: <input type="text" name="trainId"/><br/>
    Passenger Name: <input type="text" name="passengerName"/><br/>
    Date of Journey: <input type="text" name="dateOfJourney"/><br/>
    <input type="submit" value="Book Ticket"/>
</form>
</body>
</html>
