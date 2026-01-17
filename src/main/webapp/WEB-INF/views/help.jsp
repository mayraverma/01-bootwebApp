<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="java.time.LocalDateTime" %>  
  <%@page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help controller </title>
</head>
<body>

<%
// String str =(String)request.getAttribute("name");
// Integer id = (Integer)request.getAttribute("id"); 
// LocalDateTime localdatetime=(LocalDateTime)request.getAttribute("time");
 %>

<%-- <h1>my name is <%=str %></h1> --%>
<%-- <h1>this is my id<%=id %></h1> --%>
<%-- <h1>current date time is <%=localdatetime.toString() %></h1> --%>


<h1>${name }</h1>
<h1>${id }</h1>
<h1>local date time is ${time }</h1>

 <hr>
 
 <c:forEach var="item" items="${numbers }">
 <h1>${item }</h1>
 </c:forEach>


<h1>hello this is my help controller</h1>
<h1>i am going to transfer data from controller to view</h1>
</body>
</html>