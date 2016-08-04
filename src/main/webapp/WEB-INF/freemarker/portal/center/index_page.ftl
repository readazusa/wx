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
<div class="mui-content mui-scroll-wrapper" style="margin-bottom: 50px;">
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
        <div class="my-center-bar">
            <a id="defaultTab" class="mui-tab-item" href="tab-webview-subpage-about.html">
                <span class="mui-icon mui-icon-home my-center-bar-icon">
                </span>
                <span class="order-number">1</span>
                <span class="mui-tab-label">待付款</span>
            </a>
            <a class="mui-tab-item" href="tab-webview-subpage-chat.html">
                <span class="mui-icon mui-icon-email my-center-bar-icon"></span>
                <span class="mui-tab-label">待发货</span>
            </a>
            <a class="mui-tab-item" href="tab-webview-subpage-contact.html">
                <span class="mui-icon mui-icon-trash my-center-bar-icon"></span>
                <span class="mui-tab-label">待收货</span>
            </a>
            <a class="mui-tab-item" href="${base}/center/goto/index_page.htm">
                <span class="mui-icon mui-icon-contact my-center-bar-icon"></span>
                <span class="mui-tab-label">已完成</span>
            </a>
            <a class="mui-tab-item" href="tab-webview-subpage-contact.html">
                <span class="mui-icon mui-icon-trash my-center-bar-icon"></span>
                <span class="mui-tab-label">退货/售后</span>
            </a>
        </div>
        <ul class="mui-table-view my-center-all-order">
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="${base}/order/goto/all_page.htm" class="mui-navigate-right">
                    <#--<img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">-->
                    <div class="mui-media-body my-center-p">
                        <p>全部订单
                            <span style="float: right;color: silver;font-size: 10px;padding-right: 20px;">查看全部已购宝贝</span>
                        </p>
                    </div>
                </a>
            </li>
        </ul>

        <ul class="mui-table-view my-center-all-order" style="margin-top: 5px;">
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="javascript:;" class="mui-navigate-right">
                <#--<img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">-->
                    <div class="mui-media-body my-center-p">
                        <p>购物车
                            <span style="float: right;color: silver;font-size: 10px;padding-right: 20px;">查看全部已购宝贝</span>
                        </p>
                    </div>
                </a>
            </li>
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="javascript:;" class="mui-navigate-right">
                <#--<img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">-->
                    <div class="mui-media-body my-center-p">
                        <p>浏览器记录
                            <span style="float: right;color: silver;font-size: 10px;padding-right: 20px;">查看全部已购宝贝</span>
                        </p>
                    </div>
                </a>
            </li>
        </ul>

        <ul class="mui-table-view my-center-all-order" style="margin-top: 5px;">
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="javascript:;" class="mui-navigate-right">
                <#--<img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">-->
                    <div class="mui-media-body my-center-p">
                        <p>我的余额
                            <span style="float: right;color: silver;font-size: 10px;padding-right: 20px;">查看全部已购宝贝</span>
                        </p>
                    </div>
                </a>
            </li>
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="javascript:;" class="mui-navigate-right">
                <#--<img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">-->
                    <div class="mui-media-body my-center-p">
                        <p>我的积分
                            <span style="float: right;color: silver;font-size: 10px;padding-right: 20px;">查看全部已购宝贝</span>
                        </p>
                    </div>
                </a>
            </li>
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="javascript:;" class="mui-navigate-right">
                <#--<img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">-->
                    <div class="mui-media-body my-center-p">
                        <p>优惠券
                            <span style="float: right;color: silver;font-size: 10px;padding-right: 20px;">查看全部已购宝贝</span>
                        </p>
                    </div>
                </a>
            </li>
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="javascript:;" class="mui-navigate-right">
                <#--<img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">-->
                    <div class="mui-media-body my-center-p">
                        <p>收货地址
                            <span style="float: right;color: silver;font-size: 10px;padding-right: 20px;">查看全部已购宝贝</span>
                        </p>
                    </div>
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
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        mui("body").on('tap', 'a', function () {
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
