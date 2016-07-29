<#import "../../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <title>快乐购</title>
    <@common.muiCSS></@common.muiCSS>
    <@common.commonCSS></@common.commonCSS>
    <@common.iconfontCSS></@common.iconfontCSS>
</head>
<body>
    <div class="mui-content">
        <div id="slider" class="mui-slider">
            <div class="mui-slider-group mui-slider-loop">
                <div class="mui-slider-item mui-slider-item-duplicate">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/cbd.jpg">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/shuijiao.jpg">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/yuantiao.jpg">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/cbd.jpg">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/yuantiao.jpg">
                    </a>
                </div>
                <div class="mui-slider-item mui-slider-item-duplicate">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/cbd.jpg">
                    </a>
                </div>
            </div>
            <div class="mui-slider-indicator">
                <div class="mui-indicator mui-active"></div>
                <div class="mui-indicator"></div>
                <div class="mui-indicator"></div>
                <div class="mui-indicator"></div>
            </div>
        </div>
    </div>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.muiJS></@common.muiJS>
</body>
</html>
</#escape>
