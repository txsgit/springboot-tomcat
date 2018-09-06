<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <c:set var="BASE" value="${pageContext.request.scheme }://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath}"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
hello,world!!  <br>
<table border="1">
 <tbody>
 <c:forEach items="${users }" var="item">
    <tr>
      <td>${item.id }</td>
      <td>${item.name }</td>
      <td>${item.nickName }</td>
       <td>${item.phone }</td>
      <td>${item.email }</td>
      <td>${item.password }</td>
      <td>${item.enterpriseId }</td> 
   </tr>
</c:forEach>
 </tbody>
</table>
</body>
</html>