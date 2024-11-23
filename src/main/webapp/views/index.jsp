<%@page language="java" %>
<html>
<head title="Add Your Members"></head>
<body>
    <h2>Enter the details of the member to add in the database.</h2>
    <form action="addMembers">
        <label for="id">Enter id:</label>
        <input id="id" name="id"><br><br>
        <label for="name">Enter the Name:</label>
        <input id="name" name="name"><br><br>
        <label for="country">Enter the Country:</label>
        <input id="country" name="country"><br><br>
        <input type="submit" value="Submit">
    </form>
    <!-- View All Button -->
    <form action="viewAll">
        <button type="submit">View All Members</button>
    </form>
</body>
</html>