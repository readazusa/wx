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
    <@common.muiPickerCSS></@common.muiPickerCSS>
</head>
<body>
<header class="mui-bar mui-bar-nav">
    <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left"></a>
    <h1 class="mui-title">新建收货地址</h1>
</header>
<div class="mui-content mui-scroll-wrapper">
    <form class="mui-input-group">
        <div class="mui-input-row">
            <input type="text" placeholder="收件人姓名" name="">
        </div>
        <div class="mui-input-row">
            <input type="text" placeholder="手机号码">
        </div>
        <div class="mui-input-row">
            <input type="text" placeholder="邮政编码">
        </div>
        <div class="mui-input-row">
              <span class="my-input" id="sfq" onclick="doChoiceSSQ();">省、市、区</span>
        </div>
        <div class="mui-input-row">
             <span class="my-input mui-navigate-right" id="jd" onclick="doChoiceJD();">街道</span>
        </div>
        <div class="mui-input-row" style="height: 100px;">
            <textarea id="textarea" rows="10" placeholder="详情地址"></textarea>
        </div>
        <input type="hidden" id="province" name="province">
        <input type="hidden" id="city" name="city">
        <input type="hidden" id="areaId">
        <input type="hidden" id="area" name="area">
        <input type="hidden" id="street" name="street">
    </form>
</div>
<nav class="mui-bar mui-bar-tab my-bar-save-center" onclick="doAdd()">
        保存
</nav>
    <@common.muiJS></@common.muiJS>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.fastclickJS></@common.fastclickJS>
    <@common.muiPickerJS></@common.muiPickerJS>
    <@common.addressDataJS></@common.addressDataJS>
<script type="application/javascript">
    $(function () {
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        FastClick.attach(document.body);
    });

    function doAdd(){
        history.back();
    }
    function  doChoiceSSQ(){
        var ssqPicker = new mui.PopPicker({
            layer: 3
        });
        console.info("citydata3: "+ cityData3);
        ssqPicker.setData(cityData3);
        ssqPicker.show(function(items) {
            var province = (items[0] || {}).text;
            var city = (items[1] || {}).text;
            var area = (items[2] || {}).text;
            var areaId = (items[2] || {}).value;
            $("#areaId").val(areaId);
//            console.info("身份: "+(items[0] || {}).text );
//            console.info("城市: "+(items[1] || {}).text );
//            console.info("地区: "+(items[2] || {}).text );
//            ssqPicker.innerText = "你选择的城市是:" + (items[0] || {}).text + " " + (items[1] || {}).text + " " + (items[2] || {}).text;
            //返回 false 可以阻止选择框的关闭
            //return false;
            $("#sfq").html(province+" "+ city +" "+ area );
        });
    }

    function doChoiceJD(){
        var areaId =  $("#areaId").val();
        if(!areaId){
            mui.alert('暂无街道地址');
            return;
        }
        var street = streetData["s_"+areaId];
        var streetPicker = new mui.PopPicker();
        streetPicker.setData(street);
        streetPicker.show(function(items){

        });

    }
</script>
</body>
</html>
</#escape>
