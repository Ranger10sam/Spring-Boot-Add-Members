<%@page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hi ${member.name}!</title>
</head>
<body>
<h2>${member.name} is successfully added as a member!</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Country</th>
    </tr>
    </thead>
    <tbody>
        <tr>
            <td>${member.id}</td>
            <td>${member.name}</td>
            <td>${member.country}</td>
        </tr>
    </tbody>
</table>
</body>
</html>