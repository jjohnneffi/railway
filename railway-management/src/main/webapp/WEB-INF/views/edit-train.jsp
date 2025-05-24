<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Edit Train</title>
</head>
<body>
<h2>Edit Train</h2>
<form action="/train/update" method="post">
    <input type="hidden" name="id" value="${train.id}"/>

    <label for="name">Train Name:</label>
    <input type="text" name="name" value="${train.name}" required/><br/>

    <label for="source">Source:</label>
    <input type="text" name="source" value="${train.source}" required/><br/>

    <label for="destination">Destination:</label>
    <input type="text" name="destination" value="${train.destination}" required/><br/>

    <button type="submit">Update Train</button>
</form>
</body>
</html>
