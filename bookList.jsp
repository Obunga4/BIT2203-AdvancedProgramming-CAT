<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Library Books</title>
</head>
<body>
<h2>All Library Books</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Availability</th>
    </tr>

    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.available ? "Available" : "Borrowed"}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>