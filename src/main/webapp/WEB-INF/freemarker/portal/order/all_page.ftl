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
    <div id="slider" class="mui-slider" >
        <div id="sliderSegmentedControl"
             class="mui-slider-indicator mui-segmented-control mui-segmented-control-inverted">
            <a class="mui-control-item mui-active" name="#my-order-all">
                全部
            </a>
            <a class="mui-control-item" name="#my-order-dfk" >
                待付款
            </a>
            <a class="mui-control-item" name="#my-order-dfh">
                待发货
            </a>
            <a class="mui-control-item" name="#my-order-dsh">
                待收货
            </a>
            <a class="mui-control-item" name="#my-order-dpj">
                待评价
            </a>
        </div>
</header>
<div class="mui-content mui-scroll-wrapper">
    <div class="mui-scroll" id="my-order-all-scroll" >
        <div class="my-order-tab my-order-active" id="my-order-all">
            <div class="mui-card">
                <div class="mui-card-header">
                    订单:ESWS201603122123123
                </div>
                <div class="mui-card-content">

                    <div class="mui-card-content-inner my-card-content-inner">
                        <img src="http://120.26.208.194:8888/yd//cbd.jpg" class="my-card-content-img">
                        <p style="color: #333;">这里显示文章摘要，让读者对文章内容有个粗略的概念...</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">总价:</a>
                    <a class="mui-card-link">详情</a>
                </div>
            </div>
            <div class="mui-card">
                <div class="mui-card-header">
                    订单:ESWS201605121234
                </div>
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">这里显示文章摘要，让读者对文章内容有个粗略的概念...</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
        </div>
        <div class="my-order-tab" id="my-order-dfk">
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待付款</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
                <div class="mui-card-header">
                    订单:ESWS201605121234
                </div>
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">这里显示文章摘要，让读者对文章内容有个粗略的概念...</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待付款</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待付款</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待付款</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待付款</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待付款</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待付款</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待付款</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
        </div>
        <div class="my-order-tab" id="my-order-dfh">
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待发货</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
                <div class="mui-card-header">
                    订单:ESWS201605121234
                </div>
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">这里显示文章摘要，让读者对文章内容有个粗略的概念...</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
        </div>
        <div class="my-order-tab" id="my-order-dsh">
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待收货</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
                <div class="mui-card-header">
                    订单:ESWS201605121234
                </div>
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">这里显示文章摘要，让读者对文章内容有个粗略的概念...</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
        </div>
        <div class="my-order-tab" id="my-order-dpj">
            <div class="mui-card">
            <#--<div class="mui-card-header mui-card-media" style="height:40vw;background-image:url(../images/cbd.jpg)"></div>-->
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">待评价</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
            <div class="mui-card">
                <div class="mui-card-header">
                    订单:ESWS201605121234
                </div>
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <p>Posted on January 18, 2016</p>
                        <p style="color: #333;">这里显示文章摘要，让读者对文章内容有个粗略的概念...</p>
                    </div>
                </div>
                <div class="mui-card-footer">
                    <a class="mui-card-link">Like</a>
                    <a class="mui-card-link">Read more</a>
                </div>
            </div>
        </div>
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
        mui(".mui-slider").on('tap', 'a', function () {
             var tabId = this.name;
             $(".my-order-tab").each(function(){
                  $(this).removeClass("my-order-active");
             });
            $(tabId).addClass("my-order-active");
            mui('.mui-scroll-wrapper').scroll().scrollTo(0,0,100);//100毫秒滚动到顶
        });
    });

</script>
</body>
</html>
</#escape>
