package club.lovety.test;

import org.apache.commons.io.FileUtils;

import java.io.*;

/**
 * Created by 念梓  on 2016/9/13.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class TestFileIn {


    public static void main(String[] args) {

        File file = new File("G:"+File.separator+"PortalController.java");
        File desFile = new File("G:/file/src/123123123123_20260612.java");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            FileOutputStream fileOutputStream = new FileOutputStream(desFile);

            int a = 0;
            int count = 0;
            while((a=fileInputStream.read()) != -1){
                count++;
                fileOutputStream.write(a);
                System.out.println("count:  "+ count);
            }
            fileInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
