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
    <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left"></a>
    <h1 class="mui-title">选择收货地址</h1>
    <button class="mui-btn   mui-btn-link mui-pull-right my-yj-head-right" onclick="doEdit('${base}/yj/goto/yj_edit_page.htm');">修改</button>
</header>
<div class="mui-content">
    <form class="mui-input-group">
        <div class="mui-input-row">
            <label class="color-silver">
                收件人
            </label>
            <input type="text" placeholder="收件人姓名" name="">
        </div>
        <div class="mui-input-row">
            <label class="color-silver">手机号码</label>
            <input type="text" placeholder="手机号码">
        </div>
        <div class="mui-input-row">
            <label class="color-silver">邮政编码</label>
            <input type="text" placeholder="邮政编码">
        </div>
        <div class="mui-input-row">
            <label class="color-silver">所在地区</label>
            <span class="my-input-view" id="sfq" onclick="doChoiceSSQ();">省、市、区</span>
        </div>
        <div class="mui-input-row">
            <label class="color-silver">街道</label>
            <input type="text" placeholder="街道" >
            <#--<span class="my-input mui-navigate-right" id="jd" onclick="doChoiceJD();">街道222</span>-->
        </div>
        <div class="mui-input-row">
            <label class="color-silver">详情地址</label>
            <input type="text" placeholder="街道" >
        </div>
    </form>
    <div style="width: 100%;color: red;margin-top: 10px;background-color: #fff;height: 50px;padding-top: 15px;padding-left: 5px;">
        删除收货地址
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
    });

    function doEdit(url) {
        mui.openWindow({
            id:url,
            url:url
        });
    }

</script>
</body>
</html>
</#escape>
