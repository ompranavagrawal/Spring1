<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:form action="insert.obj" modelAttribute="emp">
	Enter Employee no:
	<f:input path="empno"/>  <f:errors path="empno"/> <br/>
	Enter Employee Name:
	<f:input path="empname"/>  <f:errors path="empname"/> <br/>
	Enter Employee Age:
	<f:input path="age"/>  <f:errors path="age"/> <br/>
	<input type="submit" value="Register"/>
</f:form>
</body>
</html>