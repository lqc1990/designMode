package com.designmode.state;

/**
 * @author lqc
 */
public class GumballMachine {
    private IState hasQuarterState;
    private IState notHasQuarterState;
    private IState soldOutState;
    private IState soldState;
    private IState winnerState;

    IState state;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        hasQuarterState = new HasQuarterState(this);
        notHasQuarterState = new NotHasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        if(count > 0){
            state = notHasQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void tumCrank(){
        state.tumCrank();
        state.dispense();
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public IState getHasQuarterState() {
        return hasQuarterState;
    }

    public IState getNotHasQuarterState() {
        return notHasQuarterState;
    }

    public IState getSoldOutState() {
        return soldOutState;
    }

    public IState getSoldState() {
        return soldState;
    }

    public IState getWinnerState() {
        return winnerState;
    }

    public void releaseBall(){
        System.out.println("一个糖果弹出");
        if(count != 0){
            count = count -1;
        }
    }

    public int getCount() {
        return count;
    }
}
