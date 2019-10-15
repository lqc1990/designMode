package com.designmode.adapter;

/**
 * @author lqc
 */
public class DuckTestDriver {

    public static void main(String[] args) {
        Turkey duck = new WildTurkey();
        Duck duckAdapter = new TurkeyAdapter(duck);
        duckAdapter.quack();
        duckAdapter.fly();
    }
}
