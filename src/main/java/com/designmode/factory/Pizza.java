package com.designmode.factory;

/**
 * @author lqc
 */
public class Pizza {

    public void prepare(){
        System.out.println("前期准备");
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
