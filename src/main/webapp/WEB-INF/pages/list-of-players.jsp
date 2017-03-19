<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Login</title>
</head>
<body>
<p>Here you can see the list of the players, edit them, remove or update.</p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="10%">id</th><th width="15%">name</th><th width="15%">age</th><th width="15%">specialization</th><th width="15%">centuries</th><th width="15%">totalruns</th><th width="10%">actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="players" items="${players}">
<tr>
    <td>${players.id}</td>
    <td>${players.name}</td>
    <td>${players.age}</td>
     <td>${players.specialization}</td>
      <td>${players.centuries}</td>
       <td>${players.totalruns}</td>
    <td>
     <a href="${pageContext.request.contextPath}/players/edit/${players.id}.html">Edit</a></br>
     <a href="${pageContext.request.contextPath}/players/delete/${players.id}.html">Delete</a></br>
    </td>
</tr>
</c:forEach>
</tbody>
</table>
 
</body>
</html>

<p>
<a href="${pageContext.request.contextPath}/index.html">Home Page</a>

</p>

</table>

</body>
