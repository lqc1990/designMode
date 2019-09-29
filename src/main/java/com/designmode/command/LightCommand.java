package com.designmode.command;

/**
 * @author lqc
 */
public class LightCommand implements Command{

    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
