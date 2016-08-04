<#import  "../../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <title>快乐购</title>
    <@common.muiCSS></@common.muiCSS>
    <@common.commonCSS></@common.commonCSS>
</head>
<body>

<div class="mui-content mui-scroll-wrapper">
    <div class="mui-scroll">
        <ul id="OA_task_1" class="mui-table-view my-table-shopcart-ul">
            <li class="mui-table-view-cell mui-media">
                <div class="mui-slider-right mui-disabled">
                    <a class="mui-btn mui-btn-red">删除</a>
                </div>
                <div class="mui-media-body mui-slider-handle">
                    <span class="my-shopcart-choice"></span>
                    <img class="my-shopcart-media" src="http://120.26.208.194:8888/yd//cbd.jpg">
                    左滑显示删除按钮
                </div>
            </li>
        </ul>
        <ul id="OA_task_1" class="mui-table-view my-table-shopcart-ul">
            <li class="mui-table-view-cell mui-media">
                <div class="mui-slider-right mui-disabled">
                    <a class="mui-btn mui-btn-red">删除</a>
                </div>
                <div class="mui-media-body mui-slider-handle">
                    <span class="my-shopcart-choice"></span>
                    <img class="my-shopcart-media" src="http://120.26.208.194:8888/yd//cbd.jpg">
                    左滑显示删除按钮
                </div>
            </li>
        </ul>
    </div>
</div>

<nav class="mui-bar mui-bar-tab">
    <div class="my-view-bar-div" style="width: 70%;">
        <div class="my-shopcart-choice-div">
            <span class="my-nav-shopcart-choice">3</span>
            <span class="my-bav-shopcart-choice-all">全选</span>
        </div>

        <div class="my-view-shopcart">
            合计:<span style="font-size: small;color: red">￥</span><span style="color: red">1234</span>
            <span style="font-size: small;color: silver;padding-right: 10px;">不含运费</span>
        </div>
    </div>
    <div class="my-view-bar-div" style="width: 30%;">
        <div class="my-view-var-div-btn" style="width: 100%;background-color: red">
            结算(5)
        </div>
    </div>
</nav>
    <@common.muiJS></@common.muiJS>
    <@common.jqueryJS></@common.jqueryJS>
<script type="application/javascript">
    $(function () {
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        $('#OA_task_1').on('tap', '.mui-btn', function(event) {
            mui.alert("是否删除");
        });
    });


</script>
</body>
</html>
</#escape>
