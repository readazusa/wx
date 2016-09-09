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
    <h1 class="mui-title">选择收货地址</h1>
    <button class="mui-btn   mui-btn-link mui-pull-right my-yj-head-right"
            onclick="doManageYj('${base}/yj/goto/yj_list_page.htm');">管理
    </button>
</header>
<div class="mui-content mui-scroll-wrapper">
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
            <#else>
                <li class="mui-table-view-cell">
                    <a class="mui-navigate-right my-navigate-addr" href="#">
                        <div class="my-order-address">
                            <div class="my-order-address-body">
                                <span style="text-align: center">没有地址，请添加</span>
                            </div>
                        </div>
                    </a>
                </li>
            </#if>
        </ul>
    </div>
</div>
    <@common.muiJS></@common.muiJS>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.fastclickJS></@common.fastclickJS>
<script type="application/javascript">
    $(function () {
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        FastClick.attach(document.body);
    });

    function doManageYj(url) {
        mui.openWindow({
            id: url,
            url: url
        });
    }

</script>
</body>
</html>
</#escape>
