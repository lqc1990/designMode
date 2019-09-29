package com.designmode.command;

/**
 * @author lqc
 */
public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public void setStereo(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD("JAY");
    }
}
