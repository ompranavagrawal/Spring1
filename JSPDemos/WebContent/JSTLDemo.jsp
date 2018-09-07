<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="company" value="Capgemini"></c:set>
<c:out value="${company} "></c:out>
<c:forEach begin="1" end="10" var="num" step="4">
<c:out value="${num} "></c:out>
</c:forEach>
<h1>Welcome ... ${userName}</h1>
</body>
</html>