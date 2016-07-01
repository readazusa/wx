<#import "../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <title>快乐购</title>
    <@common.frozenuiCSS></@common.frozenuiCSS>
</head>
<body ontouchstart="">
<header class="ui-header ui-header-positive ui-border-b">
    <i class="ui-icon-return" onclick="history.back()"></i><h1>选项卡 tab</h1><button class="ui-btn">回首页</button>
</header>
<footer class="ui-footer ui-footer-btn">
    <ul class="ui-tiled ui-border-t">
        <li data-href="index.html" class="ui-border-r"><div>基础样式</div></li>
        <li data-href="ui.html" class="ui-border-r"><div>UI组件</div></li>
        <li data-href="js.html"><div>JS插件</div></li>
    </ul>
</footer>
<section class="ui-container">
    <section id="tab">
        <div class="demo-item">
            <p class="demo-desc">标签栏</p>
            <br>
            <a href="${base}/portal/second.htm" target="_blank">点击</a>
            <div class="demo-block">
                <div class="ui-tab">
                    <ul class="ui-tab-nav ui-border-b">
                        <li class="current">热门推荐</li>
                        <li>全部表情</li>
                        <li>表情</li>
                    </ul>
                    <ul class="ui-tab-content" style="width:300%">
                        <li>内容1asdasdasdasdasd</li>
                        <li>内容2</li>
                        <li>内容3</li>
                    </ul>
                </div>
            </div>

        </div>
    </section>
</section>
    <@common.zeptoJS></@common.zeptoJS>
<@common.frozenuiJS></@common.frozenuiJS>
</body>
</html>
</#escape>
