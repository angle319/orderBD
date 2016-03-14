<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="com.ico">
<title>便當程式</title>
<meta name="author" content="angle319">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	media="screen">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/custom.css"
	media="screen">
<link rel="shortcut icon" href="com.ico">
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-1.11.3.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
<script>
function setHeight() {
	$('#order_cal').height($('#order_cal').contents().height());
}
</script>
<style>
.form-control {
	width: auto; !important
}

</style>
<!--[if lt IE 9]>
      <script src="${pageContext.request.contextPath}/resources/js/html5shiv.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/respond.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/carousel.js"></script>
      <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ie_custom.css"> 
     
    <![endif]-->
</head>

<body class="container">
	<div id="static_menu"></div>
	<div id="content">
		<div class="col-md-12">
			<div class="col-sm-4">
				<label >姓名工號</label> <select id="user"
					class="form-control input-sm" onchange="load_if($(this))">
					<option id="op_def"></option>
					<c:forEach items="${resak}" var="resak">
						<option aid="${resak.workerid}" an="${resak.name}">${resak.workerid} ${resak.name}</option>
					</c:forEach>
					<c:forEach items="${data}" var="data">
						<option aid="${data.workerid}" an="${data.name}">${data.workerid} ${data.name}</option>
					</c:forEach>
					
				</select>
			</div>
			<div class="col-sm-4">
				<label >搜尋</label> <input class="form-control input-sm" onchange="search_data($(this))">
			</div>
			<div class="col-sm-4"></div>
		</div>
		<script></script>
			<iframe id="order_cal" class="col-md-12" onload="setHeight()" style="margin-top:30px"></iframe>
	</div>
</body>
<script>
	var all_op;
	$(document).ready(function() {
		all_op=$("#user").find("option");
		$("#static_menu").load("menu", function() {
			$("#content_").append($("#content"));
		});
	})
	function load_if(obj) {
		var _option=obj.find(":selected");
		if(_option.attr('aid')!==undefined){
			$('#order_cal').attr('src', "orderBD/"+_option.attr('aid')+"/"+_option.attr('an'));
		}else{
			$('#order_cal').attr('src',"");
		}
	}
	function search_data(obj){
		/*chrome html5 support code
		$("#user").find("option").show();
		var str=obj.val();
		$("#user").find("option:not(:contains('" + str + "'))").hide();
		$("#user").find("option:first").show();
		$("#user").find("option").removeAttr("selected");
		load_if($("#user").find("option:first"));*/
		var userAgent = navigator.userAgent; //取得瀏覽器的userAgent字元串
		var isOpera = userAgent.indexOf("Opera") > -1;
		var str=obj.val();
		if (userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera) {
			$("#user").empty();
			$("#user").append(all_op);
			$("#user").find("option").each(function(){
			    var temp = $(this);
			   	if(temp.val()==''){
			   		$("#user").val('');
			   		load_if(temp);
			   	}else if(temp.val().indexOf(str)<0){
				    temp.remove();
			   	}
			})
		}else{
			$("#user").find("option").show();
			$("#user").find("option:not(:contains('" + str + "'))").hide();
			$("#user").find("option:first").show();
			$("#user").find("option").removeAttr("selected");
			load_if($("#user").find("option:first"));
		}
		
	}
</script>
</html>