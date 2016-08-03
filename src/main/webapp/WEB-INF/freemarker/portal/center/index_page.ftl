<#import "../../config/common.ftl" as common>
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
    <@common.iconfontCSS></@common.iconfontCSS>
</head>
<body>
<div class="mui-content mui-scroll-wrapper">
    <div class="mui-scroll">
        <ul class="mui-table-view">
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="javascript:;">
                    <img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">
                    <div class="mui-media-body my-center-p">
                        <p>糖糖糖</p>
                        <p></p>
                        <p>121313123123</p>
                    </div>
                </a>
            </li>
        </ul>

        <ul class="mui-table-view" style="margin-top: 5px;">
            <li class="mui-table-view-cell my-center-li">

                <a id="defaultTab" class="mui-tab-item mui-active" href="tab-webview-subpage-about.html">
                    <span class="mui-icon mui-icon-home"></span>
                    <span class="mui-tab-label">首页</span>
                </a>
                <a class="mui-tab-item" href="tab-webview-subpage-chat.html">
                    <span class="mui-icon mui-icon-email"></span>
                    <span class="mui-tab-label">消息</span>
                </a>
                <a class="mui-tab-item" href="tab-webview-subpage-contact.html">
                    <span class="mui-icon mui-icon-trash"></span>
                    <span class="mui-tab-label">购物车</span>
                </a>
                <a class="mui-tab-item" href="${base}/center/goto/index_page.htm">
                    <span class="mui-icon mui-icon-contact"></span>
                    <span class="mui-tab-label">我的购</span>
                </a>

            </li>
        </ul>
    </div>
</div>

<nav class="mui-bar mui-bar-tab">
    <a id="defaultTab" class="mui-tab-item mui-active" href="tab-webview-subpage-about.html">
        <span class="mui-icon mui-icon-home"></span>
        <span class="mui-tab-label">首页</span>
    </a>
    <a class="mui-tab-item" href="tab-webview-subpage-chat.html">
        <span class="mui-icon mui-icon-email"></span>
        <span class="mui-tab-label">消息</span>
    </a>
    <a class="mui-tab-item" href="tab-webview-subpage-contact.html">
        <span class="mui-icon mui-icon-trash"></span>
        <span class="mui-tab-label">购物车</span>
    </a>
    <a class="mui-tab-item" href="${base}/center/goto/index_page.htm">
        <span class="mui-icon mui-icon-contact"></span>
        <span class="mui-tab-label">我的购</span>
    </a>
</nav>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.muiJS></@common.muiJS>
<script type="application/javascript">
    $(function () {
        mui(".mui-bar-tab").on('tap', 'a', function () {
            var href = this.href;
            mui.openWindow({
                id: href,
                url: href,
                show: {
                    autoShow: true,//页面loaded事件发生后自动显示，默认为true
                }
            });
        });
    });


</script>
</body>
</html>
</#escape>
