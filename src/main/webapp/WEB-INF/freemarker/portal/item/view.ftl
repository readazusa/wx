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
    <@common.wxJS></@common.wxJS>

</head>
<body>
<div class="page">
    <style>
        .popup-overlay {
            right: 0px;
            left: auto;
            top: 0px;
        }
        .modal-overlay, .popup-overlay {
            position: fixed;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            background: rgba(0,0,0,.8);
            z-index: 10600;
            visibility: hidden;
            opacity: 0;
            transition-duration: .4s;
        }
        .popup-overlay {
            z-index: 10200;
        }

        .popup {
            min-height: 5rem;
        }
        .popup {
            position: fixed;
            bottom: 0;
            left: 0;
            z-index: 10400;
            display: none;
            width: 100%;
            top: auto;
            height: auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            -webkit-overflow-scrolling: touch;
            background: #fff;
            -webkit-transition-property: -webkit-transform;
            -o-transition-property: -o-transform;
            transition-property: transform;
            -webkit-transform: translate3d(0,100%,0);
            transform: translate3d(0,100%,0);
        }

        .popup-sku .goods-summary .thumb img {
            border-radius: .25rem;
            min-height: 100%;
            max-height: 100%;
        }
    </style>
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
        <a class="tab-item buyItem" href="#">
            <span class="icon icon-me"></span>
            <span class="tab-label">去购买</span>
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

    <div class="popup popup-sku">
        <div class="goods-summary">

            <div class="thumb"><img
                    src="http://120.26.208.194:8888/yd/1.jpg">
            </div>
            <div class="detail" style="white-space: nowrap;">
                <p class="title">石榴面膜</p>
                <div class="price-scope cart-price-num" style="margin-left: 4rem;top: 4rem;position: absolute;">
                     ￥<span class="money">53.00</span>
                </div>
            </div>
            <div class="close-popup if if-close"></div>
        </div>
        <div class="popup-sku-content" >
            <ul class="sku-control cart-sku-control"></ul>
            <div class="quantity-control clearfix"><label>数量</label>
                <div class="quantity" style="float: right;top: 0.5rem;position: relative;">
                    <button class="minus cart-num-minus disabled"><i class="if if-minis"></i></button>
                    <input type="number" name="cart-num" value="1">
                    <button class="plus cart-num-plus">
                        <i class="if if-plus"></i>
                    </button>
                </div>
                <div class="stock">库存：<span class="cart-stock-num">0</span></div>
            </div>

            <div class="popup-options">
                <button type="button" class="button button-fill button-danger my-btn" style="width: 100%">确认</button>
            </div>
        </div>
    </div>
    <script TYPE="application/javascript">
        $(function () {
            var myPhotoBrowserStandalone = $.photoBrowser({
                photos: [
                    '//img.alicdn.com/tps/i3/TB1kt4wHVXXXXb_XVXX0HY8HXXX-1024-1024.jpeg',
                    '//img.alicdn.com/tps/i1/TB1SKhUHVXXXXb7XXXX0HY8HXXX-1024-1024.jpeg',
                    '//img.alicdn.com/tps/i4/TB1AdxNHVXXXXasXpXX0HY8HXXX-1024-1024.jpeg',
                ],
            });
            $("#picswiper").on('click', function () {
                myPhotoBrowserStandalone.open();
            });

            $(document).on('click', '.buyItem', function () {
                $.popup(".popup-sku");
            });
        });

    </script>
</div>
    <@common.light7JS></@common.light7JS>
<script type="application/javascript">
    $(function () {
        $.init();
    });
</script>
</body>
</html>
</#escape>
