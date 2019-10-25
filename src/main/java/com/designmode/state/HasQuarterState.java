package com.designmode.state;

import java.util.Random;

/**
 * @author lqc
 */
public class HasQuarterState implements IState{

    private Random randomWinner = new Random(System.currentTimeMillis());
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
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (gumballMachine.getCount() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }
}
