<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<body>
<h2>

Username is <c:out value="${user.name}" />
Password is <c:out value="${user.password}"/>
Id is  <c:out value="${user.id}"/>

</h2>

</body>
</html>