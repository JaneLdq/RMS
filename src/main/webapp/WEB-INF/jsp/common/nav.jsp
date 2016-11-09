<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String url = request.getRequestURI();
%>
<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
  	<div class="navbar-header">
      <a class="navbar-brand" href="#">RMS</a>
    </div>
      
    <!-- Collect the nav links, forms, and other content for toggling -->
	<div class="collapse navbar-collapse" id="navbar">
		<ul class="nav navbar-nav">
			<% 
				if (request.getSession().getAttribute("uid") != null) {
					out.print("<li><a href='#'>风险项目</a></li>");
				}
				if (request.getSession().getAttribute("admin") != null) {
					out.print("<li><a href='#'>用户管理</a></li>");					
				}
      		%>
		</ul>
		<ul class="nav navbar-nav navbar-right">
      		<% if (request.getSession().getAttribute("uid") != null) {
					out.print("<li><a href='" + path + "/logout'>注销</a></li>");					
				} else {
					out.print("<li><a href=''>登录</a></li>");
				}
      		%>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>