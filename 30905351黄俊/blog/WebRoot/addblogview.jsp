<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	
  
  </head>
  
  <body>
    <div align="center">
    	<form action="${pageContext.request.ContextPath}/addsaveblogview" method="post">
    		微博内容:<input type="text" name="content" id="content" ><br><br>
    	<input type="submit" value="保存">
    	&nbsp;&nbsp;&nbsp;&nbsp;
    	<input type="button" value="返回" onclick="location='${pageContext.request.contextPath}/blogview'">
    	
    	</form>		
    </div>
  </body>
</html>
