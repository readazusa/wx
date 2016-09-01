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
        <ul class="mui-table-view" style="margin-top: 5px;background-color: #efeff4;">
            <li class="mui-table-view-cell mui-media my-list-item">
                <a href="javascript:;">
                    <img class="my-mui-media-object mui-pull-left" src="http://120.26.208.194:8888/yd//cbd.jpg">
                    <div class="mui-media-body">
                        <p class='my-ellipsis'>${buyItemInfo.title}</p>
                        <div class="my-item-bottom">
                            <span class="mui-badge mui-badge-inverted">￥</span><span
                                style="color: red">${buyItemInfo.price}</span>
                            <span class="mui-badge mui-badge-inverted my-item-left-200">X<span style="font-size: 15px;">{{buyCount}}</span></span>
                        </div>
                    </div>
                </a>
            </li>
        </ul>
        <div class="my-order-number">
            <span>
                购买数量   </span>
            <div class="mui-numbox my-numbox" data-numbox-min="1" data-numbox-max="${buyItemInfo.stock}">
                <button class="mui-btn mui-btn-numbox-minus" type="button">-</button>
                <input class="mui-input-numbox" type="number" v-model="buyCount" />
                <button class="mui-btn mui-btn-numbox-plus" type="button">+</button>
            </div>
        </div>
        <div class="my-order-ps">
            <span>配送方式  ${buyItemInfo.sendMethod}</span>
            <span class="my-order-yj-price">快递 ￥${buyItemInfo.postage}</span>
        </div>
        <div class="my-order-liuyan">
            <textarea placeholder="给卖家留言...." v-model="ly"></textarea>
        </div>
    </div>
</div>

<form>
    <input type="hidden" name="itemId" value="${buyItemInfo.itemId}">
    <input type="hidden" name="totalPrice" v-model="totalPrice">
    <input type="hidden" name="count" v-model="buyCount">
    <input type="hidden" name="title" value="${buyItemInfo.title}">
    <input type="hidden" name="postage" value="${buyItemInfo.postage}">
    <input type="hidden" name="price"  value="${buyItemInfo.price}">
    <input type="hidden" name="ly" v-model="ly">
</form>



<nav class="mui-bar mui-bar-tab">
    <div class="my-view-bar-div" style="width: 70%;">
        <div class="my-view-buy-price">
            合计:<span style="font-size: small;color: red">￥</span><span style="color: red">{{totalPrice}}</span>
        </div>
    </div>
    <div class="my-view-bar-div" style="width: 30%;">
        <div class="my-view-var-div-btn" style="width: 100%;background-color: red" onclick="doBuy();">
            确定
        </div>
    </div>
</nav>
    <@common.muiJS></@common.muiJS>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.fastclickJS></@common.fastclickJS>
    <@common.vueJS></@common.vueJS>
<@common.myCommonJS></@common.myCommonJS>

<script type="application/javascript">
    var vue= null;
    $(function () {
        FastClick.attach(document.body);
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        vue =  new Vue({
            el:"body",
            data:{
                buyCount:${buyItemInfo.buyCount},
                price:${buyItemInfo.price},
                postage:${buyItemInfo.postage}
            },
            computed:{
                totalPrice:function(){
                    return this.buyCount*this.price+this.postage;
                }
            }
        })
    });

    function doBuy() {
        MyObj.ajaxSubmit("${base}/pay/create.json",null,"get",pay);
    }
    function  pay(resp){
        WeixinJSBridge.invoke('getBrandWCPayRequest',{
            "appId":resp.appId,
            "timeStamp":resp.timeStamp,
            "nonceStr":resp.nonceStr,
            "package":resp.payPackage,
            "signType":resp.signType,
            "paySign":resp.paySign
        }, function (res) {

            alert("微信支付的返回结果： "+ res.err_msg);
        });
    }

</script>
</body>
</html>
</#escape>
