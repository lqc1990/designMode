package com.designmode.command;

/**
 * @author lqc
 */
public class BeatsStereo implements Stereo{
    @Override
    public void on() {
        System.out.println("打开音响");
    }

    @Override
    public void setCD(String name) {
        System.out.println("放入"+name+"的专辑");
    }

    @Override
    public void off() {
        System.out.println("关闭音响");
    }
}
