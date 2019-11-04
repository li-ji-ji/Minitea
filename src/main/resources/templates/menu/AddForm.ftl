<!-- 配置页面路径  -->
<#assign base=request.contextPath/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>添加菜单</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="${base}${staticPath}/js/bootstrapDatetime/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${base}${staticPath}/font-awesome-4.7.0/css/font-awesome.css">
    <link href="https://cdn.bootcss.com/font-awesome/5.10.2/css/all.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="${base}${staticPath}/fontawesome-iconpicker/css/fontawesome-iconpicker.min.css">
	  
	<script src="${base}${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${base}${staticPath}/js/bootstrapDatetime/bootstrap/js/bootstrap.min.js"></script>
	<script src="${base}/ckeditor/ckeditor.js"></script>
	<script type="text/javascript" src="${base}${staticPath}/fontawesome-iconpicker/js/fontawesome-iconpicker.min.js"></script>
</head>
<body>
<style>
	body{
		padding: 5px;
	}
	.form-group{
		width: 50%;
	}
	.input-group-addon{
		width: 34px;
		height: 34px;
		padding: 0;
		box-sizing: border-box;
		display: flex;
		justify-content: center;
		align-items: center;
		border-bottom-right-radius: 5px !important;
		border-top-right-radius: 5px !important;
	}
	.icon-box{
		display: flex;
		flex-wrap: wrap;
	}
</style>
<div class="container">
	<h2>添加菜单</h2>      
	<form role="form" action="/menu/add" method="post">
	  <div class="form-group">
	    <label for="menuName">菜单名称</label>
	    <input type="text" class="form-control" name="menuName" id="menuName" placeholder="请输入菜单名称">
	  </div>
	  <div class="form-group">
	    <label for="menuUrl">跳转地址</label>
	    <input type="text" class="form-control" name="menuUrl" id="menuUrl" placeholder="请输入跳转地址">
	  </div>
	  <div class="form-group">
	    <label for="menuSort">菜单序号</label>
	    <input type="number" class="form-control" name="menuSort" id="menuSort" placeholder="请输入菜单序号">
	  </div>
	  <div class="form-group">
	    <label for="menuSort">父级菜单编号</label>
	    <input type="number" class="form-control" name="pId" id="pId" placeholder="请输入父级菜单编号">
	  </div>
	  <div class="form-group">
	    <label for="menuStatus">菜单状态</label>
	    <input type="number" class="form-control" name="menuStatus" id="menuStatus" placeholder="请输入菜单状态">
	  </div>
	  <div class="form-group">
	    <label for="menuImg">菜单图片</label>
        <div class="icon-box"><input data-placement="bottomRight" name="menuImg" class="form-control icp icp-auto" style="width: 90%;" value="" type="text" /><span class="input-group-addon"></span></div>
	  </div>
	  <div class="form-group">
	    <label for="menuIntro">菜单描述</label>
	    <textarea class="form-control" name="menuIntro" id="menuIntro" rows="3"></textarea>
	  </div>
	  <button type="submit" class="btn btn-default">提交</button>
	</form> 
</div>

</body>
	<script>
		// 图标选择器
		$(function () {
            // 图标可以点击选中 icp-auto 操作图标元素
            $('.icp-auto').iconpicker({
                title: '请选择一个图标',
                //  指定图标
                //icons:['fa-github', 'fa-heart', 'fa-html5', 'fa-css3'],
                // 添加其他图标 加入 bootstrap  glyphicon 字体图标
                icons: $.merge(['glyphicon-home', 'glyphicon-repeat', 'glyphicon-search',
                    'glyphicon-arrow-left', 'glyphicon-arrow-right', 'glyphicon-star'], $.iconpicker.defaultOptions.icons),
                fullClassFormatter: function (val) {
                    if (val.match(/^fa-/)) {
                        return 'fa ' + val;
                    } else {
                        return 'glyphicon ' + val;
                    }
                },
                component: '.input-group-addon', // 图标存放容器
                /* Placements: inline topLeftCorner topLeft top topRight topRightCorner rightTop right rightBottom bottomRightCorner bottomRight bottom bottomLeft bottomLeftCorner leftBottom left leftTop*/
                placement: 'bottomRightCorner',  // 图标容器位置
            });

            // 图标不可以点击, 绑定 .icp 元素
            // $.iconpicker.batch('.icp', 'destroy');

            // 点击下拉按钮显示图标
            $('.btn-group>button').one("click", function () {
                console.log(1);
                $('.icp-dd').iconpicker({
                    //title: 'Dropdown with picker',
                    //component:'.btn > i'
                });
            });
        });
	
	    // 替换 <textarea id="editor1">为CKEditor实例
	    // 使用默认配置
	    CKEDITOR.replace('menuIntro');
	</script>
</html>