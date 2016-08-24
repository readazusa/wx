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
        $(".my-popover-win").removeClass("my-popover-win-show");
    }
})($)
var  MyObj={};


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

MyObj.addShopCart =function(shopCartId,shopCartNumClass,itemId,itemPic){
    var event = window.event;
    mui.alert(event.type+",  "+ event.pageX);
    var offset = $("#icon-cart").offset();
    var top = offset.top;
    var left = offset.left;
    //mui.alert("购物车left: "+left+" ,top: "+ top);




}


function gotoHref(url){
    location.href=url;
}







