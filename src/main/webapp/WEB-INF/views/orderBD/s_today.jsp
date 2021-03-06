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
		<div class="col-md-12" style="margin-top: 20px">今日午總計: <lable id="mid"></lable> 今日晚總計:<lable id="night"></lable></div>
		<div class="col-md-12" style="margin-top: 20px">
				<table id="data"
					class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>員工代號</th>
							<th>姓名</th>
							<th>時間</th>
							<th>午餐</th>
							<th>晚餐</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${data}" var="data">
							<tr alt="data" >
								<td>${data.workerid}</td>
								<td>${data.resak002}</td>
								<td>${data.temp1}</td>
								<c:choose>
								  <c:when test="${data.mid eq 'true'}">
								  <td alt="mid">午</td>
								  </c:when>
								  <c:otherwise>
								  <td>X</td>
								  </c:otherwise>
								</c:choose>
								<c:choose>
								  <c:when test="${data.night eq 'true'}">
								  <td alt="night">晚</td>
								  </c:when>
								  <c:otherwise>
								  <td>X</td>
								  </c:otherwise>
								</c:choose>
							</tr>
						</c:forEach>
					</tbody>
				</table>
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
			"aaSorting": [[ 0, "asc" ]],
			"bAutoWidth": false, // Disable the auto width calculation 
			 "columns": [
			             { "width": "25%" },
			             { "width": "25%" },
			             { "width": "30%" },
			             { "width": "10%" },
			             { "width": "10%" }
			           ]
		};
		$('#data').DataTable(opt);
		$('#mid').text($("td[alt='mid']").length);
		$('#night').text($("td[alt='night']").length);
	})
	function send(obj) {
		$.post("setType/"+obj.attr('alt'), {
			id : $('#id').val(),
			self: $("#self").val(),
			company: $("#company").val()
		}, function(data, status) {
			if(data=='ok'){
				$("#alert").modal('show');
			}else{
				$("#warning").modal('show');
			}
		});
		
	}
	function check(obj) {
		$.post("checkType/", {
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
		$('#id').val(obj.children().eq(0).text());
		$('#self').val(obj.children().eq(1).text());
		$('#company').val(obj.children().eq(2).text());
		check($('#id'));
	}
</script>
</html>