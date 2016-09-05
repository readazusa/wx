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
    <@common.iconfontCSS></@common.iconfontCSS>
</head>
<body>

<div class="mui-content mui-scroll-wrapper">
    <div class="mui-scroll">
        <ul id="OA_task_1" class="mui-table-view my-table-shopcart-ul">
            <li class="mui-table-view-cell mui-media">
                <div class="mui-slider-right mui-disabled">
                    <a class="mui-btn mui-btn-red">删除</a>
                </div>
                <div class="mui-media-body mui-slider-handle">
                    <span class="my-shopcart-choice  iconfont icon-xuanze"></span>
                    <img class="my-shopcart-media" src="http://120.26.208.194:8888/yd//cbd.jpg">
                    <div class="my-shopcart-content">
                        <div>爱上的离开的空间撒打卡机卡看到骄傲的 俺是啊</div>
                        <div class="my-shop-cart-db">
                            <span class="my-shop-cart-price">￥199.00</span>
                            <div class="mui-numbox my-numbox" data-numbox-min="1">
                                <button class="mui-btn mui-btn-numbox-minus" type="button">-</button>
                                <input class="mui-input-numbox" type="number" />
                                <button class="mui-btn mui-btn-numbox-plus" type="button">+</button>
                            </div>
                        </div>

                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>

<nav class="mui-bar mui-bar-tab">
    <div class="my-view-bar-div" style="width: 70%;">
        <div class="my-shopcart-choice-div">
            <span class="my-nav-shopcart-choice iconfont icon-yuan"></span>
            <span class="my-bav-shopcart-choice-all">全选</span>
        </div>

        <div class="my-view-shopcart">
            合计:<span style="font-size: small;color: red">￥</span><span style="color: red">1234</span>
            <span style="font-size: small;color: silver;padding-right: 10px;">不含运费</span>
        </div>
    </div>
    <div class="my-view-bar-div" style="width: 30%;">
        <div class="my-view-var-div-btn" style="width: 100%;background-color: red">
            结算(5)
        </div>
    </div>
</nav>
    <@common.muiJS></@common.muiJS>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.myCommonJS></@common.myCommonJS>
<script type="application/javascript">
    $(function () {
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        $('#OA_task_1').on('tap', '.mui-btn', function(event) {
            mui.alert("是否删除");
        });

        $(".mui-scroll").on("tap",".my-shopcart-choice",function(){
               if($(this).hasClass("icon-xuanze")){
                   $(this).removeClass("icon-xuanze");
                   $(this).addClass("icon-yuan");
               }else{
                   $(this).removeClass("icon-yuan");
                   $(this).addClass("icon-xuanze");
               }
        });
        MyObj.ajaxSubmit("${base}/shopcart/load_shop_cart.json",null,"get",insertShopCart);

    });

    function insertShopCart(resp){
        if(resp.code = "SUCCESS"){
            resp.data.forEach(function(e){

            });
        }
    }


</script>
</body>
</html>
</#escape>
