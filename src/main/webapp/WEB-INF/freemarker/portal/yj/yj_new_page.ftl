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
    <form class="mui-input-group" action="${base}/yj/add.json" method="post" id="yjForm">
        <div class="mui-input-row">
            <input type="text" placeholder="收件人姓名" name="receiverName" id="receiverName">
        </div>
        <div class="mui-input-row">
            <input type="text" placeholder="手机号码" name="receiverMobile" id="receiverMobile">
        </div>
        <div class="mui-input-row">
            <input type="text" placeholder="邮政编码" name="receiverPostcode" id="receiverPostcode">
        </div>
        <div class="mui-input-row">
              <span class="my-input" id="sfq" onclick="doChoiceSSQ();">省、市、区</span>
        </div>
        <div class="mui-input-row" style="height: 100px;">
            <textarea id="address" rows="10" placeholder="详情地址" name="address"></textarea>
        </div>
        <input type="hidden" id="province" name="province">
        <input type="hidden" id="city" name="city">
        <input type="hidden" id="country" name="country">
        <input type="hidden" name="openId" value="${Session["openId"]!""}">
    </form>
</div>
<nav class="mui-bar mui-bar-tab my-bar-save-center" onclick="doAdd()">
        保存
</nav>
    <@common.muiJS></@common.muiJS>
    <@common.jqueryJS></@common.jqueryJS>
    <@common.fastclickJS></@common.fastclickJS>
    <@common.myCommonJS></@common.myCommonJS>
    <@common.muiPickerJS></@common.muiPickerJS>
    <@common.addressDataJS></@common.addressDataJS>
    <@common.jqueryFormJS></@common.jqueryFormJS>
<script type="application/javascript">
    $(function () {
        mui('.mui-scroll-wrapper').scroll({
            indicators: true //是否显示滚动条
        });
        FastClick.attach(document.body);
    });

    function doAdd(){

        var receicerName = $("#receiverName").val();
        if(!receicerName){
            mui.alert("暂无收件人姓名");
            return;
        }
        var receiverMobile = $("#receiverMobile").val();
        if(!receiverMobile){
            mui.alert("暂无手机号码");
            return;
        }
        var province = $("#province").val();
        if(!province){
            mui.alert("暂无省市区");
            return;
        }
        var address =  $("#address").val();
        if(!address){
            mui.alert('暂无详细地址');
            return;
        }
        $.showLoadDefault();
        $("#yjForm").ajaxSubmit({
            success:function(resp){
                $.clearLoad();
                if(resp.succ){
                    mui.alert("保存成功",null,null,function(){
                        location.href="${base}/yj/goto/yj_list_page.htm";
                    });
                }else{
                    mui.alert("网络异常，请重新操作!");
                }
            },
            error:function(){
                mui.alert("网络异常，请重新操作!");
            }
        });
    }
    function callBack(){

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
            var country = (items[2] || {}).text;
            $("#sfq").html(province+" "+ city +" "+ country );

            $("#province").val(province);
            $("#city").val(city);
            $("#country").val(country);
        });
    }

    function doChoiceJD(){

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
