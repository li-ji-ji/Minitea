<!-- 配置页面路径  -->
<#assign base=request.contextPath/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>添加图片</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	
<div class="container">
	<h2>添加图片</h2>      
	<form role="form" action="/pic/add" method="post">
	  <div class="form-group">
	    <label for="menuName">图片名称</label>
	    <input type="text" class="form-control" name="picName" id="menuName" placeholder="请输入菜单名称">
	  </div>
	  <div class="form-group">
	    <label for="menuUrl">图片地址</label>
	    <input type="text" class="form-control" name="picUrl" id="menuUrl" placeholder="请输入跳转地址">
	  </div>
	  <div class="form-group">
	    <label for="menuSort">图片状态</label>
	    <input type="number" class="form-control" name="picStatus" id="menuSort" placeholder="请输入菜单序号">
	  </div>
	  <div class="form-group">
	    <label for="menuStatus">图片宽度</label>
	    <input type="number" class="form-control" name="picWidth" id="menuStatus" placeholder="请输入菜单状态">
	  </div>
	  <div class="form-group">
	    <label for="menuImg">图片高度</label>
	    <input type="text" class="form-control" name="picHeight" id="menuImg" placeholder="请输入菜单图片">
	  </div>
	  <div class="form-group">
	    <label for="menuImg">图片简介</label>
	    <input type="text" class="form-control" name="picIntro" id="menuImg" placeholder="请输入菜单图片">
	  </div>
	  <button type="submit" class="btn btn-default">提交</button>
	</form> 
    <#include "${base}/pic/EditForm.ftl">
</div>

</body>
</html>