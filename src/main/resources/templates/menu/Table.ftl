<!-- 配置页面路径  -->
<#assign base=request.contextPath/>
<#setting number_format="computer">
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>菜单列表</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="${base}${staticPath}/js/bootstrapDatetime/bootstrap/css/bootstrap.min.css"> 
	<link rel="stylesheet" type="text/css" href="${base}${staticPath}/bootstrap-fileinput-master/css/fileinput.min.css">
	
	 
	<script src="${base}${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${base}${staticPath}/js/bootstrapDatetime/bootstrap/js/bootstrap.min.js"></script>
	<script src="${base}${staticPath}/bootstrap-fileinput-master/js/fileinput.js"></script>
	<script src="${base}${staticPath}/bootstrap-fileinput-master/js/locales/zh.js"></script>
	<script src="${base}/ckeditor/ckeditor.js"></script>
</head>
<body>
	<style>
		.container{
			width: 100%;
			padding:10px;
			max-width: 5000px !important;
		}
		th,td{
			text-align: center;
		}
	</style>
<div class="container">
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
				<th>菜单描述</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
		</thead>
		<tbody>
			<#list menus as menu>
				<tr>
					<td>${menu.id!}</td>
					<td>${menu.menuName!}</td>
					<td>${menu.menuUrl!}</td>
					<td>${menu.menuSort!}</td>
					<td>${menu.menuStatus!}</td>
					<td>${menu.menuImg}</td>
					<td>${menu.menuIntro!}</td>
					<td><a class="btn btn-info" href="/menu/toEdit?id=${menu.id}">修改</a></td>
					<td><a class="btn btn-danger" href="/menu/delete?id=${menu.id}">删除</a></td>
				</tr>
			</#list>  
		</tbody>
	</table>
</div>

</body>
</html>