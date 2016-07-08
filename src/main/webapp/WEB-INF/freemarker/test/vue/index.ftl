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
         {{message}}，{{name+"asdasd"}}
        <input v-model="message">
       <br>
        <ul>
            <li v-for="t in ts">
                {{t}}====={{$index}}
            </li>
        </ul>
        <template v-if="ok">标题H1</template>

        <button v-on:click="doHref">跳转链接</button>
    </div>
    <button onclick="doC();">click</button>

     <div id="temp">
         <button v-on:click="second(123)">第二个</button>
         <button v-on:keyup.13="ent">第二sss个</button>
         <input type="checkbox" v-model="checked" id="checkbox">
         <label for="checkbox">{{checked}}</label>


         <select v-model="sel">
                <option selected value="A">1</option>
             <option value="B">2</option>
             <option value="C">3</option>
         </select>

         <span>{{sel | json}}</span>

     </div>


    <@common.jqueryJS></@common.jqueryJS>
    <@common.vueJS></@common.vueJS>
    <script type="application/javascript">
        var vm = new Vue({
            el:"#app",
            data:{
                message:"vue你好啊",
                name:"第一次尝试",
                ok:false,
                ts:
                    {txt:"第一个txt",
                    sa:"第二个txt"}

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
        vm.ts={sss:'213213',qqq:"cccccc"};
        vm.$watch('message', function (newVal, oldVal) {
            console.info("newVal: "+ newVal+" ,oldVal: "+ oldVal);
        });

        function  doC(){
            vm.ok=true;
        }
        new Vue({
            el:"#temp",
            data:{
                checked:false
            },
            methods:{
                second:function(obj){
                    console.info(obj);
//                     console.info($(obj).html())
                },
                ent:function(){
                    alert("ent");
                }
            }
        })
    </script>
</body>

</html>
</#escape>
