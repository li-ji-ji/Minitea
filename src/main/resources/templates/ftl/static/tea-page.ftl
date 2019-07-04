<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../css/tea-page.css">
</head>

<body>
    <div class="header-import-box">
    	<#include "./public-nav.ftl">
    </div>
    <div class="main-box">
        <div class="header-nav">
            <div class="logo-text-box">
                <span>小罐茶</span>
            </div>
            <div class="header-tool-box">
                <ul class="header-tool-nav-box">
                    <a href="#" class="header-tool-nav-box-item">原料</a>
                    <a href="#" class="header-tool-nav-box-item">工艺</a>
                    <a href="#" class="header-tool-nav-box-item">包装</a>
                    <a href="#" class="header-tool-nav-box-item">体验</a>
                </ul>
                <div class="header-tool-btn-box">
                    <a href="#" class="header-tool-btn-buy">立即购买</a>
                </div>
            </div>
        </div>
        <div class="introduce-main-box">
            <!--介绍部分1-->
            <div class="title-introduce-box">
                <p>
                    <span class="title-text color-white">${pageConfigs[0].value1}</span>
                    <span class="title-icon color-white">${pageConfigs[0].value2}</span>
                </p>
                <p>
                    <span class="title-ad-text color-brown-tint">${pageConfigs[0].value3}</span>
                </p>
                <div class="tea-down-decorate" href="#">
                ${pageConfigs[0].value4}
                </div>
            </div>
            <!--介绍部分2 轮播图-->
            <div class="introduce-scroll-pic-box">
                <div class="scroll-img-box">
                    <input type="radio" name="img-btn" class="img-btn" id="img-1" checked>
                    <img class="scroll-img" src="${pageConfigs[1].pic3}" alt="">
                    <label class="btn-left" for="img-3">
                        <img class="btn-img" src="${pageConfigs[1].pic2}" alt="">
                    </label>
                    <label class="btn-right" for="img-2">
                        <img class="btn-img" src="${pageConfigs[1].pic1}" alt="">
                    </label>
                </div>
                <div class="scroll-img-box">
                    <input type="radio" name="img-btn" class="img-btn" id="img-2">
                    <img class="scroll-img" src="${pageConfigs[1].pic4}" alt="">
                    <label class="btn-left" for="img-1">
                        <img class="btn-img" src="${pageConfigs[1].pic2}" alt="">
                    </label>
                    <label class="btn-right" for="img-3">
                        <img class="btn-img" src="${pageConfigs[1].pic1}" alt="">
                    </label>
                </div>
                <div class="scroll-img-box">
                    <input type="radio" name="img-btn" class="img-btn" id="img-3">
                    <img class="scroll-img" src="${pageConfigs[1].pic5}" alt="">
                    <label class="btn-left" for="img-2">
                        <img class="btn-img" src="${pageConfigs[1].pic2}" alt="">
                    </label>
                    <label class="btn-right" for="img-1">
                        <img class="btn-img" src="${pageConfigs[1].pic1}" alt="">
                    </label>
                </div>
            </div>
            <!--介绍部分3-->
            <div class="introduce-standard-box">
                <div class="introduce-standard-title">${pageConfigs[2].value1}</div>
                <div class="introduce-standard-content-box">
                    <div class="introduce-standard-content-item">
                        <img src="${pageConfigs[2].pic1}" alt="">
                        <span class="introduce-standard-content-text">${pageConfigs[2].value2}</span>
                    </div>
                    <div class="introduce-standard-content-item">
                        <img src="${pageConfigs[2].pic2}" alt="">
                        <span class="introduce-standard-content-text">${pageConfigs[2].value3}</span>
                    </div>
                    <div class="introduce-standard-content-item">
                        <img src="${pageConfigs[2].pic3}" alt="">
                        <span class="introduce-standard-content-text">${pageConfigs[2].value4}</span>
                    </div>
                    <div class="introduce-standard-content-item">
                        <img src="${pageConfigs[2].pic4}" alt="">
                        <span class="introduce-standard-content-text">${pageConfigs[2].value5}</span>
                    </div>
                </div>
            </div>
            <!--介绍部分4-->
            <div class="introduce-place-box">
                <div class="color-white font-50">${pageConfigs[3].value1}</div>
                <div class="color-white font-30">${pageConfigs[3].value2}</div>
                <a href="#" class="introduce-place-more color-white more">
                    ${pageConfigs[3].value3}
                </a>
            </div>
            <!--介绍部分5-->
            <div class="introduce-taste-box">
                <div class="color-brown-thin font-34">${pageConfigs[4].value1}</div>
                <div class="color-white font-16" style="width: 60%;">${pageConfigs[4].value2}</div>                
                <div>
                    <img src="${pageConfigs[4].pic1}" alt="">
                </div>
            </div>
            <!--介绍模块6-->
            <div class="introduce-work-box">
                <div class="color-white font-50">${pageConfigs[5].value1}</div>
                <div class="color-white font-30">${pageConfigs[5].value2}</div>
                <a href="#" class="introduce-work-more color-white more">
                ${pageConfigs[5].value3}
                </a>
            </div>
            <!--介绍部分8-->
            <div class="introduce-taste-box">
                <div class="color-brown-thin font-34">${pageConfigs[6].value1}</div>
                <div class="color-white font-16" style="width: 60%;">${pageConfigs[6].value2}</div>                
                <div>
                    <img src="${pageConfigs[6].pic1}" alt="">
                </div>
            </div>
            <!--介绍模块9-->
            <div class="introduce-new-box">
                <div class="color-white font-50">${pageConfigs[7].value1}</div>
                <div class="color-white font-30">${pageConfigs[7].value1}</div>
                <div class="color-white">${pageConfigs[7].value2}</div>
                <a href="#" class="introduce-place-more color-white more">
                   ${pageConfigs[7].value4}
                </a>
            </div>
            <!--介绍部分10-->
            <div class="introduce-taste-box">
                <div class="color-brown-thin font-34">${pageConfigs[8].value1}</div>
                <div class="color-white font-16" style="width: 60%;">${pageConfigs[8].value2}</div>                
                <div>
                    <img src="${pageConfigs[8].pic1}" alt="">
                </div>
            </div>
            <!--介绍模块11：了解更多-->
            <div class="introduce-more-box">
                <div class="color-white font-50">${pageConfigs[9].value1}</div>
                <div class="color-white font-30">${pageConfigs[9].value2}</div>
                <a href="#" class="introduce-place-more color-white more">
                   ${pageConfigs[9].value3}
                </a>
            </div>
            <!--介绍模块12-->
            <div class="introduce-price-box">
                <div class="color-brown-thin font-34">${pageConfigs[10].value1}</div>
                <div class="color-white font-16" style="width: 60%;">${pageConfigs[10].value2}</div>                
                
            </div>
            <!--介绍模块13：选择-->
            <div class="introduce-choose-box">
                <div class="line-decorate"></div>
                <div class="color-brown-thin font-50">${pageConfigs[11].value1}</div>
                <div class="line-decorate" style="width: 100%; margin:60px 0;"></div>
            </div>
        </div>
    </div>
    <div class="header-import-box">
    	<#include "./public-footer.ftl">
    </div>
<script type="text/javascript" src="../../js/jquery-3.3.1.js"></script>
    <script>
    $(document).ready(function(){
    	$(".header-nav").addClass("margin-top-78");
    })
    $(document).scroll(function(){
    	if($(document).scrollTop()==0)
    		{
    		$(".header-nav").addClass("margin-top-78");
    		}
    	if($(document).scrollTop()>=78)
    		{
    		$(".header-nav").removeClass("margin-top-78");
    		}
    })
    </script>
</body>

</html>