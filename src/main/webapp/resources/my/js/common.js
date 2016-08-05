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


