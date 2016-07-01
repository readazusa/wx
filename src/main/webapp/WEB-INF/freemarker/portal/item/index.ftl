<#import "../../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <title>快乐购</title>
    <@common.light7CSS></@common.light7CSS>
    <@common.allCSS></@common.allCSS>
    <@common.jqueryJS></@common.jqueryJS>
</head>
<body>
<div class="page-group">
    <div class="page">
        <header class="bar bar-nav">
                <span class="icon icon-code" style="position: absolute"></span>
                    <div class="searchbar row wx_top_bar_search">
                        <div class="search-input col-85">
                            <input type="search" id="search" placeholder="query...">
                        </div>
                        <a class="button button-fill button-primary col-15" style="top:.10rem;"><span class="icon icon-search"></span></a>
                    </div>
        </header>
        <nav class="bar bar-tab">
            <a class="tab-item active" href="${base}/portal/index.htm">
                <span class="icon icon-home"></span>
                <span class="tab-label">首页</span>
            </a>
            <a class="tab-item" href="${base}/protal/tj.htm">
                <span class="icon icon-gift"></span>
                <span class="tab-label">特价专卖</span>
            </a>
            <a class="tab-item" href="${base}/portal/cart.htm">
                <span class="icon icon-cart"></span>
                <span class="tab-label">购物车</span>
            </a>
            <a class="tab-item" href="#">
                <span class="icon icon-me"></span>
                <span class="tab-label">我的</span>
            </a>
        </nav>
        <div class="content pull-to-refresh-content infinite-scroll" data-ptr-distance="55" data-distance="10">
            <div class="pull-to-refresh-layer">
                <div class="preloader"></div>
                <div class="pull-to-refresh-arrow"></div>
            </div>
            <div class="card">
                <div class="card-content">
                    <div class="list-block media-list">
                        <ul id="append">
                            <li>
                                <a href="${base}/item/view.htm?uid=1235#####" class="item-link item-content">
                                <div class="item-media">
                                    <img src="http://120.26.208.194:8888/yd/1.jpg" width="80">
                                </div>
                                <div class="item-inner">
                                     <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div>
                                    <div class="item-subtitle">运费:￥6</div>
                                    <div class="item-subtitle">价格:￥50</div>
                                </div>
                                </a>
                            </li>
                            <li>
                                <a href="${base}/item/view.htm?uid=123" class="item-link item-content">
                                    <div class="item-media">
                                        <img src="http://120.26.208.194:8888/yd/1.jpg" width="80">
                                    </div>
                                    <div class="item-inner">
                                        <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div>
                                        <div class="item-subtitle">运费:￥6</div>
                                        <div class="item-subtitle">价格:￥50</div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="${base}/item/view.htm?uid=123" class="item-link item-content">
                                    <div class="item-media">
                                        <img src="http://120.26.208.194:8888/yd/1.jpg" width="80">
                                    </div>
                                    <div class="item-inner">
                                        <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div>
                                        <div class="item-subtitle">运费:￥6</div>
                                        <div class="item-subtitle">价格:￥50</div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="${base}/item/view.htm?uid=123" class="item-link item-content">
                                    <div class="item-media">
                                        <img src="http://120.26.208.194:8888/yd/1.jpg" width="80">
                                    </div>
                                    <div class="item-inner">
                                        <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div>
                                        <div class="item-subtitle">运费:￥6</div>
                                        <div class="item-subtitle">价格:￥50</div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="${base}/item/view.htm?uid=123" class="item-link item-content">
                                    <div class="item-media">
                                        <img src="http://120.26.208.194:8888/yd/1.jpg" width="80">
                                    </div>
                                    <div class="item-inner">
                                        <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div>
                                        <div class="item-subtitle">运费:￥6</div>
                                        <div class="item-subtitle">价格:￥50</div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="${base}/item/view.htm?uid=123" class="item-link item-content">
                                    <div class="item-media">
                                        <img src="http://120.26.208.194:8888/yd/1.jpg" width="80">
                                    </div>
                                    <div class="item-inner">
                                        <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div>
                                        <div class="item-subtitle">运费:￥6</div>
                                        <div class="item-subtitle">价格:￥50</div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="${base}/item/view.htm?uid=123" class="item-link item-content">
                                    <div class="item-media">
                                        <img src="http://120.26.208.194:8888/yd/1.jpg" width="80">
                                    </div>
                                    <div class="item-inner">
                                        <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div>
                                        <div class="item-subtitle">运费:￥6</div>
                                        <div class="item-subtitle">价格:￥50</div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="${base}/item/view.htm?uid=123" class="item-link item-content">
                                    <div class="item-media">
                                        <img src="http://120.26.208.194:8888/yd/1.jpg" width="80">
                                    </div>
                                    <div class="item-inner">
                                        <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div>
                                        <div class="item-subtitle">运费:￥6</div>
                                        <div class="item-subtitle">价格:￥50</div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="${base}/item/view.htm?uid=123" class="item-link item-content">
                                    <div class="item-media">
                                        <img src="http://120.26.208.194:8888/yd/1.jpg" width="80">
                                    </div>
                                    <div class="item-inner">
                                        <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div>
                                        <div class="item-subtitle">运费:￥6</div>
                                        <div class="item-subtitle">价格:￥50</div>
                                    </div>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="infinite-scroll-preloader">
                <div class="preloader"></div>
            </div>
        </div>
        <script type="application/javascript">
            $(function(){
                $(document).on('infinite', '.infinite-scroll',function() {
                        var html = ' <li> <a href="${base}/item/view.htm?uid=123" class="item-link item-content"> <div class="item-media"> <img src="http://120.26.208.194:8888/yd/11.jpg" width="80"> </div> <div class="item-inner"> <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div> <div class="item-subtitle">运费:￥6</div> <div class="item-subtitle">价格:￥50</div> </div> </a> </li>';
                    var html2 = ' <li> <a href="${base}/item/view.htm?uid=123" class="item-link item-content"> <div class="item-media"> <img src="http://120.26.208.194:8888/yd/12.jpg" width="80"> </div> <div class="item-inner"> <div class="item-text">啊实打实的标题标题标题标题标题标题标题标题标题标题标题标题标题标题的</div> <div class="item-subtitle">运费:￥6</div> <div class="item-subtitle">价格:￥50</div> </div> </a> </li>';
                    $("#append").append(html+html2);
                });
            });
        </script>
    </div>

</div>
    <@common.light7JS></@common.light7JS>
    <@common.wxJS></@common.wxJS>
<script type="application/javascript">

    $(function () {
        var loading = false;
        $.init();
        $(document).on('click', '#choiceType', function () {
            $.popup(".popup-about");
        });

        $(document).on('refresh', '.pull-to-refresh-content',function(e) {
            setTimeout(function(){
                $.pullToRefreshDone('.pull-to-refresh-content');
            },2000)
        });

        $(document).on('click','.searchbar-cancel',function(){
        });
    });

</script>
</body>
</html>
</#escape>
