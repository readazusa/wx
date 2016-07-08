<#import "../../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <title>第三个。。</title>
</head>

<body>
    <div id="app">
         {{message}}，{{name+"asdasd"}}
        <input v-model="message">
       <br>
        <ul>
            <li v-for="t in ts">
                {{t.txt}}====={{$index}}
            </li>
        </ul>
        <template v-if="ok">标题H1</template>

        <button v-on:click="doHref">跳转链接</button>
    </div>
    <button onclick="doC();">click</button>
    <@common.vueJS></@common.vueJS>
    <script type="application/javascript">
        var vm = new Vue({
            el:"#app",
            data:{
                message:"vue你好啊",
                name:"第一次尝试",
                ok:false,
                ts:[
                    {txt:"第一个txt"},
                    {txt:"第二个txt"}
                   ]
            },
            destroyed:function(){
                console.info("数据创建完销毁");
            },
            created:function(){
                console.info("创建成功");
            },
            methods:{
                doHref:function(event){
//                    alert(this.name);
//                    alert(event.target.tagName);
                    location.href="${base}/test/vue/second.htm";
                }
            }
        });
        vm.message="再次修改";
        vm.$watch('message', function (newVal, oldVal) {
            console.info("newVal: "+ newVal+" ,oldVal: "+ oldVal);
        });

        function  doC(){
            vm.ok=true;
        }
    </script>
</body>

</html>
</#escape>
