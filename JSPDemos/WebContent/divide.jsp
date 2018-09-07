<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%if(request.getParameter("divBtn")!=null);
	String fn=request.getParameter("firstNum");
	String sn= request.getParameter("secNum");
	int numr=Integer.parseInt(fn);
	int denom=Integer.parseInt(sn);
	
	float res=numr/denom;
	out.println("Division result "+res);
	%>
</body>
</html>