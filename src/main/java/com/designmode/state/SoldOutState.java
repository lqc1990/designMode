package com.designmode.state;

/**
 * @author lqc
 */
public class SoldOutState implements IState{

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void tumCrank() {

    }

    @Override
    public void dispense() {

    }
}
