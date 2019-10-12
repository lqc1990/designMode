package com.designmode.command;

/**
 * @author lqc
 */
public class StereoOffWithCDCommand implements Command {

    private Stereo stereo;

    public void setStereo(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
