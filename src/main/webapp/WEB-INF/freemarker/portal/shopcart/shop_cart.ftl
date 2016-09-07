<#import  "../../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <title>快乐购</title>
    <@common.muiCSS></@common.muiCSS>
    <@common.commonCSS></@common.commonCSS>
    <@common.iconfontCSS></@common.iconfontCSS>
</head>
<body>

<div class="mui-content mui-scroll-wrapper" style="margin-bottom: 60px;">
    <div class="mui-scroll" id="mui-scroll">
        <#if shopcarts??>
            <#list shopcarts as shopcart>
                <ul id="OA_task_1" class="mui-table-view my-table-shopcart-ul shop_${shopcart.itemId}">
                    <li class="mui-table-view-cell mui-media">
                        <div class="mui-slider-right mui-disabled">
                            <a class="mui-btn mui-btn-red mui-del my-denger-color" itemId="${shopcart.itemId}">删除</a>
                        </div>
                        <div class="mui-media-body mui-slider-handle">
                            <span class="my-shopcart-choice  iconfont icon-yuan" itemId="${shopcart.itemId}"
                                  itemPrice="${shopcart.price}" itemTitle="${shopcart.title}"
                                  itemUrl= ${shopcart.picUrl}></span>
                            <img class="my-shopcart-media" src="${shopcart.picUrl}">
                            <div class="my-shopcart-content">
                                <div>${shopcart.title}</div>
                                <div class="my-shop-cart-db">
                                    <span class="my-shop-cart-price">￥${shopcart.price}</span>
                                    <div class="mui-numbox my-numbox" data-numbox-min="1">
                                        <button class="mui-btn mui-btn-numbox-minus" type="button">-</button>
                                        <input class="mui-input-numbox" type="number" value="${shopcart.num}"
                                               id="num_${shopcart.itemId}" itemId="${shopcart.itemId}"/>
                                        <button class="mui-btn mui-btn-numbox-plus" type="button">+</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                </ul>
            </#list>
        <#else>
        </#if>
    </div>
</div>

<nav class="mui-bar mui-bar-tab">
    <div class="my-view-bar-div" style="width: 70%;">
        <div class="my-shopcart-choice-div">
            <span class="my-nav-shopcart-choice iconfont icon-yuan"></span>
            <span class="my-bav-shopcart-choice-all">全选</span>
        </div>

        <div class="my-view-shopcart">
            合计:<span style="font-size: small;color: red">￥</span><span style="color: red" id="totalPrice">0</span>
            <span style="font-size: small;color: silver;padding-right: 10px;">不含运费</span>
        </div>
    </div>
    <div class="my-view-bar-div" style="width: 30%;">
        <div class="my-view-var-div-btn" style="width: 100%;background-color: red">
            结算(<span id="buyCount">0</span>)
        </div>
    </div>
</nav>
    <@common.muiJS></@common.muiJS>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.myCommonJS></@common.myCommonJS>
    <@common.mapJS></@common.mapJS>
<script type="application/javascript">


    var itemNumMap = new HashMap();
    var itemPriceMap = new HashMap();
    var itemTitleMap = new HashMap();
    var itemUrlMap = new HashMap();
    var itemIdAry = new Array();



    $(function () {
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        $('#mui-scroll').on('tap', '.mui-del', function () {
            var itemId = $(this).attr("itemId");
            $(".shop_" + itemId).remove();
            MyObj.ajaxSubmit("${base}/shopcart/del_shopcart.json",{"itemId":itemId},"get",delShopCart);
            removeMapKey(itemId);
            setPriceAndCount();
        });


        $(".mui-scroll").on("tap", ".my-shopcart-choice", function () {
            var itemId = $(this).attr("itemId");
            var itemPrice = $(this).attr("itemPrice");
            var itemTitle = $(this).attr("itemTitle");
            var itemUrl = $(this).attr("itemUrl");
            var itemNum = $("#num_" + itemId).val();
            if ($(this).hasClass("icon-xuanze")) {
                $(this).removeClass("icon-xuanze");
                $(this).addClass("icon-yuan");
                removeMapKey(itemId);
            } else {
                $(this).removeClass("icon-yuan");
                $(this).addClass("icon-xuanze");
                itemNumMap.put(itemId, itemNum);
                itemPriceMap.put(itemId, itemPrice);
                itemTitleMap.put(itemId, itemTitle);
                itemUrlMap.put(itemId, itemUrl);
                itemIdAry.push(itemId);
            }
            setPriceAndCount();
        });

        $(".my-shopcart-choice-div").on("tap", ".my-nav-shopcart-choice", function () {
            if ($(this).hasClass("icon-xuanze")) {
                $(this).removeClass("icon-xuanze");
                $(this).addClass("icon-yuan");
                $("#mui-scroll .my-shopcart-choice").each(function (index) {
                    $(this).removeClass("icon-xuanze").addClass("icon-yuan");
                });
                itemNumMap.clear();
                itemPriceMap.clear();
                itemTitleMap.clear();
                itemUrlMap.clear();
                itemIdAry.clear();
            } else {
                $(this).removeClass("icon-yuan");
                $(this).addClass("icon-xuanze");
                $("#mui-scroll .my-shopcart-choice").each(function (index) {
                    $(this).removeClass("icon-yuan").addClass("icon-xuanze");
                    var itemId = $(this).attr("itemId");
                    var itemPrice = $(this).attr("itemPrice");
                    var itemTitle = $(this).attr("itemTitle");
                    var itemUrl = $(this).attr("itemUrl");
                    var itemNum = $("#num_" + itemId).val();
                    itemNumMap.put(itemId, itemNum);
                    itemPriceMap.put(itemId, itemPrice);
                    itemTitleMap.put(itemId, itemTitle);
                    itemUrlMap.put(itemId, itemUrl);
                    itemIdAry.push(itemId);
                });
            }
            setPriceAndCount();
        });

        $(".mui-input-numbox").on("change", function () {
            var itemId = $(this).attr("itemId");
            var num = $(this).val();
            itemNumMap.put(itemId, num);
            setPriceAndCount();
        })
    });

    function removeMapKey(itemId) {
        itemNumMap.remove(itemId);
        itemPriceMap.remove(itemId);
        itemTitleMap.remove(itemId);
        itemUrlMap.remove(itemId);
        itemIdAry.remove(itemId);
    }


    function setPriceAndCount() {
        $("#buyCount").html(itemIdAry.length);
        var totalPrice = 0;
        $.each(itemIdAry, function (index, obj) {
            var count = itemNumMap.get(obj);
            var price = itemPriceMap.get(obj);
            totalPrice += count * price;
        })
        $("#totalPrice").html(totalPrice);
    }


    function  delShopCart(resp){
        mui.alert("购物车以删除");
    }
</script>
</body>
</html>
</#escape>
