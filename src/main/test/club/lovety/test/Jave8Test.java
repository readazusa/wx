package club.lovety.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by smc on 2016/7/11.
 */
public class Jave8Test {

    public static void main(String[] args) {

//
//        List<String> list = new ArrayList<>();
//
//        list.add("asd");
//        list.add("xcv");
//        long n = list.stream().filter(e->{
//            System.out.println(e);
//            return e.equals("0");
//        }).count();
//
//
//
//        List ll= list.stream().map(e -> e.toLowerCase()).collect(Collectors.toList());
//
//
//
//
//        System.out.println("n:  "+n);

        List<A> list = new ArrayList<>();
        A a1 = new A();
        a1.setAge(123);
        a1.setUsername("你好啊");
        A a2 = new A();
        a2.setAge(23);
        a2.setUsername("asd");


    }
}

class A{
    private String username;

    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}