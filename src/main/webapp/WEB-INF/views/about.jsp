<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>about-page</title>
</head>
<body>
<h1>about page</h1>
<h1>about page called by home controller</h1>
<%
String name =(String)request.getAttribute("name");

%>
<%=
name
%>
</body>
</html>