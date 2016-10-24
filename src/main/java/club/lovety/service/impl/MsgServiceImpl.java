package club.lovety.service.impl;

import club.lovety.base.service.IWechatApiService;
import club.lovety.common.TypeMap;
import club.lovety.common.WeChatUrlUtils;
import club.lovety.message.event.LocationEventMessage;
import club.lovety.message.event.ViewEventMessage;
import club.lovety.message.event.ZcEventMessage;
import club.lovety.message.req.ReqImageMessage;
import club.lovety.message.req.ReqTextMessage;
import club.lovety.message.req.ReqVideoMessage;
import club.lovety.message.req.ReqVoiceMessage;
import club.lovety.message.res.ResTextMessage;
import club.lovety.service.IMsgService;
import club.lovety.user.entity.UserInfo;
import club.lovety.user.entity.UserParticle;
import club.lovety.user.service.IUserInfoService;
import club.lovety.user.service.IUserParticleService;
import club.lovety.util.XML2Object;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * club.lovety.service.impl
 * Created by smc
 * date on 2016/3/24.
 * Email:sunmch@163.com
 */
@Service
public class MsgServiceImpl implements IMsgService {

    private static final Logger log = LoggerFactory.getLogger(MsgServiceImpl.class);

    @Resource
    private IWechatApiService wechatApiService;

    @Resource
    private IUserInfoService userInfoService;

    @Resource
    private IUserParticleService userParticleService;


