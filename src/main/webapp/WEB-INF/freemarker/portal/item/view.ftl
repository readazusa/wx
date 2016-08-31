<#import "../../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <title>快乐购</title>
    <@common.muiCSS></@common.muiCSS>
    <@common.commonCSS></@common.commonCSS>
    <@common.iconfontCSS></@common.iconfontCSS>
    <@common.myImageViewCSS></@common.myImageViewCSS>
    <@common.muiAppCSS></@common.muiAppCSS>
    <@common.animateCSS></@common.animateCSS>
</head>
<body>

<div class="mui-content mui-scroll-wrapper" style="margin-bottom: 50px;">
    <div class="mui-scroll">
        <div id="slider" class="mui-slider">
            <div class="mui-slider-group mui-slider-loop" id="item_view_page_slider_loop" style="width: 100%;height: 250px;">
                <#--<div class="mui-slider-item mui-slider-item-duplicate">-->
                    <#--<a href="#">-->
                        <#--<img src="http://120.26.208.194:8888/yd/shuijiao.jpg">-->
                    <#--</a>-->
                <#--</div>-->
                <#--<div class="mui-slider-item">-->
                    <#--<a href="#">-->
                        <#--<img src="http://120.26.208.194:8888/yd/yuantiao.jpg" data-preview-src=""-->
                             <#--data-preview-group="1">-->
                    <#--</a>-->
                <#--</div>-->
                <#--<div class="mui-slider-item">-->
                    <#--<a href="#">-->
                        <#--<img src="http://120.26.208.194:8888/yd/cbd.jpg" data-preview-src="" data-preview-group="1">-->
                    <#--</a>-->
                <#--</div>-->
                <#--<div class="mui-slider-item">-->
                    <#--<a href="#">-->
                        <#--<img src="http://120.26.208.194:8888/yd/muwu.jpg" data-preview-src="" data-preview-group="1">-->
                    <#--</a>-->
                <#--</div>-->
                <#--<div class="mui-slider-item">-->
                    <#--<a href="#">-->
                        <#--<img src="http://120.26.208.194:8888/yd/shuijiao.jpg" data-preview-src=""-->
                             <#--data-preview-group="1">-->
                    <#--</a>-->
                <#--</div>-->

                <#--<div class="mui-slider-item mui-slider-item-duplicate">-->
                    <#--<a href="#">-->
                        <#--<img src="http://120.26.208.194:8888/yd/yuantiao.jpg">-->
                    <#--</a>-->
                <#--</div>-->
            </div>
            <div class="mui-slider-indicator" id="item_view_page_slider_indicator">
                <#--<div class="mui-indicator mui-active"></div>-->
                <#--<div class="mui-indicator"></div>-->
                <#--<div class="mui-indicator"></div>-->
                <#--<div class="mui-indicator"></div>-->
            </div>
        </div>
        <ul class="mui-table-view">
            <li class="mui-table-view-cell mui-media">
                <#--<a href="javascript:;">-->
                    <#--<img class="mui-media-object mui-pull-right" src="http://120.26.208.194:8888/yd/yuantiao.jpg">-->
                    <div class="mui-pull-right my-item-view-share" onclick="doShare('${uid}')">
                        <span class="mui-icon-extra mui-icon-extra-share"></span>
                        <span>分享</span>
                    </div>
                    <div class="mui-media-body">
                        <p class='my-two-ellipsis' id="itemTitle"></p>
                        <span id="itemPrice">价格￥12</span>
                        <p id="itemPostage">
                            快递:
                        </p>
                    </div>
                <#--</a>-->
            </li>
        </ul>
        <div id="slider" class="mui-slidertt">
            <div id="sliderSegmentedControl"
                 class="mui-slider-indicator mui-segmented-control mui-segmented-control-inverted">
                <a class="mui-control-item" href="#item1mobile">
                    图文详情
                </a>
                <a class="mui-control-item" href="#item2mobile">
                    产品参数
                </a>
                <a class="mui-control-item" href="#item3mobile">
                    宝贝推荐
                </a>
            </div>
            <div id="sliderProgressBar" class="mui-slider-progress-bar mui-col-xs-4"></div>
            <div class="mui-slider-group">
                <div id="item1mobile" class="mui-slider-item mui-control-content mui-active">
                    <#--<p>-->
                        <#--<img src="http://120.26.208.194:8888/yd/shuijiao.jpg">-->
                        <#--<img src="http://120.26.208.194:8888/yd/shuijiao.jpg">-->
                        <#--<img src="http://120.26.208.194:8888/yd/shuijiao.jpg">-->
                    <#--</p>-->
                </div>
                <div id="item2mobile" class="mui-slider-item mui-control-content">
                    产品参数
                </div>
                <div id="item3mobile" class="mui-slider-item mui-control-content">
                    宝贝推荐
                </div>
                <p style="text-align: center">已经到底部啦</p>
            </div>
        </div>
    </div>
