<#import "../config/common.ftl" as common>
<#escape x as x?html>
<!DOCTYPE HTML>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <title>快乐购</title>
</head>
<body ontouchstart="">
<input type="button" value="选择图片" onclick="doChoiceImg();">
<br>
<input type="button" value="上传音频" onclick="doChoiceVoice();">
<br>
<input type="button" value="结束音频" onclick="doStop();">
<br>
<input type="button" value="预览" onclick="doView();">

<br>
<br>
<input type="button" value="上传图片" onclick="doUploadImg();">
<br>

<input type="button" value="播放录音" onclick="doOpen();">

<input type="hidden" id="voideId">
<input type="hidden" id="imgId">
<br>
<br>
<input type="button" value="获取地理信息" onclick="doAddress();">
<br><br>

<input id="openAddress">
    <@common.jqueryJS></@common.jqueryJS>
    <@common.wxJS></@common.wxJS>
<script type="application/javascript">
    $(function () {
        wx.config({
            debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
            appId: '${config.appId}', // 必填，公众号的唯一标识
            timestamp: '${config.timestamp}', // 必填，生成签名的时间戳
            nonceStr: '${config.noncestr}', // 必填，生成签名的随机串
            signature: '${config.signature}',// 必填，签名，见附录1
            jsApiList: ['chooseImage', 'previewImage', 'stopRecord', 'startRecord', 'onVoiceRecordEnd', 'playVoice', 'uploadImage', 'getLocation'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
        });
    });


    function doChoiceImg() {
        wx.chooseImage({
            count: 5, // 默认9
            sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有
            sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有
            success: function (res) {
                var localIds = res.localIds; // 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片
//                 alert(JSON.stringify(res));
                $("#imgId").val(localIds);
            }
        });
    }

    function doChoiceVoice() {
        wx.startRecord();
//         wx.onVoiceRecordEnd({
//             // 录音时间超过一分钟没有停止的时候会执行 complete 回调
//             complete: function (res) {
//                 alert("录音自动停止: "+ JSON.stringify(res));
//                 var localId = res.localId;
//                 $("#voideId").val(localId);
//             }
//         });
    }


    function doStop() {
        alert("停止");
        wx.stopRecord({
            success: function (res) {
                alert(JSON.stringify(res));
                var localId = res.localId;
                $("#voideId").val(localId);
            }
        });
    }

    function doView() {
        wx.previewImage({
            current: 'http://1551sp9557.imwork.net:8888/20160812/07e66c6a2db34cf6950c8c6cceb7f3e1.png', // 当前显示图片的http链接
            urls: ['http://1551sp9557.imwork.net:8888/20160812/07e66c6a2db34cf6950c8c6cceb7f3e1.png',
                'http://1551sp9557.imwork.net:8888/20160812/2af88bffb1f143b8a148ba57da6d58c6.png',
                'http://1551sp9557.imwork.net:8888/20160812/558ddf6c168b4f1087d3fbfe8aa2e31e.png'] // 需要预览的图片http链接列表
        });
    }

    function doOpen() {
        var voiceId = $("#voideId").val();
        alert("voideId: " + voiceId);
        wx.playVoice({
            localId: voiceId // 需要播放的音频的本地ID，由stopRecord接口获得
        });
    }


    function doUploadImg() {

        var imgId = $("#imgId").val();
        alert("imgId: " + imgId);
        wx.uploadImage({
            localId: imgId, // 需要上传的图片的本地ID，由chooseImage接口获得
            isShowProgressTips: 1, // 默认为1，显示进度提示
            success: function (res) {
                var serverId = res.serverId; // 返回图片的服务器端ID
            }
        });
    }

    function doAddress() {
        alert("2222");
        wx.getLocation({
            type: 'gcj02', // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
            success: function (res) {
                var latitude = res.latitude; // 纬度，浮点数，范围为90 ~ -90
                var longitude = res.longitude; // 经度，浮点数，范围为180 ~ -180。
                var speed = res.speed; // 速度，以米/每秒计
                var accuracy = res.accuracy; // 位置精度
                alert(JSON.stringify(res));
            }
        });
    }
</script>


</body>
</html>
</#escape>
