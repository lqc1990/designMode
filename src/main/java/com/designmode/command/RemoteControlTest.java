package com.designmode.command;

/**
 * @author lqc
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        //设置灯开关
        Light roomLight = new LivingRoomLight();
        LightoNoCommand lightoNoCommand = new LightoNoCommand();
        lightoNoCommand.setLight(roomLight);
        LightoOffCommand lightoOffCommand = new LightoOffCommand();
        lightoOffCommand.setLight(roomLight);

        //打开关闭音响
        BeatsStereo beatsStereo = new BeatsStereo();
        StereoOnWithCDCommand cdCommand = new StereoOnWithCDCommand();
        cdCommand.setStereo(beatsStereo);
        StereoOffWithCDCommand offWithCDCommand = new StereoOffWithCDCommand();
        offWithCDCommand.setStereo(beatsStereo);

        remoteControl.setCommand(0,lightoNoCommand,lightoOffCommand);
        remoteControl.setCommand(1,cdCommand,offWithCDCommand);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);

        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);


    }
}
