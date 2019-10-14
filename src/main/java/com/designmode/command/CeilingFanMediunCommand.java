package com.designmode.command;

/**
 * @author lqc
 */
public class CeilingFanMediunCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediunCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
