package club.lovety.test;

/**
 * Created by 念梓  on 2016/7/12.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class Java8TestTwo {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();
        Runnable r = () -> System.out.println(message);
        message.append("Howdy, ");
        message.append("world!");
        r.run();
    }
}
