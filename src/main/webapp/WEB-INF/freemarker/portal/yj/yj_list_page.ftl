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
<header class="mui-bar mui-bar-nav">
    <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left"></a>
    <h1 class="mui-title">管理收货地址</h1>
</header>
<div class="mui-content mui-scroll-wrapper" style="margin-bottom: 50px;">
    <div class="mui-scroll">
        <ul class="mui-table-view">
            <#if (yjInfos?size>0)>
                <#list yjInfos as yjInfo>
                    <li class="mui-table-view-cell">
                        <a class="mui-navigate-right my-navigate-addr" href="#">
                            <div class="my-order-address">
                                <div class="my-order-address-header">
                                    <span class="my-order-address-name">收货人:${yjInfo.receiverName}</span>
                        <span class="my-order-address-mobile">
                        ${yjInfo.receiverMobile}
                        </span>
                                </div>
                                <div class="my-order-address-body">
                                ${yjInfo.province}${yjInfo.city}${yjInfo.country}${yjInfo.address}
                                </div>
                            </div>
                        </a>
                    </li>
                </#list>
            </#if>
        </ul>
    </div>
</div>
<nav class="mui-bar mui-bar-tab my-bar-center">
    <div class="mui-btn mui-btn-primary" onclick="doNew('${base}/yj/goto/yj_new_page.htm');">
        添加新地址
    </div>
</nav>
    <@common.muiJS></@common.muiJS>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.fastclickJS></@common.fastclickJS>
<script type="application/javascript">
    $(function () {
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        FastClick.attach(document.body);
        mui(".mui-table-view").on('tap', 'a', function () {
            var url = this.href;
            mui.openWindow({
                id: url,
                url: url
            });
        });
    });
    function doNew(url) {
        mui.openWindow({
            id: url,
            url: url
        });
    }

</script>
</body>
</html>
</#escape>
