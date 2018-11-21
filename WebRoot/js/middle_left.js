/**
 *	用于登陆的JS 
 *
 * 
 */
/***
 * 登陆
 */
function check_login()
{
	var username = $("#user_name").val();
	var password = $("#password").val();
$.post("/TestWeb/LoginServlet",{username:username,password:password},function(data,status){
	
	if(data=="true"){
		alert("登陆成功！");
		window.parent.topFrame1.location.href="middle_right_suc.jsp";
		window.parent.bottomFrame.location.href="bottom_jjjh.jsp";
		window.location.href="successpage.jsp";
	}else{
		alert("登陆失败！");
		window.location.href="middle_left.html";
	}
	
	
});
}
/**
 * 注册
 */
function check_register(){
	var username = $("#r_user_name").val();
	var password = $("#r_password").val();
	var usercode = $("#r_usercode").val();
	//alert(""+username+password+usercode);
$.post("/TestWeb/RegesterServlet",{username:username,password:password,usercode:usercode},function(data,status){
		
		if(data=="true"){
			alert("注册成功！");
			window.location.href="middle_left.html";
		}else{
			alert("注册失败！");
			window.location.href="registerfail.jsp";
		}
		
		
	});
}

function checkUserName(){
	//1. 获取输入框的内容
	var name = $("#r_user_name").val();
	//2. 发送请求实现百度搜索提示
	$.post("/TestWeb/CheckUserNameServlet" , {username:name} , function(data , status){
		//alert(data);
		if(data == 1){//用户名存在
		//alert("用户名存在");
		$("#span01").html("<font color='red'>用户名已被注册</font>");
	}else{
		//alert("用户名可用");
		$("#span01").html("<font color='green'>用户名可以使用</font>");
		}
	} );
	//3. 输出响应的数据到页面上。
}


$(function(){
	$("#create").click(function(){
		check_register();
		return false;
	})
	$("#login").click(function(){
		check_login();
	return false;
	})
	$('.message a').click(function () {
		$('form').animate({
			height: 'toggle',
			opacity: 'toggle'
		}, 'slow');
	});
//	$("#r_user_name".onblur(function(){
//		checkUserName();
//	}))
	
}) 
