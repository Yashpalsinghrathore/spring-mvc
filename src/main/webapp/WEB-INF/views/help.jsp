<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>help page</title>
</head>
<body>

<%
	String name =(String) request.getAttribute("name");
	String roll =(String)request.getAttribute("roll");
%>

<h1>this is help page</h1>
<%=name+" "+roll%>

<h1>we can also get data by using jsp expresion language for that </h1>
<h1>you have to meke jspEL=false</h1>

<h1>${name},${list}</h1>

<hr>

<h1>for traverse collection or array we should use jstl because using too much java in jsp 
is not good programming practice for that add jstl dependencies and add uri

</h1>

<c:forEach var="item" items="${list}">
	
	<h1><c:out value="${item}"></c:out></h1>

</c:forEach>

	
</body>
</html>