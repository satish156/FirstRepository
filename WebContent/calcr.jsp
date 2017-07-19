<%@page import="MyFirstWeb.maths"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><b>welcome to my world</b></h1>

<h2>i am sick now :(</h2>

<h3>the addition of numbers are </h3>
<% 
  maths obj = (maths)request.getAttribute("obj"); 


%>

<%= obj.k 
%>

</body>
</html>