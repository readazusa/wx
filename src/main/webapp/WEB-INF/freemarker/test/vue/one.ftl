<#import "../../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <title>快乐购</title>
</head>

<body>
    <div id="app">
        <child></child>
        <button v-on:click="changeCom">click</button>
        <parent v-bind:msg="hello"></parent>
        <br>
        <#--<input v-model="hello" >-->

       <input type="hidden" value="{{name}}">

        <input type="text" v-model="name" placeholder="请输入">
    </div>


    <@common.jqueryJS></@common.jqueryJS>
    <@common.vueJS></@common.vueJS>
    <script type="application/javascript">

//        var child = Vue.extend({
//            template:"<span>app发生</span>"
//        });
//
        Vue.component("child",{
            template:"<span>按时大大大大大</span>"
        });

        Vue.component('parent', {
            props: ['msg'],
            template: '<span>{{ msg }}</span>'
        });
//            Vue.extend({
//                components:{
//                    'child':{
//                        template:"<span>按时大大大大大</span>"
//                    }
//                }
//            });

            new Vue({
                el:"#app",
                methods:{
                    changeCom:function(){
                        alert("父亲");
                        doChange();
                    }
                }
            });

        function doChange(){
            alert(12321);
        }

    </script>
</body>

</html>
</#escape>
