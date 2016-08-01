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
</head>
<body>

<div class="mui-content">
    <div id="slider" class="mui-slider">
        <div class="mui-slider-group mui-slider-loop">
            <div class="mui-slider-item mui-slider-item-duplicate">
                <a href="#">
                    <img src="http://120.26.208.194:8888/yd/shuijiao.jpg">
                </a>
            </div>
            <div class="mui-slider-item">
                <a href="#">
                    <img src="http://120.26.208.194:8888/yd/yuantiao.jpg" data-preview-src="" data-preview-group="1">
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
                    <img src="http://120.26.208.194:8888/yd/shuijiao.jpg" data-preview-src="" data-preview-group="1">
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



    <div id="slider" class="mui-slider" style="background-color: #fff">
        <div id="sliderSegmentedControl"
             class="mui-slider-indicator mui-segmented-control mui-segmented-control-inverted">
            <a class="mui-control-item" href="#item1mobile">
                图文详情
            </a>
            <a class="mui-control-item" href="#item3mobile">
                产品参数
            </a>
        </div>
        <div class="mui-slider-group">
            <div id="item1mobile" class="mui-slider-item mui-control-content mui-active">
                <div id="scroll1" class="mui-scroll-wrapper">
                    <div class="mui-scroll">
                        <ul class="mui-table-view">
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-1
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-2
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-3
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-4
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-5
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-6
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-7
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-8
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-9
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-10
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-11
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-12
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-13
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-14
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-15
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-16
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-17
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-18
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-19
                            </li>
                            <li class="mui-table-view-cell">
                                第一个选项卡子项-20
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div id="item3mobile" class="mui-slider-item mui-control-content">
                <div id="scroll3" class="mui-scroll-wrapper">
                    <div class="mui-scroll">
                        <div class="mui-loading">
                            <div class="mui-spinner">
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
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
        <div class="my-view-var-div-btn" style="width: 55%;background-color: #f0ad4e">
            加入购物车
        </div>
        <div class="my-view-var-div-btn" style="width: 45%;background-color: red">
            立即购买
        </div>
    </div>
</nav>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.muiJS></@common.muiJS>
    <@common.muiZoomJS></@common.muiZoomJS>
    <@common.muiImageViewJS></@common.muiImageViewJS>
<script type="application/javascript">

    $(function () {
        mui.previewImage();
    });

</script>
</body>
</html>
</#escape>
