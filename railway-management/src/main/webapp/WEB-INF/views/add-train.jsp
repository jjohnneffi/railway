<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Add Train</title>
</head>
<body>
<h2>Add Train</h2>
<form action="/train/add" method="post">
    Name: <input type="text" name="name"/><br/>
    Source: <input type="text" name="source"/><br/>
    Destination: <input type="text" name="destination"/><br/>
    Departure Time: <input type="text" name="departureTime"/><br/>
    Arrival Time: <input type="text" name="arrivalTime"/><br/>
    <input type="submit" value="Add Train"/>
</form>
</body>
</html>
