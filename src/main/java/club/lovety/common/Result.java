
package club.lovety.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回信息结果表
 */
public final class Result {
    public  static final  String SUCCESS="SUCCESS";

    public static final String ERROR="ERROR";

    public static final boolean SUCC=true;

    public static final boolean FAIL=false;
    private String code=SUCCESS;

    public Object data = null;

    private String msg="成功";

    private boolean succ = SUCC;
    
    public Result(){

    }
    public Result(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public Result(String code,Object obj){
        this.code=code;
        this.data=obj;
    }

    public Result(String code,String msg,Object obj){
        this(code,msg);
        this.data=obj;
    }

    public boolean isSucc() {
        return succ;
    }

    public void setSucc(boolean succ) {
        this.succ = succ;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
