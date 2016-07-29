package club.lovety.test;

/**
 * Created by 念梓  on 2016/7/12.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class Java8TestOne {

    public static void main(String[] args) {
        System.out.println("当前线程name: "+ Thread.currentThread().getName());
        int a = 0;
        Runnable r = ()->{
            System.out.println("开启了一个线程   "+ a);
            System.out.println("当前线程名称: "+Thread.currentThread().getName());
            AA aa = new AA();
            aa.print();
        };

        Thread thread = new Thread(r);
        thread.start();
    }

}

class AA{
    public void print(){
        System.out.println("AA类线程：  "+ Thread.currentThread().getName());
    }
}

class BB implements Runnable{

    @Override
    public void run() {
        System.out.println("BB线程名称:  "+ Thread.currentThread().getName());
    }
}
