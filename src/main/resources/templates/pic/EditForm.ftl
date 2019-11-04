<!-- 配置页面路径  -->
<#assign base=request.contextPath/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>添加图片</title>
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
		body{
			padding: 5px;
		}
	</style>
<div class="container">
	<form role="form" action="/pic/edit" method="post">
	  <div class="form-group">
	    <label for="menuName">图片编号</label>
	    <input type="text" class="form-control" name="id" readonly="readonly" value="${(pic.id)!''}" id="id" placeholder="请输入菜单名称">
	  </div>
	  <div class="form-group">
	    <label for="menuName">图片名称</label>
	    <input type="text" class="form-control" name="picName" value="${pic.picName}" id="picName" placeholder="请输入菜单名称">
	  </div>
	  <div class="form-group">
		<label for="input-id" class="" >上传图片</label>
    	<input id="picUpload" name="picUpload" type="file" value="上传" multiple/>
	  </div>
	  <div class="form-group">
	    <label for="menuUrl">图片地址</label>
	    <input type="text" class="form-control" name="picUrl" value="${pic.picUrl}"  id="picUrl" placeholder="请输入跳转地址">
	  </div>
	  <div class="form-group">
	    <label for="menuSort">图片状态</label>
	    <input type="number" class="form-control" name="picStatus" value="${pic.picStatus}"  id="picStatus" placeholder="请输入菜单序号">
	  </div>
	  <div class="form-group">
	    <label for="menuStatus">图片宽度</label>
	    <input type="number" class="form-control" name="picWidth" value="${pic.picWidth}"  id="picWidth" placeholder="请输入菜单状态">
	  </div>
	  <div class="form-group">
	    <label for="menuImg">图片高度</label>
	    <input type="text" class="form-control" name="picHeight" value="${pic.picHeight}"  id="picHeight" placeholder="请输入菜单图片">
	  </div>
	  <div class="form-group">
	    <label for="menuImg">图片简介</label>
	    <input type="text" class="form-control" name="picIntro" value="${pic.picIntro}"  id="picIntro" placeholder="请输入菜单图片">
	  </div>
	  <button type="submit" class="btn btn-default">提交</button>
	</form> 
</div>

</body>

<script type="text/javascript">

	$('#picUpload').fileinput({
		//初始化上传文件框
		language: "zh",//配置语言
	    showUpload : true, //显示整体上传的按钮
	    showRemove : true,//显示整体删除的按钮
	    uploadAsync: true,//默认异步上传
	    uploadLabel: "上传",//设置整体上传按钮的汉字
	    removeLabel: "移除",//设置整体删除按钮的汉字
	    uploadClass: "btn btn-primary",//设置上传按钮样式
	    showCaption: true,//是否显示标题
	    dropZoneEnabled: false,//是否显示拖拽区域  
	    uploadUrl: '${base}/file/uploadimageone',//这个是配置上传调取的后台地址，本项目是SSM搭建的
	    maxFileSize : 9999,//文件大小限制
	    maxFileCount: 9999,//允许最大上传数，可以多个，
	    enctype: 'multipart/form-data',
	    allowedFileExtensions : ["jpg", "png","gif"],/*上传文件格式限制*/
	    msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
	    showBrowse: true,
	    browseOnZoneClick: true,
	    slugCallback : function(filename) {
	        return filename.replace('(', '_').replace(']', '_');
	    }
	}).on('fileuploaded', function(event, data, id, index) { // 上传按钮的回调事件  
		$("#picUrl").attr('value',data.response.url)
	})
	
	// 替换 <textarea id="editor1">为CKEditor实例
	// 使用默认配置
	CKEDITOR.replace('picIntro');
</script>
</html>