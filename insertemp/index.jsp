<%--9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and Generate
the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP
to get the field and display the results respectively --%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Entry</title>
</head>
<body>
    <h2>Enter Employee Details</h2>

    <form action="insertEmployee.jsp" method="POST">
        <label for="empno">Employee Number (Emp_NO):</label><br>
        <input type="text" id="empno" name="empno" required><br><br>

        <label for="empname">Employee Name (Emp_Name):</label><br>
        <input type="text" id="empname" name="empname" required><br><br>

        <label for="basicsalary">Basic Salary (Basicsalary):</label><br>
        <input type="text" id="basicsalary" name="basicsalary" required><br><br>

        <input type="submit" value="Insert Employee">
    </form>

    <hr>

    <a href="report.jsp">View Employee Report</a>
</body>
</html>
