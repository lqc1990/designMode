package com.designmode.factory;

import java.util.ArrayList;

/**
 * @author lqc
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings");
        for(String topping : toppings){
            System.out.println("  "+ topping);
        }
    }

    public void bake(){
        System.out.println("开始烘烤");
    }

    public void cut(){
        System.out.println("开始切分");
    }

    public void box(){
        System.out.println("打包装盒");
    }
}
