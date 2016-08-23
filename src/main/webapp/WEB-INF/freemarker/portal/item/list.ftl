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
<header class="mui-bar mui-bar-nav my-item-list-header">
<ul id="headerul">
<li><div>默认</div>
    </li>
    <li>
        销量
        <i class="iconfont icon-paixu my-header-icon">
        </i>
    </li>
    <li>新品
        <i class="iconfont icon-paixu my-header-icon">
        </i></li>
    <li>价格
        <i class="iconfont icon-paixu my-header-icon">
        </i></li>
</ul>
</header>
<div class="mui-content mui-scroll-wrapper" id="refreshContainer">
    <div class="mui-scroll my-trans-duration">
    <ul class="mui-table-view" style="margin-top: 5px;">
        <li class="mui-table-view-cell mui-media my-list-item">
            <a href="javascript:;">
            <img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">
            <div class="mui-media-body">
                <p class='my-item-list-title'>能和心爱的人一起睡是件幸福的事可是打呼噜怎么办的事可是打呼噜怎么办打呼噜怎么办</p>
                <div><span class="iconfont icon-iconfontgouwuche my-item-list-shop-cart"></span></div>
                <div class="my-item-bottom">
                    <span class="mui-badge mui-badge-inverted">￥</span><span style="color: red">3499</span>
                    <span class="mui-badge mui-badge-inverted my-item-right-10" >购买人数:10</span>
                </div>
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
    <a class="mui-tab-item" href="${base}/order/goto/shop_cart.htm">
        <img src="http://1551sp9557.imwork.net:8888/20160820/aa91e23fd3804a8e9d370deaac9dc164.png"  class="my-head-pic">
    </a>
    <a class="mui-tab-item" href="${base}/order/goto/shop_cart.htm" id="icon-cart">
        <span class="my-shop-cart-bz">1</span>
        <span class="mui-icon-extra mui-icon-extra-cart"></span>
        <span class="mui-tab-label">购物车</span>
    </a>
    <a class="mui-tab-item" href="${base}/center/goto/index_page.htm">
        <span class="mui-icon mui-icon-contact"></span>
        <span class="mui-tab-label">发现</span>
    </a>
</nav>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.muiJS></@common.muiJS>
    <@common.fastclickJS></@common.fastclickJS>
    <@common.flyJS></@common.flyJS>
<script type="application/javascript">
    $(function () {
        FastClick.attach(document.body);
        mui.init({
            pullRefresh: {
                container: "#refreshContainer",//下拉刷新容器标识，querySelector能定位的css选择器均可，比如：id、.class等
                down: {
                    height: 50,//可选,默认50.触发下拉刷新拖动距离,
                    auto: false,//可选,默认false.自动下拉刷新一次
                    contentdown: "下拉可以刷新",//可选，在下拉可刷新状态时，下拉刷新控件上显示的标题内容
                    contentover: "释放立即刷新",//可选，在释放可刷新状态时，下拉刷新控件上显示的标题内容
                    contentrefresh: "正在刷新...",//可选，正在刷新状态时，下拉刷新控件上显示的标题内容
                    callback: pulldownfresh //必选，刷新函数，根据具体业务来编写，比如通过ajax从服务器获取新数据；
                },
                up:{
                    contentrefresh : "正在加载...",//可选，正在加载状态时，上拉加载控件上显示的标题内容
                    contentnomore:'没有更多数据了',//可选，请求完毕若没有更多数据时显示的提醒内容；
                    callback:pullupfresh
                }
            }
        });


        $("#headerul li").on("click",function(){
           var children = $(this).children("i");
            //icon-16pxshengjiangxu
            if($(children).html()){
               if($(children).hasClass("icon-16pxshengjiangxu")){
                   $(children).removeClass("icon-16pxshengjiangxu").addClass("icon-shengxu")
                   //after-icon-shengxu
               }else if($(children).hasClass("icon-shengxu")) {
                   $(children).removeClass("icon-shengxu").addClass("icon-jiangxu-copy")

               }else{
                   $(children).removeClass("icon-jiangxu-copy").addClass("icon-shengxu")
               }
            }
        });
        var offset = $("#icon-cart").offset();
        $(".my-item-list-shop-cart").click(function(event){
            var flyer = $('<img class="flyer-img" src="http://1551sp9557.imwork.net:8888/20160820/aa91e23fd3804a8e9d370deaac9dc164.png">');

            flyer.fly({
                start: {
                    left: event.pageX,
                    top: event.pageY
                },
                end: {
                    left: offset.left + 10,//抛物体终点横坐标
                    top: offset.top + 10, //抛物体终点纵坐标
                },
                onEnd: function() {
                    alert("结束");
//                    $("#tip").show().animate({width: '200px'},300).fadeOut(500);////成功加入购物车动画效果
//                    this.destory(); //销毁抛物体
                }
            });

        });
    });



    function pulldownfresh() {
//        alert("刷新");
        mui('#refreshContainer').pullRefresh().endPulldownToRefresh();
    }

    function pullupfresh(){
//        alert("上啦刷新");
        this.endPullupToRefresh(false);
    }
</script>
</body>
</html>
</#escape>
