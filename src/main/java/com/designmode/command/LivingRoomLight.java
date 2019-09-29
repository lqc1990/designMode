package com.designmode.command;

/**
 * @author lqc
 */
public class LivingRoomLight implements Light{
    @Override
    public void on() {
        System.out.println("打开客厅灯光");
    }

    @Override
    public void off() {
        System.out.println("关闭客厅灯光");
    }
}