    @Override
    public String executeMsg(HttpServletRequest request) {
        String resultMsg = null;
        try {
            log.info("测试下载附件:  {}",new Date());
            InputStream inputStream = request.getInputStream();
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(inputStream);
            String xml = document.asXML();
            log.debug("客户端发送的内容: {}", xml);
            String msgType = getMsgType(document.getRootElement());
            log.debug("msgtype:[{}]", msgType);
            switch (msgType) {
                case TypeMap.TEXT_TYPE:
                    log.debug("执行文本消息的");
                    ReqTextMessage reqTextMessage = XML2Object.getXml2Obj("xml", xml, ReqTextMessage.class);
                    ResTextMessage resTextMessage = new ResTextMessage();
                    resTextMessage.setContent(reqTextMessage.getContent());
                    resTextMessage.setCreateTime(System.currentTimeMillis());
                    resTextMessage.setFromUserName(reqTextMessage.getToUserName());
                    resTextMessage.setToUserName(reqTextMessage.getFromUserName());
                    resTextMessage.setMsgType(TypeMap.TEXT_TYPE);
                    resultMsg = XML2Object.getObj2Xml("xml", resTextMessage);
                    break;
                case TypeMap.IMAGE_TYPE:
                    ReqImageMessage reqImageMessage = XML2Object.getXml2Obj("xml", xml, ReqImageMessage.class);
                    String MediaId = reqImageMessage.getMediaId();
                    String apiUrl = WeChatUrlUtils.GET_LS_SC_URL.replace("MEDIA_ID", MediaId);
                    String filePath = wechatApiService.doGet(apiUrl, "image");    //保存临时图片
                    File file = new File(filePath);
                    log.debug("保存后文件的地址: {},设置素材的文件大小: {}", filePath, file.length());
                    Map<String, File> map = new HashMap<>();
                    map.put("media", file);
                    wechatApiService.doPostFormFile(WeChatUrlUtils.UPLOAD_YJ_SC_URL, map);
                    break;
                case TypeMap.VOICE_TYPE:   //音频
                    log.info("用户发送音频信息");
                    ReqVoiceMessage reqVoiceMessage = XML2Object.getXml2Obj("xml", xml, ReqVoiceMessage.class);
                    String VoideMediaId = reqVoiceMessage.getMediaId();
                    String voiceApiUrl = WeChatUrlUtils.GET_LS_SC_URL.replace("MEDIA_ID", VoideMediaId);
                    wechatApiService.doGet(voiceApiUrl);
                    break;
                case TypeMap.VIDEO_TYPE:  //视频
                    log.info("用户发送视频信息");
                    ReqVideoMessage reqVideoMessage = XML2Object.getXml2Obj("xml", xml, ReqVideoMessage.class);
                    String VideoMediaId = reqVideoMessage.getMediaId();
                    String videoApiUrl = WeChatUrlUtils.GET_LS_SC_URL.replace("MEDIA_ID", VideoMediaId);
                    wechatApiService.doGet(videoApiUrl);
                    break;
                case TypeMap.EVENT_TYPE:
                    log.debug("接收事件消息");
                    ZcEventMessage zcEventMessage = XML2Object.getXml2Obj("xml", xml, ZcEventMessage.class);
                    switch (zcEventMessage.getEvent()) {
                        case TypeMap.EVENT_SUBSCRIBE:
                            ResTextMessage eventTextMessage = new ResTextMessage();
                            eventTextMessage.setCreateTime(System.currentTimeMillis());
                            eventTextMessage.setFromUserName(zcEventMessage.getToUserName());
                            eventTextMessage.setToUserName(zcEventMessage.getFromUserName());
                            eventTextMessage.setMsgType(TypeMap.TEXT_TYPE);
                            eventTextMessage.setContent("谢谢关注，快乐消费公共号，我们会提供很好的服务回馈大家！");
                            resultMsg = XML2Object.getObj2Xml("xml", eventTextMessage);
                            UserInfo userInfo = new UserInfo();
                            userInfo.setOpenId(zcEventMessage.getFromUserName());
                            saveUser(userInfo);
                            break;
                        case TypeMap.EVENT_CLICK:
                            break;
                        case TypeMap.EVENT_VIEW:
                            HttpSession session = request.getSession();
                            Object openId = session.getAttribute("openId");
                            log.debug("获取sesson中的openId:{}",openId);
                            if(null == openId){
                                ViewEventMessage viewEventMessage =  XML2Object.getXml2Obj("xml", xml, ViewEventMessage.class);
                                log.debug("获取viewEvent中openid： {}",viewEventMessage.getFromUserName());
                                session.setAttribute("openId",viewEventMessage.getFromUserName());
                            }else{
                                log.debug("该用户的openId: {}",openId);
                            }
                            break;
                        case TypeMap.EVENT_SCANCODE_PUSH:
                            break;
                        case TypeMap.EVENT_SCANCODE_WAITMSG:
                            break;
                        case TypeMap.EVENT_PIC_SYSPHOTO:
                            break;
                        case TypeMap.EVENT_PIC_PHOTO_OR_ALBUM:
                            break;
                        case TypeMap.EVENT_PIC_WEIXIN:
                            break;
                        case TypeMap.EVENT_LOCATION_SELECT:
                            break;
                        case TypeMap.EVENT_LOCATION:
                            LocationEventMessage locationEventMessage = XML2Object.getXml2Obj("xml", xml, LocationEventMessage.class);
                            UserParticle userParticle = new UserParticle();
                            userParticle.setLatitude(locationEventMessage.getLatitude());
                            userParticle.setLongitude(locationEventMessage.getLongitude());
                            userParticle.setOpenId(locationEventMessage.getFromUserName());
                            userParticle.setPrecisions(locationEventMessage.getPrecision());
                            saveLocation(userParticle);
                            break;

                    }
                    break;
            }
        } catch (IOException e) {
            log.error("IOException: 处理数据流失败 ", e);
        } catch (DocumentException ex) {
            log.error("DocumentException：执行dom4j出错。 ", ex);
        }
        return resultMsg;
    }

    private String getMsgType(Element element) {
        return element.element("MsgType").getText();
    }


    private void saveLocation(UserParticle userParticle) {
        userParticleService.save(userParticle);
    }

    private void saveUser(UserInfo userInfo) {
        UserInfo user = userInfoService.getUserInfoByOpenId(userInfo.getOpenId());
        if (user == null) {
            userInfoService.save(userInfo);
        } else {
            userInfoService.updateSubDate(userInfo);
        }

    }

}
