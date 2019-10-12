package com.designmode.command;

/**
 * @author lqc
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for(int i = 0; i < onCommands.length; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("----------remoteControl-----------\n");
        for(int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot"+i+"]"+onCommands[i].getClass().getName()+"\n"
                    +offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
