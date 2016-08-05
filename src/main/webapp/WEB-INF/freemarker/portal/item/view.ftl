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
            <div class="mui-slider-group mui-slider-loop">
                <div class="mui-slider-item mui-slider-item-duplicate">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/shuijiao.jpg">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/yuantiao.jpg" data-preview-src=""
                             data-preview-group="1">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/cbd.jpg" data-preview-src="" data-preview-group="1">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/muwu.jpg" data-preview-src="" data-preview-group="1">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/shuijiao.jpg" data-preview-src=""
                             data-preview-group="1">
                    </a>
                </div>
                <div class="mui-slider-item mui-slider-item-duplicate">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/yuantiao.jpg">
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
        <ul class="mui-table-view">
            <li class="mui-table-view-cell mui-media">
                <a href="javascript:;">
                    <img class="mui-media-object mui-pull-right" src="http://120.26.208.194:8888/yd/yuantiao.jpg">
                    <div class="mui-media-body">
                        <p class='my-two-ellipsis'>静静的看这个世界，最后终于疯了a阿达大的撒阿萨德阿萨德</p>
                        <span>价格￥12</span>
                        <p>
                            快递:
                        </p>
                    </div>
                </a>
            </li>
        </ul>
        <div id="slider" class="mui-slider">
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
                    <p>
                        <img src="http://120.26.208.194:8888/yd/shuijiao.jpg">
                        <img src="http://120.26.208.194:8888/yd/shuijiao.jpg">
                        <img src="http://120.26.208.194:8888/yd/shuijiao.jpg">
                    </p>
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
            <img src="http://120.26.208.194:8888/yd/shuijiao.jpg">
        </div>
        <span class="my-close">x</span>
        <div class="my-buy-detal">
            <p>静静的看这个世界，最后终于疯了a阿达大的撒阿萨德阿萨德</p>
            <p> ￥234.00</p>
        </div>
    </div>
    <div class="my-buy-number">
        <span style="float: left;margin-right: 5px; margin-top: 7px;">购买数量</span>
        <span class="my-buy-number-kc">库存:12</span>
        <div class="mui-numbox my-numbox">
            <button class="mui-btn mui-btn-numbox-minus" type="button">-</button>
            <input class="mui-input-numbox" type="number"/>
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
        <div class="my-icon">
            <span class="mui-icon mui-icon-trash"></span>
            <span class="mui-tab-label">收藏</span>
        </div>
    </div>
    <div class="my-view-bar-div" style="width: 60%;">
        <div class="my-view-var-div-btn" style="width: 55%;background-color:#f1ad4e">
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
    <@common.myCommonJS></@common.myCommonJS>
<script type="application/javascript">

    $(function () {
        mui.previewImage();
        initMui();
    });

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
</script>
</body>
</html>
</#escape>
