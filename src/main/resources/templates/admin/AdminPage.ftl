<!-- 配置页面路径  -->
<#assign base=request.contextPath/>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <!-- Twitter meta-->
    <!-- <meta property="twitter:card" content="summary_large_image"> -->
    <!-- <meta property="twitter:site" content="@pratikborsadiya"> -->
    <!-- <meta property="twitter:creator" content="@pratikborsadiya"> -->
    <!-- Open Graph Meta-->
    <!-- <meta property="og:type" content="website"> -->
    <!-- <meta property="og:site_name" content="Vali Admin"> -->
    <!-- <meta property="og:title" content="Vali - Free Bootstrap 4 admin theme"> -->
    <!-- <meta property="og:url" content="http://pratikborsadiya.in/blog/vali-admin"> -->
    <!-- <meta property="og:image" content="http://pratikborsadiya.in/blog/vali-admin/hero-social.png"> -->
    <!-- <meta property="og:description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular."> -->
    <title>小罐茶后台管理</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="/vali-admin/css/main.css">
    <!-- Font-icon css-->
    <!-- <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"> -->
  	
	<link rel="stylesheet" href="${base}${staticPath}/js/bootstrapDatetime/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${base}${staticPath}/font-awesome-4.7.0/css/font-awesome.css">
    <link href="https://cdn.bootcss.com/font-awesome/5.10.2/css/all.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="${base}${staticPath}/fontawesome-iconpicker/css/fontawesome-iconpicker.min.css">
	  
	<!-- <script src="${base}${staticPath}/js/jquery-3.3.1.js"></script> -->
	<!-- <script src="${base}${staticPath}/js/bootstrapDatetime/bootstrap/js/bootstrap.min.js"></script> -->
  </head>
  <style>
  		body{
  		}
  		.app-content{
  			padding:5px 0;
  			height: 100%;
  			display: flex;
  			flex-direction:column;
  			justify-content: space-between;
  		}
  		.app-title{
  			margin: 0;
  			width: 100%;
  			height: 60px;
  		}
  		#contentIframe{
  			width: 100%;
  			height: 100%;
  			border-color: transparent !important;
  			flex:1;
  		}
  		.treeview-item{
  			padding-left: 40px;
  		}
  </style>
  <body class="app sidebar-mini">
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="/page/index">Minitea</a>
      <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
      <!-- Navbar Right Menu-->
      <ul class="app-nav">
        <li class="app-search">
          <input class="app-search__input" type="search" placeholder="Search">
          <button class="app-search__button"><i class="fa fa-search"></i></button>
        </li>
        <!--Notification Menu-->
        <li class="dropdown"><a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Show notifications"><i class="fa fa-bell-o fa-lg"></i></a>
          <ul class="app-notification dropdown-menu dropdown-menu-right">
            <li class="app-notification__title">You have 4 new notifications.</li>
            <div class="app-notification__content">
              <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-primary"></i><i class="fa fa-envelope fa-stack-1x fa-inverse"></i></span></span>
                  <div>
                    <p class="app-notification__message">Lisa sent you a mail</p>
                    <p class="app-notification__meta">2 min ago</p>
                  </div></a></li>
              <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-danger"></i><i class="fa fa-hdd-o fa-stack-1x fa-inverse"></i></span></span>
                  <div>
                    <p class="app-notification__message">Mail server not working</p>
                    <p class="app-notification__meta">5 min ago</p>
                  </div></a></li>
              <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-success"></i><i class="fa fa-money fa-stack-1x fa-inverse"></i></span></span>
                  <div>
                    <p class="app-notification__message">Transaction complete</p>
                    <p class="app-notification__meta">2 days ago</p>
                  </div></a></li>
              <div class="app-notification__content">
                <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-primary"></i><i class="fa fa-envelope fa-stack-1x fa-inverse"></i></span></span>
                    <div>
                      <p class="app-notification__message">Lisa sent you a mail</p>
                      <p class="app-notification__meta">2 min ago</p>
                    </div></a></li>
                <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-danger"></i><i class="fa fa-hdd-o fa-stack-1x fa-inverse"></i></span></span>
                    <div>
                      <p class="app-notification__message">Mail server not working</p>
                      <p class="app-notification__meta">5 min ago</p>
                    </div></a></li>
                <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-success"></i><i class="fa fa-money fa-stack-1x fa-inverse"></i></span></span>
                    <div>
                      <p class="app-notification__message">Transaction complete</p>
                      <p class="app-notification__meta">2 days ago</p>
                    </div></a></li>
              </div>
            </div>
            <li class="app-notification__footer"><a href="#">See all notifications.</a></li>
          </ul>
        </li>
        <!-- User Menu-->
        <li class="dropdown"><a class="app-nav__item" href="javascript:void(0);" data-toggle="dropdown" aria-label="Open Profile Menu"><i class="fa fa-user fa-lg"></i></a>
          <ul class="dropdown-menu settings-menu dropdown-menu-right">
            <li><a class="dropdown-item" href="page-user.html"><i class="fa fa-cog fa-lg"></i> Settings</a></li>
            <li><a class="dropdown-item" href="page-user.html"><i class="fa fa-user fa-lg"></i> Profile</a></li>
            <li><a class="dropdown-item" href="page-login.html"><i class="fa fa-sign-out fa-lg"></i> Logout</a></li>
          </ul>
        </li>
      </ul>
    </header>
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
      <div class="app-sidebar__user">
        <div>
          <p class="app-sidebar__user-name">${UserInfo.username}</p>
          <p class="app-sidebar__user-designation"></p>
        </div>
      </div>
      <ul class="app-menu">
	      <#list MenuVM as menu>
	        <li class="treeview">
		        <a class="app-menu__item" href="javascript:void(0);" data-toggle="treeview">
		        	<i class="app-menu__icon ${menu.menuImg!}"></i><span class="app-menu__label">${menu.menuName}</span><i class="treeview-indicator fa fa-angle-right"></i>
		        </a>
		        <ul class="treeview-menu">
		          <#list menu.menus as sonMenu>
			          <li><a class="treeview-item" onclick="navClick('${sonMenu.menuUrl}')" href="javascript:void(0);"><i class="icon ${sonMenu.menuImg!}"></i>${sonMenu.menuName}</a></li>
		          </#list>
		        </ul>
	        </li>
	      </#list>
      </ul>
    </aside>
    <main class="app-content">
      <div class="app-title">
        <div>
          <h1 id="titleText">首页</h1>
        </div>
        <ul class="app-breadcrumb breadcrumb" style="margin: 0;">
          <li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
          <li class="breadcrumb-item"><a href="/admin/index">返回首页</a></li>
        </ul>
      </div>
      <iframe id="contentIframe" ></iframe>
      <div class="app-title">
      </div>
    </main>
    <!-- Essential javascripts for application to work-->
    <script src="/vali-admin/js/jquery-3.3.1.min.js"></script>
    <script src="/vali-admin/js/popper.min.js"></script>
    <script src="/vali-admin/js/bootstrap.min.js"></script>
    <script src="/vali-admin/js/main.js"></script>
	<script src="${base}/ckeditor/ckeditor.js"></script>
	<script type="text/javascript" src="${base}${staticPath}/fontawesome-iconpicker/js/fontawesome-iconpicker.min.js"></script>
    <!-- The javascript plugin to display page loading on top-->
    <script src="/vali-admin/js/plugins/pace.min.js"></script>
    <!-- Page specific javascripts-->
    <!-- Google analytics script-->
    <script type="text/javascript">
      if(document.location.hostname == 'pratikborsadiya.in') {
      	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      	ga('create', 'UA-72504830-1', 'auto');
      	ga('send', 'pageview');
      }
    </script>
    <script type="text/javascript">
    //iframe跳转 
    var navClick = (url) => {
    	$("#contentIframe").attr('src',url)
        setTimeout(function(){
    		//console.log(document.getElementById('contentIframe').contentWindow.document.title)
    		$("#titleText").html(document.getElementById('contentIframe').contentWindow.document.title)
        },500)
    }
	</script>
  </body>
</html>