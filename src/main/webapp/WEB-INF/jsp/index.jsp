<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
<title>登录 - RMS</title>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/common/nav.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="alert alert-danger" id="js-error-msg" role="alert" style="display:none">${msg}</div>
		</div>
		<div class="row">
			<form class="col-md-6 col-md-offset-3" role="form" action="<c:url value="/auth"/>" method="POST">
		  		<div class="form-group">
		    		<label for="input-email">用户名</label>
		    		<input type="text" class="form-control" name="username" id="input-name" placeholder="请输入用户名">
		  		</div>
			  	<div class="form-group">
			    	<label for="input-password">密码</label>
			    	<input type="password" class="form-control" name="password" id="input-password" placeholder="请输入密码">
			  	</div>
		  		<button type="submit" class="btn btn-default">登录</button>
			</form>
		</div>
	</div>
	<script>
		$(document).ready(function(){
			var msg = $('#js-error-msg').html();
			if(msg.length > 0){
				$('#js-error-msg').show();
			}
		})
	</script>
</body>
</html>