<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>百度地图</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
		body, html{width: 100%;height: 100%;margin:0;font-family:"微软雅黑";}
		#allmap{height:500px;width:100%;}
		#r-result{width:100%; font-size:14px;}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=tIV85GLyno6kF5lcFZMMYzrdxFve3ehU"></script>
	<title>城市名定位</title>
  </head>
  
  <body>

    <div id="allmap"></div>
   
  </body>
</html>

<script type="text/javascript">
/* $.("#btn").click(function(){
	$.post("/TestWeb/GetUserIdServlet",{name:${name }},function(data,status){
	
		alert(data);

	});

}) */
window.onload = function()
{
	
	
	if(${isSuccess} == true){
	 /*$.post("/TestWeb/GetUserIdServlet",{name:${name }},function(data,status){
	
		alert(data);

	}); */
	/* 
	$.post("/TestWeb/PostitionServlet",{userid:${userid.userid }},function(data,status){
	
		if(data=="true"){
			alert("登陆成功！");
			window.parent.topFrame1.location.href="middle_right_suc.jsp";
			window.location.href="successpage.jsp";
		}else{
			alert("登陆失败！");
			window.location.href="middle_left.html";
		}

	}); */
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(118.937453,32.113846);
	var marker = new BMap.Marker(point);
	map.centerAndZoom(point,19);
	map.addOverlay(marker);
	map.enableScrollWheelZoom(true);
	
	// 用经纬度设置地图中心点
	   /* function theLocation(){
		if(document.getElementById("longitude").value != "" && document.getElementById("latitude").value != ""){
			map.clearOverlays(); 
			var new_point = new BMap.Point(document.getElementById("longitude").value,document.getElementById("latitude").value);
			var marker = new BMap.Marker(new_point);  // 创建标注
			map.addOverlay(marker); 
			map.setZoom(16);              // 将标注添加到地图中
			map.panTo(new_point);
			
			    
		}
	}  
	*/
	
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937481,32.113897);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},5000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937495,32.113985);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},7000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937495,32.114096);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},9000)

	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937486,32.114249);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},11000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.93749,32.114371);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},13000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937414,32.114432);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},15000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937508,32.114494);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},17000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937468,32.114608);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},19000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937553,32.114799);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},21000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937427,32.11483);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},23000)		
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937328,32.114979);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},25000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937256,32.115128);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},27000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937117,32.115136);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},29000)
		
	setTimeout(function (){
		map.clearOverlays();
		var new_point = new BMap.Point(118.937099,32.115094);
		var marker = new BMap.Marker(new_point);
		map.addOverlay(marker); 
		map.setZoom(19);              // 将标注添加到地图中
		map.panTo(new_point);
		},31000)
		
	}
}
				
		
</script>

