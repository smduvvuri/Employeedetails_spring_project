<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<body>
<form method="get" action="userdetails">
<div>
<span> Id</span>
<input Id="id" type="number" />

</div>
<div>
<span> Username</span>
<input name="username" type="text" />

</div>
<div>
<span> Password</span>

<input name="password" type="password"/>
</div>

<div>
<input type="submit" value="Submit" />
</div>
</form>
</body>
</html>