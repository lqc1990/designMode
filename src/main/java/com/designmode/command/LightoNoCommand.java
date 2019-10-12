package com.designmode.command;

/**
 * @author lqc
 */
public class LightoNoCommand implements Command{

    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
