<#import "../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <title>快乐购</title>
    <@common.vuxCSS></@common.vuxCSS>
</head>
<body>
<div id="app">
    <div class="vux-tab">
        <div class="vux-tab-item" style="border: none; color: rgb(102, 102, 102);"> 已发货</div>
        <div class="vux-tab-item vux-tab-selected" style="border: none; color: rgb(4, 190, 2);"> 未发货</div>
        <div class="vux-tab-item" style="border: none; color: rgb(102, 102, 102);"> 全部订单</div>
        <div class="vux-tab-ink-bar vux-tab-ink-bar-transition-backward"
             style="display: block; height: 3px; left: 33.3333%; right: 33.3333%; background-color: rgb(4, 190, 2);"></div>
    </div>
</div>
    <@common.vueJS></@common.vueJS>
    <@common.vuxJS></@common.vuxJS>
<script type="application/javascript">

    // register components
    Vue.component('tab', vuxTab)
    Vue.component('tab-item', vuxTabItem)


    new Vue({
        el: '#app',
        data () {
            return {
                demo1: '未发货'
            }
        }
    });

</script>
</body>
</html>
</#escape>
