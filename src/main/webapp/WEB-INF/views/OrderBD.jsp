<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!doctype html>
<html>
	<head>
		<title>CLNDR Demo</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/clndr.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/btn.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" media="screen">
	</head>
	<script src="${pageContext.request.contextPath}/resources/js/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
	<!--[if lt IE 9]>
      <script src="${pageContext.request.contextPath}/resources/js/html5shiv.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/respond.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/carousel.js"></script>
      <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ie_custom.css"> 
     
    <![endif]-->
	<body>
	
		<div class="container">
			<div id="calendar" class="_calendar">
				<script type="text/template" id="template-calendar" charset="UTF-8">
					<div class='clndr-controls'>
					<div class='clndr-control-button'>
					<span class='clndr-previous-button'>previous</span>
					</div>
					<div class='month'><\%= this.month.format("MM")  %>月 <\%= year %></div>
					<div class='clndr-control-button rightalign'>
					<span class='clndr-next-button'>next</span>
					</div>
					</div>
					<table class='clndr-table' border='0' cellspacing='0' cellpadding='0'>
					<thead>
					<tr class='header-days'>
					<\% for(var i = 0; i < daysOfTheWeek.length; i++) { %>
					<td class='header-day'><\%= daysOfTheWeek[i] %></td>
					<\% } %>
					</tr>
					</thead>
					<tbody>
					<\% for(var i = 0; i < numberOfRows; i++){ %>
					<tr>
					<\% for(var j = 0; j < 7; j++){ %>
					<\% var d = j + i * 7; %>
					<\% var t_c=days[d].classes; %>
					<td class='<\%= t_c %>'>
					<div class='day-contents'><\%= days[d].day %></div>
					<\%if(t_c.indexOf("day")>=0&&t_c.indexOf("past")<0&t_c.indexOf("inactive")<0){%>
					<div class='mid-contents'><input id="mid" type="checkbox"/>中餐</div>
					<div class='night-contents'><input id="night" type="checkbox"/>晚餐</div>
					<\%}%>
					</td>
					<\% } %>
					</tr>
					<\% } %>
					</tbody>
					</table>
					<div style="margin-top: 50px;text-align: center;">
					<button class="submitButton" onclick="sendData()">儲存</button></div>
					
					<!--<div class="clndr-today-button">Today</div>-->
				</script>
			</div>
			
		</div>
		<div id="alert" class="modal fade" tabindex="-1" role="dialog"
		aria-labelledby="mySmallModalLabel">
			<div class="modal-dialog modal-sm" style="padding-top: 150px">
				<div class="modal-content,alert-success">
					<div class="modal-header,alert-success">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close" style="padding: 10px;" onclick="location.reload()">
							<span aria-hidden="true">×</span>
						</button>
					</div>
					<div class="alert alert-success">
						<strong>成功</strong>
						儲存完畢
					</div>
				</div>
			</div>
		</div>
		<div id="warning" class="modal fade" tabindex="-1" role="dialog"
		aria-labelledby="mySmallModalLabel">
			<div class="modal-dialog modal-sm" style="padding-top: 150px">
				<div class="modal-content,alert-warning">
					<div class="modal-header,alert-warning">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close" style="padding: 10px;" onclick="location.reload()">
							<span aria-hidden="true">×</span>
						</button>
					</div>
					<div class="alert alert-warning">
						<strong>錯誤</strong>
						無法正確儲存,請重新輸入
					</div>
				</div>
			</div>
		</div>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.8.3/underscore-min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/clndr.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/map.js"></script>
		<script>
			var def_data = ${defData};
			var sdate ='${sdate}';
			var edate ='${edate}';
			var calendars = {};
			var temp_map = new Map();
			$(document).ready(function() {
				var thisMonth = moment().format('YYYY-MM');
				calendars = $('#calendar').clndr({
					events : {},

					daysOfTheWeek : ['日', '一', '二', '三', '四', '五', '六'],

					clickEvents : {
						click : function(target) {
							//alert(target.element.children().length);
							var el = target.element;
							if ($(el).find('div').length > 1) {
								var mid;
								mid = $(el).find('#mid').is(':checked');
								var night;
								night = $(el).find('#night').is(':checked');
								//temp_map.put(target.date._i,);
							}
							if (mid || night) {
								temp_map.put(target.date._i, [mid, night]);
							} else {
								temp_map.remove(target.date._i);
							}
							
						},
						today : function() {
						},
						nextMonth : function() {
							setText();
							setData();
							setToday();
						},
						previousMonth : function() {
							setText();
							setData();
							setToday();
						}
					},
					multiDayEvents : {
						singleDay : 'date',
						endDate : 'endDate',
						startDate : 'startDate'
					},
					showAdjacentMonths : false,
					adjacentDaysChangeMonth : true,
					constraints : {
						startDate : sdate,
						endDate : edate
					},

					template : $('#template-calendar').html()
				});
				/* $(".clndr-next-button").click(function() {
				 alert("The paragraph was clicked.");

				 }); */
				 
				setDefaultData(temp_map,def_data);
				setText();
				setData();
				setToday();
				
			})
			function setToday() {
				var mid="${mid}";
				var mark_d="${mark_d}";
				if(mid=="false"){
					$(".calendar-day-${sdate}").find("#mid").attr("disabled",true);
				}
				if(mark_d.length>0){
					var k=mark_d.split(',');
					for(var o in k){
						$(".calendar-day-"+k[o]).addClass("past");
						$(".calendar-day-"+k[o]).addClass("inactive");
						
						$(".calendar-day-"+k[o]).find(".mid-contents").remove();
						$(".calendar-day-"+k[o]).find(".night-contents").remove();
					}
				}
			}
			function sendData() {
				var context="${pageContext.request.contextPath}";
				var _data=JSON.stringify(temp_map.toJson());
				$.post(context+"/orderBD/save",{json:_data
					,s_time:"${s_time}"
					,e_time:"${e_time}"
					,uid:"${uid}"
					,name:"${name}"}, function(data, status){
					if(data=="true"){
						$("#alert").modal('show');
					}else{
						$("#warning").modal('show');
					}
			    });
			}
			function setMouth() {
				$("td[class*='last-month']").hide();
			}

			function setText() {
				$('.clndr-next-button').html("下一個月");
				$('.clndr-previous-button').html("上一個月");
			}
			

			function setDefaultData(map,d) {
				for (i in d) {
					map.put(d[i].key, d[i].value);
				}
			}

			function setData() {
				var keys = temp_map.keys;
				for ( i = 0; i < keys.length; i++) {
					var key = keys[i];
					var data = temp_map.data[key];
					var ip_m = $("td[class*=" + key + "]").find("#mid");
					var ip_n = $("td[class*=" + key + "]").find("#night");
					if(data[0]=='true'){
						ip_m.attr("checked", "");
					}
					if(data[1]=='true'){
						ip_n.attr("checked", "");
					}
					//console.log(ip);*/
					//not work ie8 fix bug
					/*$("td[class*=" + key + "]").find("#mid").attr("checked", data[0]);
					 $("td[class*=" + key + "]").find("#night").attr("checked", data[1]);*/
				}
			}

			function padLeft(str, lenght) {
				str = '' + str;
				if (str.length >= lenght) {
					return str;
				} else {
					return padLeft("0" + str, lenght);
				}
			}
		</script>
	</body>
</html>