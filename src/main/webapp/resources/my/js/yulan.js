/**
 * Created by smc
 * on 2016/10/6.
 */

(function($){

    //弹出预览图片,传递图片url
    $.showPic = function(url){
        if(url){
            var img = new Image();
            img.src = url;
            var height = img.height;
            var width = img.width;
            if(width>height){
                $("body").append("<div class='pg-pic'><img src='"+url+"' onclick=' $.closePic()' class='yl_pic'></div>");
            }else{
                $("body").append("<div class='pg-pic-height'><img src='"+url+"' onclick=' $.closePic()' class='yl_pic_height'></div>");
            }
        }
    }
    //点击图片关闭
    $.closePic = function(){
        $(".pg-pic").fadeOut();
        $(".pg-pic-height").fadeOut();
    }
})(jQuery)