package club.lovety.test;

/**
 * Created by 念梓  on 2016/7/15.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class ByteTest {
    public static void main(String[] args) {

        byte[] a = "123qqq".getBytes();
        byte[] bb = new byte[a.length+2];
        bb[0]=0x12;
        bb[1]=(byte)3;
        System.arraycopy(a,0,bb,2,a.length);
        int ab = 0x12;
        System.out.println(ab);
        System.out.println((byte)"1".getBytes()[0]);

    }
}
