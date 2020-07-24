package com.test;

/**
 * @author yanghaojie
 * @date 2020-06-29 10:50
 * 类解释：
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void printValur(String str) {
        System.out.println("print value : " + str);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("a", "b", "c", "d");
        al.forEach(Test::printValur);


        // 下面的方法和上面等价的
        Consumer<String> consumer= Test::printValur; // 方法参数
        al.forEach(x -> consumer.accept(x));// 方法执行accept

        System.out.println(112);
    }


    public static void printf(){

    }
}
