package com.designmode.command;

/**
 * @author lqc
 */
public class LightoOffCommand implements Command{

    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
