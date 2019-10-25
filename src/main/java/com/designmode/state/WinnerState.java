package com.designmode.state;

/**
 * @author lqc
 */
public class WinnerState implements IState {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("You'ar a winner! You get two gumballs for you quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.count == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.count > 0) {
                gumballMachine.setState(gumballMachine.getNotHasQuarterState());
            } else{
                System.out.println("Oops, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
