<#import "../../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <title>快乐购</title>
    <@common.light7CSS></@common.light7CSS>
    <@common.allCSS></@common.allCSS>
    <@common.jqueryJS></@common.jqueryJS>
</head>
<body>
<div class="page">
    <nav class="bar bar-tab">
        <a class="tab-item active" href="${base}/portal/index.htm">
            <span class="icon icon-home"></span>
            <span class="tab-label">店铺</span>
        </a>
        <a class="tab-item" href="${base}/portal/cart.htm">
            <span class="icon icon-share"></span>
            <span class="tab-label">分享</span>
        </a>
        <a class="tab-item" href="${base}/portal/cart.htm">
            <span class="icon icon-cart"></span>
            <span class="tab-label">加入购物车</span>
        </a>
        <a class="tab-item external" href="${base}/pay/create.htm" id="choiceImage">
            <span class="icon icon-me"></span>
            <span class="tab-label">立即购买</span>
        </a>
    </nav>
    <div class="content">
        <div class="card">
            <div class="card-header">
                <div class="swiper-container" data-space-between='30' data-pagination='.swiper-pagination'
                     data-autoplay="2000" data-pagination-clickable="true">
                    <div class="swiper-wrapper" id="picswiper">
                        <div class="swiper-slide"><img
                                src="//gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i1/TB1n3rZHFXXXXX9XFXXXXXXXXXX_!!0-item_pic.jpg_320x320q60.jpg"
                                alt=""></div>
                        <div class="swiper-slide"><img
                                src="//gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i4/TB10rkPGVXXXXXGapXXXXXXXXXX_!!0-item_pic.jpg_320x320q60.jpg"
                                alt=""></div>
                        <div class="swiper-slide"><img
                                src="//gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i1/TB1kQI3HpXXXXbSXFXXXXXXXXXX_!!0-item_pic.jpg_320x320q60.jpg"
                                alt=""></div>
                    </div>
                    <div class="swiper-pagination"></div>
                </div>
            </div>
            <div class="card-content">
                <div class="card-content-inner">
                    按时大大大大声道爱迪生阿萨德按时按时撒撒撒旦按时按时
                </div>
                <div class="card-content-inner">
                    价格:￥
                </div>
            </div>
        </div>
        <div class="card">
            <div class="card-header">宝贝评价:</div>
            <div class="card-content">
                <div class="card-content-inner">非常好</div>
            </div>
            <div class="card-footer">更多评价</div>
        </div>
    </div>
</div>
<script type="application/javascript">
    $(function () {
        if (typeof WeixinJSBridge == "undefined"){
            if( document.addEventListener ){
                document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
            }else if (document.attachEvent){
                document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
                document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
            }
        }else{
            onBridgeReady();
        }
    });

    function onBridgeReady(){
        WeixinJSBridge.invoke('getBrandWCPayRequest',{
            "appId":"${wxPayConfig.appId}",
            "timeStamp":"${wxPayConfig.timeStamp}",
            "nonceStr":"${wxPayConfig.nonceStr}",
            "package":"${wxPayConfig.payPackage}",
            "signType":"${wxPayConfig.signType}",
            "paySign":"${wxPayConfig.paySign}"
        }, function (resp) {
            $.alert("微信支付的返回结果： "+ resp.err_msg);
        });
    }
</script>

    <@common.light7JS></@common.light7JS>
    <@common.wxJS></@common.wxJS>
</body>
</html>
</#escape>
