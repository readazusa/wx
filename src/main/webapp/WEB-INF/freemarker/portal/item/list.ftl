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
        <li>
            <div>默认</div>
        </li>
        <li orderName="sales">
            销量
            <i class="iconfont icon-paixu my-header-icon">
            </i>
        </li>
        <li orderName="listtime">新品
            <i class="iconfont icon-paixu my-header-icon">
            </i></li>
        <li orderName="price">价格
            <i class="iconfont icon-paixu my-header-icon">
            </i></li>
    </ul>
</header>
<div class="mui-content mui-scroll-wrapper" id="refreshContainer" style="margin-bottom: 50px;">
    <div class="mui-scroll my-trans-duration">
        <ul class="mui-table-view" id="listItemHtml">
        </ul>
        <input type="hidden" id="orderName">
        <input type="hidden" id="orderValue">
        <input type="hidden" id="search" value="${search?default("")}">
        <input type="hidden" id="pageIndex" value="1">
    </div>
</div>
<nav class="mui-bar mui-bar-tab">
    <a id="defaultTab" class="mui-tab-item mui-active" href="${base}/portal/index.htm">
        <span class="mui-icon mui-icon-home"></span>
        <span class="mui-tab-label">首页</span>
    </a>
    <a class="mui-tab-item" href="tab-webview-subpage-chat.html">
        <span class="mui-icon mui-icon-email"></span>
        <span class="mui-tab-label">消息</span>
    </a>
    <a class="mui-tab-item" href="${base}/shopcart/index.htm">
        <img src="http://1551sp9557.imwork.net:8888/20160820/aa91e23fd3804a8e9d370deaac9dc164.png" class="my-head-pic">
    </a>
    <a class="mui-tab-item" href="${base}/shopcart/index.htm" id="icon-cart">
        <span class="my-shop-cart-bz my-shop-cart-bz-hidden"></span>
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
    <@common.myCommonJS></@common.myCommonJS>
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
                up: {
                    contentrefresh: "正在加载...",//可选，正在加载状态时，上拉加载控件上显示的标题内容
                    contentnomore: '没有更多数据了',//可选，请求完毕若没有更多数据时显示的提醒内容；
                    callback: pullupfresh
                }
            }
        });
        $("#headerul li").on("click", function () {
            var children = $(this).children("i");
            if ($(children).html()) {
                if ($(children).hasClass("icon-paixu")) {
                    MyObj.removeOrderClass(this);
                    $(this).addClass("my-color-red");
                    $(children).removeClass("icon-paixu").addClass("icon-shengxu my-color-red");
                    setOrder(this, "asc");
                } else if ($(children).hasClass("icon-shengxu")) {
                    $(children).removeClass("icon-shengxu").addClass("icon-jiangxu-copy");
                    setOrder(this, "desc");
                } else {
                    $(children).removeClass("icon-jiangxu-copy").addClass("icon-shengxu");
                    setOrder(this, "asc");
                }
            }
        });
        if ("1" == $("#pageIndex").val()) {
            init();
        } else {
            loadItemListByCache();
        }

        mui(".mui-bar-tab").on("tap","a",function(){
            var href = this.href;
            mui.openWindow({
                id: href,
                url: href,
                show: {
                    autoShow: true,//页面loaded事件发生后自动显示，默认为true
                }
            });
        })

        mui("#listItemHtml").on('tap', '.my-item-list-shop-cart', function () {
            var btn = mui.gestures.session.firstTouch.touches[0];
            MyObj.addShopCart(this.id,this.getAttribute("url"),btn,"#icon-cart",".my-shop-cart-bz");
        });

        MyObj.ajaxSubmit("${base}/shopcart/shop_cart_count.json",null,"get",MyObj.loadShopCartCountByOpenId)
    });

    function init() {
        var data = {
            "search": $("#search").val(),
            "pageIndex": $("#pageIndex").val()
        }
        MyObj.ajaxSubmit("${base}/item/search/list.json", data, "post", insertHtml);
    }

    //插入初始化的页面数据
    function insertHtml(resp) {

        if ("SUCCESS" == resp.code) {
            sessionStorage.removeItem("search_list_item");
            var newPageIndex =  resp.data.currentPage+1;
            $("#pageIndex").val(newPageIndex);
            var itemHtml = loadHtml(resp.data.data);
            $("#listItemHtml").append(itemHtml);
            var oldSearchListItemHtml = sessionStorage.getItem("search_list_item");
            if (oldSearchListItemHtml) {
                sessionStorage.setItem("search_list_item", oldSearchListItemHtml + itemHtml);
            } else {
                sessionStorage.setItem("search_list_item", itemHtml);
            }


//            $(".my-item-list-shop-cart").bind("click",function(){
//                alert(33123);
//            });
        }
    }

    function loadHtml(data) {
        var liHtml = "";
        data.forEach(function (obj) {
            liHtml += '<li class="mui-table-view-cell mui-media my-list-item">' +
//                    '<a href="javascript:">' +
                    '<img class="my-mui-media-object mui-pull-left" src="' + obj.phonePicUrl + '" onclick="gotoHref(\'${base}/item/goto/view.htm?uid='+obj.uid+'\');">' +
                    '<div class="mui-media-body">' +
                    '<p class="my-item-list-title">' + obj.title + '</p>' +
                    '<div><span class="iconfont icon-iconfontgouwuche my-item-list-shop-cart" id="'+obj.uid+'" url="'+obj.phonePicUrl+'"></span></div>' +
//                    '<div><span class="iconfont icon-iconfontgouwuche my-item-list-shop-cart" onclick="addShopCart(\'' + obj.uid + '\',\''+obj.phonePicUrl+'\')"></span></div>' +
                    '<div class="my-item-bottom">' +
                    '<span class="mui-badge mui-badge-inverted">￥</span><span style="color: red">' + obj.price + '</span>' +
                    '<span class="mui-badge mui-badge-inverted my-item-right-10">购买人数:' + obj.purchaseNumber + '</span>' +
                    '</div>' +
                    '</div>' +
//                    '</a>' +
                    '</li>';
        });
        return liHtml;
    }
    function addShopCart(uid,url) {
        var event = window.event;
//        mui.alert(event.type+",  "+ event.pageX);
           var offset = $("#icon-cart").offset();
        var top = offset.top;
        var left = offset.left;

        var flyer = $('<img class="flyer-img" src="' + url + '">');
        flyer.fly({
            start: {
                left: event.pageX,//抛物体起点横坐标
                top: event.pageY //抛物体起点纵坐标
            },
            end: {
                left: offset.left + 10,//抛物体终点横坐标
                top: offset.top + 10 //抛物体终点纵坐标
            },
            onEnd: function() {
                $(".flyer-img").remove();
                var oldShopCartNum = $(".my-shop-cart-bz").html();
                if(!oldShopCartNum){
                    oldShopCartNum = 0;
                    $(".my-shop-cart-bz").removeClass("my-shop-cart-bz-hidden")
                }
                var newShopCartNum = parseInt(oldShopCartNum)+1;
                $(".my-shop-cart-bz").html(newShopCartNum);
            }
        });

        var data={"id":uid};
        MyObj.ajaxSubmit("${base}/shopcart/add.json?id"+uid,data,"get");

    }

    function setOrder(obj, orderValue) {

        var orderName = $(obj).attr("orderName");
        $("#orderName").val(orderName);
        $("#orderValue").val(orderValue);
        $("#pageIndex").val("1");
        var data = {
            "search": $("#search").val(),
            "orderName": orderName,
            "orderValue": orderValue
        }
        MyObj.ajaxSubmit("${base}/item/search/list.json", data, "post", doExecuteData);
    }

    //初始化排序的内容
    function doExecuteData(resp) {
        if (resp.code == "SUCCESS") {
            sessionStorage.removeItem("search_list_item");
            var newPageIndex = parseInt($("#pageIndex").val()) + resp.data.currentPage;
            $("#pageIndex").val(newPageIndex);
            var itemHtml = loadHtml(resp.data.data);
            $("#listItemHtml").empty().append(itemHtml);
            sessionStorage.setItem("search_list_item", itemHtml);
            mui('#refreshContainer').pullRefresh().refresh(true);
        }
    }

    //当页面返回到本页的时候，使用缓存中的数据
    function loadItemListByCache() {
        var itemHtml = sessionStorage.getItem("search_list_item")
        $("#listItemHtml").append(itemHtml);
    }


    function pulldownfresh() {
        sessionStorage.removeItem("search_list_item");
        $("#pageIndex").val("1");
        var data = {
            "search": $("#search").val(),
            "orderName": $("#orderName").val(),
            "orderValue": $("#orderValue").val()
        };
        MyObj.ajaxSubmit("${base}/item/search/list.json", data, "post", pulldownfreshHtml)
    }

    function pulldownfreshHtml(resp){
         if("SUCCESS" == resp.code){
             var newPageIndex =  resp.data.currentPage+1;
             $("#pageIndex").val(newPageIndex);
             var itemHtml = loadHtml(resp.data.data);
             $("#listItemHtml").empty().append(itemHtml);
             sessionStorage.setItem("search_list_item",itemHtml);
             mui('#refreshContainer').pullRefresh().endPulldownToRefresh();
             mui('#refreshContainer').pullRefresh().refresh(true);
         }
    }

    function pullupfresh() {
        var data = {
            "search": $("#search").val(),
            "pageIndex":$("#pageIndex").val(),
            "orderName": $("#orderName").val(),
            "orderValue": $("#orderValue").val()
        };
        MyObj.ajaxSubmit("${base}/item/search/list.json", data, "post", pullupfreshHtml)
    }

    var total = 1;
    function  pullupfreshHtml(resp){
        total++;
        if("SUCCESS" == resp.code){
            var totalPage = resp.data.totalPage;
            var newPageIndex =  resp.data.currentPage+1;
            $("#pageIndex").val(newPageIndex);
            var itemHtml = loadHtml(resp.data.data);
            $("#listItemHtml").append(itemHtml);
            var oldSearchListItemHtml = sessionStorage.getItem("search_list_item");
            if (oldSearchListItemHtml) {
                sessionStorage.setItem("search_list_item", oldSearchListItemHtml + itemHtml);
            } else {
                sessionStorage.setItem("search_list_item", itemHtml);
            }
            mui('#refreshContainer').pullRefresh().endPullupToRefresh(total >= totalPage);
        }
    }

</script>
</body>
</html>
</#escape>
