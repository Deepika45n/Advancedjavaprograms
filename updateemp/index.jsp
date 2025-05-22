<%-- 8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively--%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>
</head>
<body>
    <h2>Update Employee Details</h2>

    <form action="update.jsp" method="get">
        Employee Number: <input type="number" name="empno" required><br><br>
        <input type="submit" value="Fetch Employee Details">
    </form>
</body>
</html>
