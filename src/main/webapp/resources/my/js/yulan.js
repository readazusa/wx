/**
 * Created by smc
 * on 2016/10/6.
 */

(function($){

    //弹出预览图片
    $.showPic = function(obj){
        var url= $(obj).attr("src");
        //$("body").append("<div class='pg-load'></div>");
        //$(".pg-load").fadeIn();
        $("body").append("<div class='pg-pic'><img src='"+url+"' onclick=' $.closePic()' class='yl_pic'></div>");
    }

    //点击图片关闭
    $.closePic = function(){
        //$(".pg-pic").remove();
        $(".pg-load").fadeOut();
        $(".pg-pic").fadeOut();

    }




})(jQuery)