<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Employee Record</title>
</head>
<body>
    <h2>Delete Employee Record</h2>
    
    <form action="deleteEmployee.jsp" method="POST">
        <label for="empname">Enter Employee Name (starts with 'S'):</label><br>
        <input type="text" id="empname" name="empname" required><br><br>
        <input type="submit" value="Delete Employee">
    </form>

    <hr>

    <a href="report.jsp">View Employee Report</a>
</body>
</html>
<%-- Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively--%>