<#import "../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <title>快乐</title>
    <@common.alimsuiCSS></@common.alimsuiCSS>
    <@common.alimsuiextendCSS></@common.alimsuiextendCSS>
</head>
<body>
<div class="page-group">
    <div class="page">
        <nav class="bar bar-tab">
            <a class="tab-item active" href="#">
                <span class="icon icon-home"></span>
                <span class="tab-label">首页</span>
            </a>
            <a class="tab-item" href="#">
                <span class="icon icon-me"></span>
                <span class="tab-label">我</span>
            </a>
            <a class="tab-item" href="#">
                <span class="icon icon-star"></span>
                <span class="tab-label">收藏</span>
            </a>
            <a class="tab-item" href="#">
                <span class="icon icon-settings"></span>
                <span class="tab-label">设置</span>
            </a>
        </nav>
        <div class="content">
            hello word
        </div>
    </div>
</div>
    <@common.alimsuiJS></@common.alimsuiJS>
    <@common.alimsuiextendJS></@common.alimsuiextendJS>
   <script type="application/javascript">
       $.init();
   </script>
</body>
</html>
</#escape>
