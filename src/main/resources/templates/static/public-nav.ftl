<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../css/public-nav.css">
</head>

<body>
    <!--导航栏-->
    <div class="nav-bar-box">
        <div class="nav-bar-logo-box">
            <a class="nav-bar-logo-link" href="#">
                <img class="nav-bar-logo" src="../images/logo.png" alt="">
            </a>
        </div>
        <div class="nav-items-box">
        <#list menus as menu>
            <div class="nav-items-box-item">
                <a class="nav-items-box-item-link" href="#">${menu.value}</a>
                <ul class="nav-items-box-item-second-list">
        			<#list menu.menus as menuitem>
                    	<li class="nav-items-box-item-second-list-item">
                        	<a class="nav-items-box-item-second-list-item-link" href="${menuitem.url}">
                            	<img src="${menuitem.imageUrl}" alt="">
                            	<span>${menuitem.value}</span>
                        	</a>
                    	</li>
                    	<#if menuitem_has_next>
                    		<div class="space-line"></div>
                   		</#if>
        			</#list>
                </ul>
            </div>
        </#list>
        </div>
        <div class="nav-tools-box">
            <a class="nav-tools-search-box" href="#">
                <img class="nav-tools-search-logo" src="../images/search.png" alt="">
                <input class="nav-tools-search-input" type="text" name="" id="" placeholder="搜索">
            </a>
            <a class="nav-tools-user-box" href="#">
                <img class="nav-tools-user-logo" src="../images/user.png" alt="">
            </a>
            <a class="nav-tools-service-box" href="#">
                <img class="nav-tools-service-logo" src="../images/customerservice.png" alt="">
            </a>
        </div>
    </div>

<script type="text/javascript" src="../../js/jquery-3.3.1.js"></script>
    <script>
        $(document).ready(function(){
            $(".nav-tools-search-logo").click(function () {
                $(".nav-tools-search-logo").addClass("display-none");
                $(".nav-tools-search-input").addClass("display-block");

            })
        })
    </script>
</body>

</html>