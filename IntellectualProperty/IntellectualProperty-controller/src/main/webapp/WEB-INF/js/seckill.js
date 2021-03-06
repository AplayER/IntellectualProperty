var seckill={
	URL:{
		now :function(){
			return '/seckill/time/now';
		},
		exposer : function(seckillId){
			return '/seckill/'+seckillId+'/exposer';
		},
		execution : function(seckillId,md5){
			return '/seckill/'+seckillId+'/'+md5+'/execution'
		}
	},
	
	handleSeckillkill : function(seckillId,node){
		node.hide().
		html('<button class="btn btn-primary btn-lg" id="killBtn">开始秒杀</button>');
		$.post(seckill.URL.exposer(seckillId),{},function(result){
//			console.log('exposer'+result);
			if(result&&result['succeed']){
				var exposer = result['data'];
				console.log(exposer);
				if(exposer['exposed']){
					var md5 = exposer['md5'];
					var killUrl = seckill.URL.execution(seckillId, md5);
					console.log(killUrl);
					$('#killBtn').one('click',function(){
						//禁用按钮
						$(this).addClass('disabled');
						$.post(killUrl,{},function(result){
							if(result&&result['succeed']){
								var killResult = result['data'];
								var state = killResult['state'];
								var stateInfo = killResult['stateInfo'];
								node.html('<span class="label label-success">'+stateInfo+'</span>');
							}
						});
					});
					node.show();
				}else{
					var now =exposer['now'];
					var start =exposer['start'];
					var end =exposer['end'];
					seckill.countDown(seckillId, now, start, end);
				}
			}else{
				console.log('result'+result);
			}
		});
	},
	
	validatePhone : function(phone){
		if(phone&&phone.length==11 &&!isNaN(phone)){
			return true;
		}
		else{
			return false;
		}
	},
	countDown : function(seckillId,nowTime,startTime,endTime){
		var seckillBox = $('#seckill-box');
		if(nowTime>endTime){
			seckillBox.html('秒杀结束！');
		}else if(nowTime<startTime){
			var killTime = new Date(startTime+1000);
			seckillBox.countdown(killTime,function(event){
				var format = event.strftime('秒杀倒计时：%D天 %H时 %M分 %S秒');
				seckillBox.html(format);
			})
			.on('finish.countdown',function(){
				seckill.handleSeckillkill(seckillId, seckillBox);
			});
		}else{
			seckill.handleSeckillkill(seckillId, seckillBox);
		}
	},
	detail:{
		//详情页初始化
		init : function(params){
			//用户手机验证和登陆，计时交互
//			console.log(params);

			var killPhone = $.cookie('killPhone');
			var startTime = params['startTime'];
			var endTime = params['endTime'];
			var seckillId = params['seckillId'];
			if(!seckill.validatePhone(killPhone)){
				var killPhoneModal = $('#killPhoneModal');
				//显示弹出层
				killPhoneModal.modal({
					show:true,//显示弹出层
					backdrop:'static', //禁止位置关闭
					keyboard:false
				});
				$('#killPhoneBtn').click(function(){
					var inputPhone = $('#killPhoneKey').val();
//					console.log(inputPhone);

					if(seckill.validatePhone(inputPhone)){
						$.cookie('killPhone',inputPhone,{expires:7,path:'/seckill'});
						window.location.reload();
					}
					else{
						$('#killPhoneMessage').
						hide().
						html('<label class="label label-danger">手机号错误！</label>').
						show(300);
					}
				});
			}
			var startTime = params['startTime'];
			var endTime = params['endTime'];
			var seckillId = params['seckillId'];
		$.post(seckill.URL.now(),{},function(result){
			console.log(result);

			if(result&&result['succeed']){
				var nowTime = result['data'];
				seckill.countDown(seckillId,nowTime,startTime,endTime);
			}else{
				console.log(result);
			}
		});
		}
	}
}
