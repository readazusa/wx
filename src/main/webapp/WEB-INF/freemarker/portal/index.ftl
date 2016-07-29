<#import "../config/common.ftl" as common>
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
<header class="mui-bar mui-bar-nav">
    <div class="mui-input-row mui-search">
    <#--<form action="${base}/item/search" method="post">-->
        <input type="search" class="mui-input-clear" placeholder="查询">
    <#--</form>-->
    </div>
</header>
<div class="mui-content mui-scroll-wrapper" id="refreshContainer">
    <div class="mui-scroll my-trans-duration">
        <div id="slider" class="mui-slider">
            <div class="mui-slider-group mui-slider-loop">
                <div class="mui-slider-item mui-slider-item-duplicate">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/head1.png">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/head2.png">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/head1.png">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/head2.png">
                    </a>
                </div>
                <div class="mui-slider-item">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/head1.png">
                    </a>
                </div>
                <div class="mui-slider-item mui-slider-item-duplicate">
                    <a href="#">
                        <img src="http://120.26.208.194:8888/yd/head2.png">
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
        <div class="my-grid">
            <ul class="mui-table-view mui-grid-view mui-grid-9" id="indexurl">
                <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3"><a href="#">
                    <span class="iconfont icon-xinpinshangshi my-index-icon" id="zxss"></span>
                    <div class="mui-media-body">最新上市</div></a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3" id="tttj"><a href="${base}/item/goto/tttj.htm">
                    <span class="iconfont  icon-tejia my-index-icon"></span>
                    <div class="mui-media-body ">天天特惠</div></a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3" id="indexfl"><a href="#">
                    <span class="iconfont icon-fenlei my-index-icon"></span>
                    <div class="mui-media-body">种类</div></a></li>
            </ul>

        </div>
        <div class="card-content">
            <div>
                <img src="http://120.26.208.194:8888/yd//cbd.jpg" height="100%" width="100%">
            </div>
            <div class="mui-card-content">
                <div class="mui-card-content-inner">
                    <p>Posted on January 18, 2016</p>
                    <p style="color: #333;">这里显示文章摘要，让读者对文章内容有个粗略的概念...</p>
                </div>
            </div>
        </div>

        <div id="index_item">
            <ul class="mui-table-view goods-list style-small" id="index_ul_item">
                <li class="mui-table-view-cell mui-media">
                    <a href="${base}/item/goto/view.htm?uid=223">
                        <div class="mui-card">
                            <div class="mui-card-content">
                                <img src="http://120.26.208.194:8888/yd//cbd.jpg" height="100%" width="100%">
                            </div>
                            <div class="mui-card-footer">

                            </div>
                        </div>
                    </a>
                </li>
                <li class="mui-table-view-cell mui-media">
                    <a href="${base}/item/goto/view.htm?uid=223">
                        <div class="mui-card">
                            <div class="mui-card-content">
                                <img src="http://120.26.208.194:8888/yd//cbd.jpg" height="100%" width="100%">
                            </div>
                            <div class="mui-card-footer">

                            </div>
                        </div>
                    </a>
                </li>
                <li class="mui-table-view-cell mui-media">
                    <a href="#">
                        <div class="mui-card">
                            <div class="mui-card-content">
                                <img src="http://120.26.208.194:8888/yd//cbd.jpg" height="100%" width="100%">
                            </div>
                            <div class="mui-card-footer">

                            </div>
                        </div>
                    </a>
                </li>
                <li class="mui-table-view-cell mui-media">
                    <a href="#">
                        <div class="mui-card">
                            <div class="mui-card-content">
                                <img src="http://120.26.208.194:8888/yd//cbd.jpg" height="100%" width="100%">
                            </div>
                            <div class="mui-card-footer">
                            </div>
                        </div>
                    </a>
                </li>
                <li class="mui-table-view-cell mui-media">
                    <a href="#">
                        <div class="mui-card">
                            <div class="mui-card-content">
                                <img src="http://120.26.208.194:8888/yd//cbd.jpg" height="100%" width="100%">
                            </div>
                            <div class="mui-card-footer">
                            </div>
                        </div>
                    </a>
                </li>
                <li class="mui-table-view-cell mui-media">
                    <a href="#">
                        <div class="mui-card">
                            <div class="mui-card-content">
                                <img src="http://120.26.208.194:8888/yd//cbd.jpg" height="100%" width="100%">
                            </div>
                            <div class="mui-card-footer">
                            </div>
                        </div>
                    </a>
                </li>
            </ul>
        </div>
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
    <a class="mui-tab-item" href="tab-webview-subpage-contact.html">
        <span class="mui-icon mui-icon-trash"></span>
        <span class="mui-tab-label">购物车</span>
    </a>
    <a class="mui-tab-item" href="tab-webview-subpage-setting.html">
        <span class="mui-icon mui-icon-contact"></span>
        <span class="mui-tab-label">我的购</span>
    </a>
</nav>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.muiJS></@common.muiJS>
<script type="application/javascript">
    $(function () {
        var gallery = mui('.mui-slider');
        gallery.slider({
            interval: 5000//自动轮播周期，若为0则不自动播放，默认为0；
        });
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
                    height: 200,//可选,默认50.触发下拉刷新拖动距离,
                    auto: false,//可选,默认false.自动下拉刷新一次
                    contentnomore:'没有更多数据了',//可选，请求完毕若没有更多数据时显示的提醒内容
                    contentrefresh  : "正在加载...",//可选，正在加载状态时，上拉加载控件上显示的标题内容
                    callback:pullupfresh
                }
            }
        });

        mui("#indexurl").on('tap','a',function(){
            var href = this.href;
            mui.openWindow({
                id: href,
                url: this.href,
                show:{
                    autoShow:true,//页面loaded事件发生后自动显示，默认为true
                }
            });
        });

        mui("#index_ul_item").on('tap','a',function(){
            var href = this.href;
            mui.openWindow({
                id: href,
                url: this.href,
                show:{
                    autoShow:true,//页面loaded事件发生后自动显示，默认为true
                }
            });
        });
    });


    function pulldownfresh() {
//        alert("刷新");
        mui('#refreshContainer').pullRefresh().endPulldownToRefresh();
    }
    var total = 0;
    function pullupfresh(){
//        alert("上啦刷新");
//        var li = '<li class="mui-table-view-cell mui-media"> <a href="#"> <div class="mui-card"> <div class="mui-card-content"> <img src="http://120.26.208.194:8888/yd//cbd.jpg" height="100%" width="100%"> </div> <div class="mui-card-footer"> </div> </div> </a> </li>';
//
//
//        $("#index_ul_item").append(li).append(li);
        alert(123);
        total++;
        if(total<6){
            this.endPullupToRefresh(false);
        }else{
            this.endPullupToRefresh(true);

        }

    }

    function doOpenWin(id,url){
        alert("跳转特价页面")
        mui.openWindow({
            id:id,
            url:url
        });
    }


</script>
</body>
</html>
</#escape>
