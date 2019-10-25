package com.designmode.state;

/**
 * @author lqc
 */
public class NotHasQuarterState implements IState{

    GumballMachine gumballMachine;

    public NotHasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投币成功");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("您没有投币，不能退币");
    }

    @Override
    public void tumCrank() {
        System.out.println("没有投币，不能购买商品");
    }

    @Override
    public void dispense() {
        System.out.println("糖果机没有收到币，无法弹出糖果");
    }
}