package com.designmode.command;

/**
 * @author lqc
 */
public class Test {

    public static void main(String[] args) {

        Light light = new LivingRoomLight();
        LightoNoCommand command = new LightoNoCommand();
        command.setLight(light);
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setCommand(command);
        control.buttonWasPressed();
    }
}
