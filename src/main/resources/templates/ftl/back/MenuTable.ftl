
<!DOCTYPE html>
<html>
<script type="text/javascript" src="../../js/jquery-3.3.1.js"></script>
<script type="text/javascript">
	console.log(window.parent.menu.selectUrl);
	var getListUrl=window.parent.menu.selectUrl;
</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="../../js/plugins/layui/css/layui.css" media="all">
<script type="text/javascript" src="../../js/jquery-3.3.1.js"></script>
</head>
<body>
					
	<table class="layui-table" id="table_demo"
				lay-data="{width: 1100, height:500,  page:true, id:'idTest'}"
				lay-filter="demo">
				<thead>
					<tr>
						<th lay-data="{type:'checkbox'}"></th>
						<th lay-data="{field:'id', width:80, sort: true}">ID</th>
						<th lay-data="{field:'pid', width:120, sort: true, edit: 'text'}">上级菜单ID</th>
						<th lay-data="{field:'value', edit: 'text', width: 120}">菜单名称</th>
						<th lay-data="{field:'url', minWidth:80, edit: 'text'}">菜单跳转链接</th>
						<th lay-data="{field:'status', edit: 'text', width: 120}">菜单状态</th>
						<th lay-data="{fixed: 'right', width:200, align:'center', toolbar: '#barDemo'}"></th>
					</tr>
				</thead>
			</table>
		<script src="../../js/plugins/layui/layui.js"></script>


	<script type="text/html" id="barDemo">
  		<a class="layui-btn layui-btn-xs" lay-event="edit">保存修改</a>
  		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>

	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
		layui.use('table', function(){
			  var table = layui.table;
			  //表格重载
			  table.reload('idTest', {
  				url: getListUrl
  				,where: {} //设定异步数据接口的额外参数
  				//,height: 300
				});
			  //监听表格复选框选择
			  table.on('checkbox(demo)', function(obj){
			    console.log(obj)
			  });
			  //监听工具条
			  table.on('tool(demo)', function(obj){
			    var data = obj.data;
			    if(obj.event === 'detail'){
			      layer.msg('ID：'+ data.id + ' 的查看操作');
			    } else if(obj.event === 'del'){
			      layer.confirm('真的删除行么', function(index){
			        obj.del();
			        console.log(data.id);
			        $.ajax({
			        	"url" : "http://92.68.10.110:8080/menu/delMenuById",
			        	"data" : "id="+data.id,
			        	"type" : "post",
			        	"dataType" : "text",
			        	"success" : function (returnMsg) {
							if(returnMsg==1){
								layer.alert("删除成功");
							}else{
								layer.alert("删除失败");
							}
						}
			        })
			        layer.close(index);
			        
			      });
			    } else if(obj.event === 'edit'){
			      json=JSON.stringify(data);
			      console.log(json);
			      $.ajax({
			    	  "url" : "http://92.68.10.110:8080/menu/updateMenuById",
			    	  "data" : "menu="+json,
			    	  "type" : "post",
			    	  "dataType" : "json",
			    	  "success"	: function (resultMsg) {
	    			  layer.open({
	    				    type: 1 //不显示标题栏   title : false/标题
	    				    ,title: "修改成功，返回菜单"
	    				    ,closeBtn: false
	    				    ,area: '300px;'
	    				    ,shade: 0.8
	    				    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
	    				    ,resize: false
	    				    ,btn: ['好的']
	    				    ,btnAlign: 'c'
	    				    ,moveType: 1 //拖拽模式，0或者1
	    				    ,success: function(layero){
	    				    }
	    				});
					}
			      });
			      
			    }
			  });
			  
			  var $ = layui.$, active = {
			    getCheckData: function(){ //获取选中数据
			      var checkStatus = table.checkStatus('idTest')
			      ,data = checkStatus.data;
			      layer.alert(JSON.stringify(data));
			    }
			    ,getCheckLength: function(){ //获取选中数目
			      var checkStatus = table.checkStatus('idTest')
			      ,data = checkStatus.data;
			      layer.msg('选中了：'+ data.length + ' 个');
			    }
			    ,isAll: function(){ //验证是否全选
			      var checkStatus = table.checkStatus('idTest');
			      layer.msg(checkStatus.isAll ? '全选': '未全选')
			    }
			  };
			  
			  $('.demoTable .layui-btn').on('click', function(){
			    var type = $(this).data('type');
			    active[type] ? active[type].call(this) : '';
			  });
			});
	</script>
</body>
</html>