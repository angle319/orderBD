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
<link
	href="${pageContext.request.contextPath}/resources/css/jquery-ui.min.css"
	rel="stylesheet" media="screen">
<link href="${pageContext.request.contextPath}/resources/css/theme.css"
	rel="stylesheet" media="screen">
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-1.11.3.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.dataTables.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/dp_tw.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
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
		<div class="col-md-12" style="margin-top: 20px;border-bottom: 1px solid black;
    padding-bottom: 20px;">
			<div class="col-md-4" style="display: -webkit-box;">
				<p>起始日期:</p>
				<input type="text" class="form-control" style="width: 150px"
					id="s_date" onchange="setSDate($(this))">
			</div>
			<div class="col-md-4" style="display: -webkit-box;">
				<p>結束日期:</p>
				<input type="text" class="form-control" style="width: 150px"
					id="e_date">
			</div>
			<div class="col-md-4"><button id="search_data" class="form-control" style="width:70px" onclick="send($(this))">查詢</button></div>
		</div>
		
		<div id="data_table" class="col-md-12" style="margin-top: 20px">
			
		</div>
	</div>
	<div id="dialog"></div>
</body>
<script>
	$(document).ready(function() {
		$("#s_date").datepicker({
			maxDate : '-1',
			regional : "zh-TW"
		});
		$("#e_date").datepicker({
			maxDate : '-1',
			regional : "zh-TW"
		});
		//$("#data_table").load("selectReport");
		$("#static_menu").load("menu", function() {
			$("#content_").append($("#content"));
		});
		$("#dialog").load("dialog");
		
		
	})
	function setSDate(obj) {
		var date = obj.datepicker('getDate');
		$('#e_date').datepicker('option', 'minDate', date); // Reset minimum date
	}

	function send(obj) {
		$.post("selectReport", {
			s_date : $('#s_date').val(),
			e_date : $("#e_date").val()
		}, function(data) {
				$("#data_table").empty().html(data);
				
		});
	}
	function getDtlReport() {
		window.open("getDtlReport?s_date="+$('#s_date').val()+"&e_date="+$("#e_date").val(), "便當明細表");
		window.open("getSUMReport?s_date="+$('#s_date').val()+"&e_date="+$("#e_date").val(), "便當類別分析表");
		
	}
</script>
</html>