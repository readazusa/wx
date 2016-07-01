package club.lovety.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;

/**
 * club.lovety.util
 * Created by smc
 * date on 2016/3/23.
 * Email:sunmch@163.com
 * XML
 */
public class XML2Object {

    public static  <T> T getXml2Obj(String tag,String xml,Class<T> t){
        XStream xstream = new XStream();
        xstream.alias(tag,t);
        return (T)xstream.fromXML(xml);
    }

    public static String getObj2Xml(String tag,Object obj){
        XStream xstream = new XStream(new XppDriver(new NoNameCoder()));   //防止类属性包含下划线被转变为双下划线
        xstream.alias(tag,obj.getClass());
        return xstream.toXML(obj);
    }

}
