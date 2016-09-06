(function($){

    $.showWin = function(){
        $("body").append("<div class='my-popover'></div>");
        $.showPopover();
        $(".my-popover").on("click",function(){
            $(".my-popover").remove();
            //$(".my-popover-win").removeClass("my-popover-win-show");
            $(".my-popover-win").addClass("zoomOut");
            setTimeout(function(){
                $(".my-popover-win").removeClass("my-popover-win-show zoomOut");
            },500)
        });
    }

    $.showPopover = function(){
        $(".my-popover-win").addClass("my-popover-win-show animated zoomIn");
    }

    $.closePopover = function(){
        $(".my-popover").remove();
        //$(".my-popover-win").removeClass("my-popover-win-show");
        $(".my-popover-win").addClass("zoomOut");
        setTimeout(function(){
            $(".my-popover-win").removeClass("my-popover-win-show zoomOut");
        },500)
    }

    $(".my-close").click(function(){
       $.closePopover();
    });


})($)


var  MyObj={};

MyObj.locationUrl=window.location.origin+"/wx";
/**
 *
 * @param url
 * @param data
 * @param method   请求方式 get post
 * @param callback
 * @param dataType   返回数据内容 默认 text，
 * @param contentType  请求的数据格式 默认： application/x-www-form-urlencoded
 */
MyObj.ajaxSubmit= function(url,data,method,callback,dataType,contentType){

    try{
        $.ajax({
            url:url,
            data:data,
            type:method,
            success:function(resp){
                callback(resp);
            },
            error:function(resp){
                 window.alert(JSON.stringify(resp));
            }
        });
    } catch(e) {
        console.info("执行ajax请求错误:" + e.message);
    }
}

/**
 * 在查询列表页面，处理表头的点击排序操作
 * @param obj
 */
MyObj.removeOrderClass=function(obj){
    var parent = $(obj).parent();
    $(parent).children().each(function(){
        var childOrder= $(this).children("i");
        $(this).removeClass("my-color-red");
        $(childOrder).removeClass("icon-jiangxu-copy icon-shengxu my-color-red").addClass("icon-paixu");
    });
}

MyObj.addShopCart =function(itemId,itemPic,event,offsetId,shopCartClass){

    var offset = $(offsetId).offset();
    var top = offset.top;
    var left = offset.left;
    var flyer = $('<img class="flyer-img" src="' + itemPic + '">');
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
            var oldShopCartNum = $(shopCartClass).html();
            if(!oldShopCartNum){
                oldShopCartNum = 0;
                $(shopCartClass).removeClass("my-shop-cart-bz-hidden")
            }
            var newShopCartNum = parseInt(oldShopCartNum)+1;
            $(shopCartClass).html(newShopCartNum);
        }
    });

    var data={"id":itemId};
    MyObj.ajaxSubmit(MyObj.locationUrl+"/shopcart/add.json",data,"get",MyObj.receive);
}

MyObj.receive = function(){
    console.info("接受ajax请求返回");
}


function receive(){
    console.info("receive接受ajax请求");
}

function gotoHref(url){
    location.href=url;
}

MyObj.intiIndexContent = function(resp){
    if(resp.code == "SUCCESS"){
        var indexContentLength = resp.data.length;
        var firstLoopDiv = '<div class="mui-slider-item mui-slider-item-duplicate"><a href="#"><img src="'+resp.data[indexContentLength-1].picUrl+'" /></a></div>';
        var lastLoopDiv = '<div class="mui-slider-item mui-slider-item-duplicate"><a href="#"><img src="'+resp.data[0].picUrl+'"/></a></div>'
        var loopDiv = "";
        var sliderDiv = "";
        resp.data.forEach(function(e,index){
            if(0 == index){
                sliderDiv +='<div class="mui-indicator mui-active"></div>';
            }else{
                sliderDiv +='<div class="mui-indicator"></div>';
            }
           loopDiv +='<div class="mui-slider-item"><a href="#"><img src="'+e.picUrl+'"/></a></div>'
        });
        $("#mui_slider_loop_id").empty().append(firstLoopDiv+loopDiv+lastLoopDiv);
        $("#mui_slider_indicator_id").empty().append(sliderDiv);
        MyObj.setSlider();
    }
}

MyObj.setSlider = function(){
    var gallery = mui('.mui-slider');
    gallery.slider({
        interval:5000//自动轮播周期，若为0则不自动播放，默认为0；
    });
}

MyObj.loadShopCartCountByOpenId = function(resp){
    if(resp.code = "SUCCESS"){
        var shopCartCountByOpenId = resp.data;
        if(shopCartCountByOpenId){
            if("0" != shopCartCountByOpenId){
                $(".my-shop-cart-bz").html(shopCartCountByOpenId);
                $(".my-shop-cart-bz").removeClass("my-shop-cart-bz-hidden")
            }
        }
    }
}

MyObj.loadItemInViewPage = function(resp){
    if(resp.code = "SUCCESS"){
        var itemObj = resp.data;
        var itemPicUrlList = itemObj.picUrlList;
        var firstLoopDiv = '<div class="mui-slider-item mui-slider-item-duplicate"><a href="#"><img src="'+itemPicUrlList[itemPicUrlList.length-1]+'" /></a></div>';
        var lastLoopDiv = '<div class="mui-slider-item mui-slider-item-duplicate"><a href="#"><img src="'+itemPicUrlList[0]+'"/></a></div>'
        var loopDiv = "";
        var sliderDiv = "";
        itemPicUrlList.forEach(function(e,index){
            if(0 == index){
                sliderDiv +='<div class="mui-indicator mui-active"></div>';
            }else{
                sliderDiv +='<div class="mui-indicator"></div>';
            }
            loopDiv +='<div class="mui-slider-item"><a href="#"><img src="'+e+'" data-preview-src=""  data-preview-group="1" /></a></div>'
        });
        $("#item_view_page_slider_loop").empty().append(firstLoopDiv+loopDiv+lastLoopDiv);
        $("#item_view_page_slider_indicator").empty().append(sliderDiv);
        MyObj.setSlider();
        $("#itemTitle").html(itemObj.title);
        $("#itemPrice").text("价格:￥"+itemObj.price);
        $("#itemPostage").text("快递:"+itemObj.postage);
        $("#item1mobile").html(itemObj.descr);

        $("#buyPic").attr("src",itemObj.phonePicUrl);
        $("#buyPrice").text("￥"+itemObj.price);
        $("#buyTitle").html(itemObj.title);
        $("#buyStock").text("库存:"+itemObj.stock);
        $("#item-view-shop-cart").attr("pic",itemObj.phonePicUrl);

        $("#price").val(itemObj.price);
        $("#title").val(itemObj.title);
        $("#postage").val(itemObj.postage);

    }
}


MyObj.gotoUrl = function(url){
    location.href=url;
}



