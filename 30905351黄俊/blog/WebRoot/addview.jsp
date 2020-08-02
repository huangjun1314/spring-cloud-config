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
    	<form action="${pageContext.request.ContextPath}/addsaveview" method="post" enctype="multipart/form-data">
    		用户名:<input type="text" name="username" id="username" ><br><br>
    		密码:<input type="text" name="password" id="password" ><br><br>
    		昵称:<input type="text" name="nickname" id="nickname" ><br><br>
    		年龄:<input type="text" name="age" id="age" ><br><br>
    		性别：<select name="sex">
    				<option value="0">女</option>
    				<option value="1">男</option>
    		   </select>
    		手机:<input type="text" name="mobile" id="mobile" ><br><br>
    		地址:<input type="text" name="address" id="address" ><br><br>
    		头像：<input type="file" name="picpath" id="picpath"><br><br>
    	<input type="submit" value="保存">
    	&nbsp;&nbsp;&nbsp;&nbsp;
    	<input type="button" value="返回" onclick="location='${pageContext.request.contextPath}/view'">
    	
    	</form>		
    </div>
  </body>
</html>
