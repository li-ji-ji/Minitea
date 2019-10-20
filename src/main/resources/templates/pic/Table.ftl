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
	<h2>图片列表</h2>    
	<a class="btn btn-info" href="/pic/toAdd">添加</a>      
	<table class="table table-hover">
		<thead>
			<tr>
				<th>图片编号</th>
				<th>图片名称</th>
				<th>图片地址</th>
				<th>图片状态</th>
				<th>图片宽度</th>
				<th>图片高度</th>
				<th>图片简介</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
		</thead>
		<tbody>
			<#list picList as pic>
				<tr>
					<td>${pic.id}</td>
					<td>${pic.picName}</td>
					<td>${pic.picUrl}</td>
					<td>${pic.picStatus}</td>
					<td>${pic.picWidth}</td>
					<td>${pic.picHeight}</td>
					<td>${pic.picIntro}</td>
					<td><a class="btn btn-info" href="/pic/toEdit?id=${pic.id}">修改</a></td>
					<td><a class="btn btn-danger" href="/pic/delete?id=${pic.id}">删除</a></td>
				</tr>
			</#list>
		</tbody>
	</table>
</div>

</body>
</html>