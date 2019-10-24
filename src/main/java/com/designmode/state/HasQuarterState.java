package com.designmode.state;

/**
 * @author lqc
 */
public class HasQuarterState implements IState{

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned....");
        gumballMachine.setState(gumballMachine.getNotHasQuarterState());
    }

    @Override
    public void tumCrank() {
        System.out.println("You turned.....");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }
}
