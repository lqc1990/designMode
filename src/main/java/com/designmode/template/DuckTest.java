package com.designmode.template;

import java.util.Arrays;

/**
 * @author lqc
 * Duck 类实现了Comparable接口，这个接口就是一个钩子，接口本身没有实现
 * 所有的排序规则由Duck类实现
 * Arrays.sort Duck的比较规则来进行排序 Arrays类可以通过不同的算法来实现
 * Duck类只要定义好根据哪些字段比较即可
 */
public class DuckTest {
    public static void main(String[] args) {
        Duck[] ducks = {new Duck("tom", 10),
                new Duck("jack", 5),
                new Duck("lily", 20)};

        //模板模式，统一排序算法
        Arrays.sort(ducks);

        for(int i = 0; i< ducks.length; i++){
            System.out.println(ducks[i].toString());
        }
    }
}
