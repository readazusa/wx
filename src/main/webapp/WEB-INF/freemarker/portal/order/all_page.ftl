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
<header class="mui-bar mui-bar-nav">
    dsd
</header>
<div class="mui-content mui-scroll-wrapper" style="margin-bottom: 50px;">
    <div class="mui-scroll">

    </div>
</div>

    <@common.muiJS></@common.muiJS>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.fastclickJS></@common.fastclickJS>
<script type="application/javascript">
    $(function () {
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        FastClick.attach(document.body);
        mui(".mui-table-view").on('tap','a',function(){
            var url = this.href;
            mui.openWindow({
                id:url,
                url:url
            });
        });
    });
    function doNew(url) {
        mui.openWindow({
            id:url,
            url:url
        });
    }

</script>
</body>
</html>
</#escape>
