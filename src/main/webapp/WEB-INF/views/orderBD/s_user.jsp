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
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.dataTables.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js"></script>

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
		<div class="col-md-12">
			<div class="col-md-9" style="margin-top: 20px">
				<table id="data"
					class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>工號</th>
							<th>姓名</th>
							<th>扣款類別</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${resak}" var="resak">
							<tr onclick="getData($(this))" alt="resak" style="background-color: blanchedalmond;">
								<td>${resak.workerid}</td>
								<td>${resak.name}</td>
								<td>${resak.type}</td>
							</tr>
						</c:forEach>
						<c:forEach items="${data}" var="data">
							<tr onclick="getData($(this))" alt="data">
								<td>${data.workerid}</td>
								<td>${data.name}</td>
								<td>${data.type}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-md-3">
				<form style="margin-top: 20px">
					<fieldset class="form-group">
						<label>工號</label> <input class="form-control" id="workerID" onChange="check($(this))">
					</fieldset>
					<fieldset class="form-group">
						<label>姓名</label> <input class="form-control" id="name">
					</fieldset>
					<fieldset class="form-group">
						<label>扣款類別</label> 
						<select class="form-control" id="type">
							<option></option>
							<c:forEach items="${price}" var="price">
								<option>${price.type}</option>
							</c:forEach>
						</select>
					</fieldset>
					<button id="_send" type="button" class="btn btn-primary" onClick="send($(this))" alt="add" >新增</button>
				</form>
			</div>
		</div>
	</div>
	<div id="dialog"></div>
</body>
<script>
	$(document).ready(function() {
		$("#static_menu").load("menu", function() {
			$("#content_").append($("#content"));
		});
		$("#dialog").load("dialog");
		var opt = {
			"oLanguage" : {
				"sProcessing" : "處理中...",
				"sLengthMenu" : "顯示 _MENU_ 項結果",
				"sZeroRecords" : "沒有匹配結果",
				"sInfo" : "顯示第 _START_ 至 _END_ 項結果，共 _TOTAL_ 項",
				"sInfoEmpty" : "顯示第 0 至 0 項結果，共 0 項",
				"sInfoFiltered" : "(從 _MAX_ 項結果過濾)",
				"sSearch" : "搜索  :   ",
				"oPaginate" : {
					"sFirst" : "首頁",
					"sPrevious" : "上頁",
					"sNext" : "下頁",
					"sLast" : "尾頁"
				}
			},
			"aaSorting": [[ 2, "desc" ]]
		};
		$('#data').DataTable(opt);
	})
	function send(obj) {
		$.post("setUser/"+obj.attr('alt'), {
			id : $('#workerID').val(),
			name: $("#name").val(),
			type: $("#type").val()
		}, function(data, status) {
			if(data=='ok'){
				$("#alert").modal('show');
			}else{
				$("#warning").modal('show');
			}
		});
		/*if(obj.attr("alt")=='add'){
			alert('dsd');
		}else if(obj.attr("alt")=='update'){
			alert('update');
		}*/
	}
	function check(obj) {
		$.post("checkUser/", {
			id : obj.val()
		}, function(data, status) {
			if(data=='ok'){
				$("#_send").attr('alt','update');
				$("#_send").text("更新");
			}else{
				$("#_send").attr('alt','add');
				$("#_send").text("新增");
			}
		});
	}
	function getData(obj) {
		$('#workerID').val(obj.children().eq(0).text());
		$('#name').val(obj.children().eq(1).text());
		$('#type').val(obj.children().eq(2).text());
		check($('#workerID'));
		
	}
</script>
</html>