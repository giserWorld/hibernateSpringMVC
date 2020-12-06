$(function(){
	//登录
	$("#login").click(function(){
		var userid=$("#usernames").val();
		var password=$("#password").val();
		var url="";
		var param={
				
		};
		var requestType="POST";
		jqueryUtilityFun.ajax_jquery_form(requestUrl,param,requestType,function(result){
			if(result.code===200){
				var param=result.param,//参数对象
				var responseData=result.returnData//请求响应数据
			}
		});
	});
});