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
	
	
  <script type="text/javascript" src="jquery-1.8.3.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$("tr:odd").css("background","red");
  	})
  	
  	function deleted(id){
  		$.ajax('deleteblog','id='+id,function(data){
  			if(data>0){
  				$("#nn"+id).del();
  			}
  		});
  	}
  	
  	
  </script>
  </head>
  
  <body>
    <div align="center">
    	<form action="${pageContext.request.ContextPath}/view" method="post">
    		<table border="1px">
    			<tr>
    				<td>用户编号</td><td>内容</td><td>发布时间</td><td>操作</td>
    			</tr>
    			<c:forEach var="temp" items="${blogList}">
    				<tr id="nn${temp.id}">
    					<td>${temp.userid}</td><td>${temp.content}</td><td>${temp.publishtime}</td><td><a href="deleted(${temp.id})">删除</a></td>
    				</tr>
    			</c:forEach>
    		</table>
    	</form>
    	
    	<c:if test="${count>=pageSize}">
    		<a href="${pageContext.request.contextPath}/view?num=1">首页</a>
    		<a href="${pageContext.request.contextPath}/view?num=${pageNum-1}">上一页</a>
    		<a href="${pageContext.request.contextPath}/view?num=${pageNum+1}">下一页</a>
    		<a href="${pageContext.request.contextPath}/view?num=${total}">尾页</a>
    	</c:if>
    	总共有${total}页，当前是${pageNum}页
    	<div><input type="button" value="添加数据" onclick="location='${pageContext.request.ContextPath}/addblogview'"></div>
    	<div><input type="button" value="微博管理" onclick="location='${pageContext.request.ContextPath}/blogview'"></div>
    
    </div>
  </body>
</html>
