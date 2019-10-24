package com.designmode.state;

/**
 * @author lqc
 */
public interface IState {

    void insertQuarter();

    void ejectQuarter();

    void tumCrank();

    void dispense();
}
