package club.lovety.test;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Position;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by 念梓  on 2017/2/7.
 * Email:sunmch@163.com
 * author: 念梓
 * des:
 */
public class ImageTest {


    static class MyPosition implements Position{
        @Override
        public Point calculate(int enclosingWidth, int enclosingHeight, int width, int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
            int x = insetLeft +10;
            int y = enclosingHeight - height - insetBottom-10;
            return new Point(x,y);
        }
    }

    public static void main(String[] args) {
//        Positions.CENTER_LEFT
        try {
            Thumbnails.of("G:/123.png")
                    .size(640,530)
                    .watermark(new MyPosition(), ImageIO.read(new File("G:/321.png")),0.9f)
                    .outputQuality(0.8f)
                    .toFile("g:/1131.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
