<!-- 配置页面路径  -->
<#assign base=request.contextPath/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>菜单列表</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	
<div class="container">
	<h2>菜单列表</h2>    
	<a class="btn btn-info" href="/menu/toAdd">添加</a>      
	<table class="table table-hover">
		<thead>
			<tr>
				<th>菜单编号</th>
				<th>菜单名称</th>
				<th>跳转地址</th>
				<th>菜单排序</th>
				<th>菜单状态</th>
				<th>菜单图片</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
		</thead>
		<tbody>
			<#list menus as menu>
				<tr>
					<td>${menu.id}</td>
					<td>${menu.menuName}</td>
					<td>${menu.menuUrl}</td>
					<td>${menu.menuSort}</td>
					<td>${menu.menuStatus}</td>
					<td>${menu.menuImg?if_exists}</td>
					<td><a class="btn btn-info" href="/menu/toEdit?id=${menu.id}">修改</a></td>
					<td><a class="btn btn-danger" href="/menu/delete?id=${menu.id}">删除</a></td>
				</tr>
			</#list>  
		</tbody>
	</table>
</div>

</body>
</html>