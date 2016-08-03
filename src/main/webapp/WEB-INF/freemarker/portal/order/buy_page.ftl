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
        <ul class="mui-table-view">
            <li class="mui-table-view-cell">
                <a class="mui-navigate-right" href="${base}/yj/goto/yj_page.htm">
                    <div class="my-order-address">
                        <div class="my-order-address-header">
                            <span class="my-order-address-name">收货人:糖糖</span>
                        <span class="my-order-address-mobile">
                            13412341234
                        </span>
                        </div>
                        <div class="my-order-address-body">
                            收件地址:百度开放云邀请到全民TV罗辑思维直播技术负责人以及团队中的资深技
                        </div>
                    </div>
                </a>
            </li>
        </ul>
        <ul class="mui-table-view" style="margin-top: 5px;">
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="javascript:;">
                    <img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">
                    <div class="mui-media-body">
                        <p class='my-ellipsis'>能和心爱的人一起睡觉，是件幸福的事情；可是，打呼噜怎么办？</p>
                        <div class="my-item-bottom">
                            <span class="mui-badge mui-badge-inverted">￥</span><span style="color: red">3499</span>
                            <span class="mui-badge mui-badge-inverted my-item-left-170">X<i style="font-size: 20px;">1</i></span>
                        </div>
                    </div>
                </a>
            </li>
        </ul>
        <div class="my-order-number">
            <span>
                购买数量   </span><div class="mui-numbox my-numbox">
                <button class="mui-btn mui-btn-numbox-minus" type="button">-</button>
                <input class="mui-input-numbox" type="number" />
                <button class="mui-btn mui-btn-numbox-plus" type="button">+</button>
            </div>
        </div>
        <div class="my-order-ps">
            <span>配送方式</span>
            <span class="my-order-yj-price">快递 ￥12</span>
        </div>
        <div class="my-order-liuyan">
                <textarea placeholder="给卖家留言...."></textarea>
        </div>
    </div>
</div>

<nav class="mui-bar mui-bar-tab">
    <div class="my-view-bar-div" style="width: 70%;">
        <div class="my-view-buy-price">
            合计:<span style="font-size: small;color: red">￥</span><span style="color: red">1234</span>
        </div>
    </div>
    <div class="my-view-bar-div" style="width: 30%;">
        <div class="my-view-var-div-btn" style="width: 100%;background-color: red">
            确定
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
    });


</script>
</body>
</html>
</#escape>
