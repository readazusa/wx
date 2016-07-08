<#import "../../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <title>template</title>
</head>

<body>
    <div id="app">
        <my-com></my-com>
    </div>
    <@common.vueJS></@common.vueJS>
    <script type="application/javascript">

        Vue.component('my-com',{
            template: '<span>第一个组件</span>',
        });

        new Vue({
            el:"#app"
        })


    </script>
</body>

</html>
</#escape>
