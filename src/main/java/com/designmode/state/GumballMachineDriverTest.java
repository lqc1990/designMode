package com.designmode.state;

/**
 * @author lqc
 */
public class GumballMachineDriverTest {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();
        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();
        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();
    }
}
