<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<div class="col-md-8" style="margin-top: 10px">
			
			<div class="col-md-6" style="display: -webkit-box;">
				公司代付總額: <lable id="c_self">${c_self}</lable> 
			</div>
			<div class="col-md-6" style="display: -webkit-box;">
				福委會支付總額: <lable id="c_com">${c_com}</lable> 
			</div>
			<div class="col-md-6" style="display: -webkit-box;">
				自行支付總額: <lable id="s_self">${s_self}</lable> 
			</div>
			<div class="col-md-6" style="display: -webkit-box;">
				公司支付總額: <lable id="com">${com}</lable> 
			</div>
			
		</div>
		
		<div class="col-md-4" style="margin-top: 10px">
			<div class="col-md-12" style="display: -webkit-box;">
				付款總計: <lable id="totle">${totle}</lable> 
			</div>
			<div class="col-md-12" style="display: -webkit-box;">
				<button id="search_data" class="form-control" style="width:140px" onclick="getDtlReport()">分析統計表</button>
			</div>
		</div>
		<div class="col-md-12" style="margin-top: 20px">
<table id="data"
				class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th>員工代號</th>
						<th>姓名</th>
						<th>時間</th>
						<th colspan="2">餐別</th>
						<th>施型類別</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${data}" var="data">
						<tr alt="data">
							<td>${data.workerid}</td>
							<td>${data.resak002}</td>
							<td>${data.temp1}</td>
							<td>
							<c:choose>
								<c:when test="${data.mid eq 'true'}">
									<p alt="mid">午</p>
								</c:when>
								<c:otherwise>
									
								</c:otherwise>
							</c:choose>
							</td>
							<td>
							<c:choose>
								<c:when test="${data.night eq 'true'}">
									<p alt="night">晚</p>
								</c:when>
								
							</c:choose>
							</td>
							<td>${data.type}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</div>
			<script>
			$(document).ready(function() {
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
					"aaSorting" : [ [ 0, "asc" ] ],
					"bAutoWidth" : false, // Disable the auto width calculation 
					"columns" : [ {
						"width" : "25%"
					}, {
						"width" : "25%"
					}, {
						"width" : "30%"
					}, {
						"width" : "5%"
					}, {
						"width" : "5%"
					},{
						"width" : "10%"
					} ]
				};
				$('#data').DataTable(opt);
			})
			</script>