</div>
<div class="my-popover-win">
    <div class="my-buy-div">
        <div class="my-buy-div-img">
            <img src="http://120.26.208.194:8888/yd/shuijiao.jpg" id="buyPic">
        </div>
        <span class="my-close">x</span>
        <div class="my-buy-detal">
            <p id="buyTitle">静静的看这个世界，最后终于疯了a阿达大的撒阿萨德阿萨德</p>
            <p id="buyPrice">￥234.00</p>
        </div>
    </div>
    <div class="my-buy-number">
        <span style="float: left;margin-right: 5px; margin-top: 7px;">
           购买数量
           </span>
        <span class="my-buy-number-kc" id="buyStock">库存:12</span>
        <div class="mui-numbox my-numbox" data-numbox-min="1" data-numbox-max="${stock?default(5)}">
            <button class="mui-btn mui-btn-numbox-minus" type="button">-</button>
            <input class="mui-input-numbox" type="number" />
            <button class="mui-btn mui-btn-numbox-plus" type="button">+</button>
        </div>
    </div>
    <div class="my-buy-btn">
        <button type="button" class="mui-btn mui-btn-danger mui-btn-block" style="background-color: red" onclick="doBuyOrder('${base}/order/goto/buy_page.htm')">确定</button>
    </div>
</div>

<nav class="mui-bar mui-bar-tab">
    <div class="my-view-bar-div" style="width: 40%;">
        <div class="my-icon">
            <span class="mui-icon mui-icon-trash"></span>
            <span class="mui-tab-label">客服</span>
        </div>
        <div class="my-icon">
            <span class="mui-icon mui-icon-trash"></span>
            <span class="mui-tab-label">店铺</span>
        </div>
        <div class="my-icon" id="icon-cart">
            <span class="my-shop-cart-view-bz my-shop-cart-bz-hidden"></span>
            <span class="mui-icon-extra mui-icon-extra-cart my-item-view-icon" ></span>
            <span class="mui-tab-label">购物车</span>
        </div>
    </div>
    <div class="my-view-bar-div" style="width: 60%;" >
        <div class="my-view-var-div-btn" style="width: 55%;background-color:#f1ad4e" id="item-view-shop-cart" itemId ="${uid}" >
            加入购物车
        </div>
        <div class="my-view-var-div-btn" style="width: 45%;background-color: red"
             onclick="doBuy('${base}/order/goto/buy_page.htm');">
            立即购买
        </div>
    </div>
</nav>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.muiJS></@common.muiJS>
    <@common.muiZoomJS></@common.muiZoomJS>
    <@common.muiImageViewJS></@common.muiImageViewJS>
    <@common.flyJS></@common.flyJS>
    <@common.myCommonJS></@common.myCommonJS>
    <@common.fastclickJS></@common.fastclickJS>
<script type="application/javascript">

    $(function () {
        mui.previewImage();
        MyObj.ajaxSubmit("${base}/item/load_item.json",{"itemId":"${uid}"},"get",MyObj.loadItemInViewPage);
        initMui();
        FastClick.attach(document.body);
        $("#item-view-shop-cart").bind("click",function(e){
            var itemId = $(this).attr("itemId");
            var url = $(this).attr("pic");
            MyObj.addShopCart(itemId,url,e,"#icon-cart",".my-shop-cart-view-bz");
        });

        MyObj.ajaxSubmit("${base}/shopcart/shop_cart_count.json",null,"get",initShopCart)

    });
    function initShopCart(resp){
        if(resp.code = "SUCCESS"){
            var shopCartCountByOpenId = resp.data;
            if(shopCartCountByOpenId){
                if("0" != shopCartCountByOpenId){
                    $(".my-shop-cart-view-bz").html(shopCartCountByOpenId);
                    $(".my-shop-cart-view-bz").removeClass("my-shop-cart-bz-hidden")
                }
            }
        }
    }


    function initMui() {
        (function ($) {
            $('.mui-scroll-wrapper').scroll({
                indicators: true //是否显示滚动条
            });
        })(mui);
    }

    function doBuyOrder(url){
        mui.openWindow({
            id:url,
            url:url
        });
    }
    function doBuy(url) {
        $.showWin();
//
    }

    function doShare(itemId){

    }

</script>
</body>
</html>
</#escape>
