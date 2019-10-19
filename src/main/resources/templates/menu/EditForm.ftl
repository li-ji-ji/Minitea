<!-- 配置页面路径  -->
<#assign base=request.contextPath/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>修改菜单</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	
<div class="container">
	<h2>修改菜单</h2>      
	<form role="form" action="/menu/edit" method="post">
	  <div class="form-group">
	    <label for="id">菜单编号</label>
	    <input type="text" class="form-control" name="id" id="id" value="${menu.id}" placeholder="请输入菜单名称">
	  </div>
	  <div class="form-group">
	    <label for="menuName">菜单名称</label>
	    <input type="text" class="form-control" name="menuName" id="menuName" value="${menu.menuName}" placeholder="请输入菜单名称">
	  </div>
	  <div class="form-group">
	    <label for="menuUrl">跳转地址</label>
	    <input type="text" class="form-control" name="menuUrl" id="menuUrl" value="${menu.menuUrl}" placeholder="请输入跳转地址">
	  </div>
	  <div class="form-group">
	    <label for="menuSort">菜单序号</label>
	    <input type="number" class="form-control" name="menuSort" id="menuSort" value="${menu.menuSort}" placeholder="请输入菜单序号">
	  </div>
	  <div class="form-group">
	    <label for="menuStatus">菜单状态</label>
	    <input type="number" class="form-control" name="menuStatus" id="menuStatus" value="${menu.menuStatus}" placeholder="请输入菜单状态">
	  </div>
	  <div class="form-group">
	    <label for="menuImg">菜单图片</label>
	    <input type="text" class="form-control" name="menuImg" id="menuImg" value="${menu.menuImg?if_exists}" placeholder="请输入菜单图片">
	  </div>
	  <button type="submit" class="btn btn-default">提交</button>
	</form> 
</div>

</body>
</html>