<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Add player page</title>
</head>
<body>
<h1>Add player page</h1>
<p>Here you can add a new player.</p>
<form:form method="POST" commandName="players" action="${pageContext.request.contextPath}/players/add.html">
<table>
<tbody>
    <tr>
        <td>Name:</td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td>Age:</td>
        <td><form:input path="age" /></td>
    </tr>
    <tr>
        <td>Specialization:</td>
        <td><form:input path="specialization" /></td>
    </tr>
    <tr>
        <td>Centuries:</td>
        <td><form:input path="centuries" /></td>
    </tr>
    <tr>
        <td>Total Runs:</td>
        <td><form:input path="totalruns" /></td>
    </tr>
    <tr>
        <td><input type="submit" value="Add" /></td>
        <td></td>
    </tr>
</tbody>
</table>
</form:form>
 
<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>