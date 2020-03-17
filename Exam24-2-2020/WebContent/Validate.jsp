<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("Name");
int age=Integer.parseInt((request.getParameter("Age")));
if(age>=62)
{	%>
	<h1>The ticket price is:$7.00</h1>
<%	}
else if(age<=10)	
{	%>
	<h2>The ticket price is:$5.00</h2>
<%	
}
else {	%>
<h2>The ticket price is:$9.50</h2>
<%}%>
</body>
</html>