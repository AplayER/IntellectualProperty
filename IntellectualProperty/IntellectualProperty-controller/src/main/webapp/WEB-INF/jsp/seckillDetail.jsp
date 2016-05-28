<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
   <head>
   <%@ include file="common/header.jsp" %>   
      <title>秒杀详情页</title>
   </head>
   <body>
   		<!-- 页面部分 -->
   		<div class="container">
   			<div class="panel panel-default">
   				<div class="panel-heading text-center">
   					<h2>${seckill.name}</h2>
   				</div>
   				<div class="panel-body text-center">
   					<h2 class="text-danger">
   						<span class="glyphicon glyphicon-time"></span>
   				    	<span class="glyphicon" id="seckill-box"></span>
   					</h2>
   				</div>
   			</div>
   		</div>
   		<div id="killPhoneModal" class="modal fade">
   			<div class="modal-dialog">
   				<div class="modal-content">
   					<div class="modal-header">
   						<h3 class="modal-title text-center">
   							<span class="glyphicon glyphicon-phone"></span>秒杀电话
   						</h3>
   					</div>
   					<div class="modal-body">
   						<div class="row">
   							<div class="col-xs-8 col-xs-offset-2">
   								<input type="text" name="killPhone" id="killPhoneKey"
   								placeholder="请填入手机号" class="form-control"/>
   							</div>
   						</div>
   					</div>
   					<div class="modal-footer">
   						<span id="killPhoneMessage" class="glyphicon"></span>
   						<button type="button" id="killPhoneBtn" class="btn btn-success">
   							<span class="glyphicon glyphicon-phone"></span>
   							Submit
   						</button>
   					</div>
   				</div>
   			</div>
   		</div>

   </body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.js"></script>
<script src="http://cdn.bootcss.com/jquery.countdown/2.1.0/jquery.countdown.min.js"></script>
<!-- 开始编写交互逻辑 -->
<script src="/js/seckill.js"></script>
<script type="text/javascript">
	$(function(){
		seckill.detail.init({
			seckillId : ${seckill.seckillId},
			startTime : ${seckill.startTime.time},
			endTime : ${seckill.endTime.time},
		});
	})
</script>

</html>