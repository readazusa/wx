<#import "../config/common.ftl" as common>
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
    <@common.iconCSS></@common.iconCSS>
    <@common.jqueryJS></@common.jqueryJS>
</head>
<body>
<div class="page-group">
    <div class="page">
        <header class="bar bar-nav">
                <span class="icon icon-code" style="position: absolute" id="choiceType"></span>
                    <div class="searchbar row wx_top_bar_search">
                        <div class="search-input col-85">
                            <form action="${base}/item/search.htm" id="searchForm">
                            <input type="search" id="search" placeholder="query...">
                            <input type="hidden" name="pageSize" value="10">
                            <input type="hidden" name="pageIndex" value="1">
                            </form>
                        </div>
                        <a class="button button-fill button-primary col-15" style="top:.10rem;"><span class="icon icon-search"></span></a>
                    </div>
        </header>
        <nav class="bar bar-tab">
            <a class="tab-item active" href="${base}/portal/index.htm">
                <span class="icon icon-home"></span>
                <span class="tab-label">首页</span>
            </a>
            <a class="tab-item" href="${base}/item/tj.htm">
                <span class="icon icon-gift"></span>
                <span class="tab-label">特价专卖</span>
            </a>
            <a class="tab-item" href="${base}/portal/cart.htm">
                <span class="icon icon-cart"></span>
                <span class="tab-label">购物车</span>
            </a>
            <a class="tab-item" href="#">
                <span class="icon icon-me"></span>
                <span class="tab-label">个人中心</span>
            </a>
        </nav>
        <div class="content pull-to-refresh-content" data-ptr-distance="55" data-distance="10">
            <div class="pull-to-refresh-layer">
                <div class="preloader"></div>
                <div class="pull-to-refresh-arrow"></div>
            </div>
            <div class="middle">
               <div class="index_head" style="height: 150px;">
                   <div class="swiper-container" data-space-between='30' data-pagination='.swiper-pagination'
                        data-autoplay="2000" data-pagination-clickable="true">
                       <div class="swiper-wrapper" id="picswiper">
                           <div class="swiper-slide"><img
                                   src="http://120.26.208.194:8888/yd/head1.png"
                                   alt=""></div>
                           <div class="swiper-slide"><img
                                   src="http://120.26.208.194:8888/yd/head2.png"
                                   alt=""></div>
                       </div>
                       <div class="swiper-pagination" style="bottom: 25px;"></div>
                   </div>
               </div>
                <div style="height: 50px;background: #FFFFFF;text-align: center;padding-top:10px;" >
                    <span style="">公告:项目正在测试阶段，如有问题请及时回复</span>
                </div>
               <div class="dh">
                  <a href="${base}/item/search.htm">全部商品</a>
                   <a href="#">最新商品</a>  <a href="#">会员中心</a>
               </div>
            </div>
            <div class="card">
                <#--<div class="card demo-card-header-pic">-->
                    <div valign="bottom" class="card-header color-white no-border no-padding">
                    <img class='card-cover' src="//gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i3/TB10LfcHFXXXXXKXpXXXXXXXXXX_!!0-item_pic.jpg_250x250q60.jpg" alt="">
                </div>
                    <div class="card-content">
                        <div class="card-content-inner">
                            <p>好的宝贝</p>
                            <p>sss</p>
                        </div>
                    </div>
            </div>
           <div>
              <ul class="goods-list style-small">
                  <li>
                      <div class="card" >
                          <div valign="bottom" class="card-header color-white no-border no-padding">
                              <img class='card-cover' src="//gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i3/TB10LfcHFXXXXXKXpXXXXXXXXXX_!!0-item_pic.jpg_250x250q60.jpg" alt="">
                          </div>
                          <div class="card-content">
                              <div class="card-content-inner">
                                  <p>好的宝贝</p>
                                  <p>sss</p>
                              </div>
                          </div>
                      </div>
                  </li>
                  <li>
                      <div class="card">
                          <div valign="bottom" class="card-header color-white no-border no-padding">
                              <img class='card-cover' src="//gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i3/TB10LfcHFXXXXXKXpXXXXXXXXXX_!!0-item_pic.jpg_250x250q60.jpg" alt="">
                          </div>
                          <div class="card-content">
                              <div class="card-content-inner">
                                  <p>好的宝贝</p>
                                  <p>sss</p>
                              </div>
                          </div>
                      </div>
                  </li>
                  <li>
                      <div class="card">
                          <div valign="bottom" class="card-header color-white no-border no-padding">
                              <img class='card-cover' src="//gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i3/TB10LfcHFXXXXXKXpXXXXXXXXXX_!!0-item_pic.jpg_250x250q60.jpg" alt="">
                          </div>
                          <div class="card-content">
                              <div class="card-content-inner">
                                  <p>好的宝贝</p>
                                  <p>sss</p>
                              </div>
                          </div>
                      </div>
                  </li>
              </ul>
           </div>
        </div>
    </div>
    <div class="popover popover-itemtype">
        <div class="popover-angle"></div>
        <div class="popover-inner">
        </div>
    </div>
</div>
    <@common.light7JS></@common.light7JS>
    <@common.wxJS></@common.wxJS>
<script type="application/javascript">
    $(function () {
        var loading = false;
        $.init();
        $(document).on('click', '#choiceType', function () {
            $.popover(".popover-itemtype");
        });

        $(document).on('refresh', '.pull-to-refresh-content',function(e) {
            setTimeout(function(){
                $.pullToRefreshDone('.pull-to-refresh-content');
            },2000)
        });
        $(document).on('click','.icon-search',function(){
            $("#searchForm").submit();
        })
    });
</script>
</body>
</html>
</#escape>
