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
        remoteControl.setCommand(0,lightoNoCommand,lightoOffCommand);

        //打开关闭音响
        BeatsStereo beatsStereo = new BeatsStereo();
        StereoOnWithCDCommand cdCommand = new StereoOnWithCDCommand();
        cdCommand.setStereo(beatsStereo);
        StereoOffWithCDCommand offWithCDCommand = new StereoOffWithCDCommand();
        offWithCDCommand.setStereo(beatsStereo);
        remoteControl.setCommand(1,cdCommand,offWithCDCommand);

        //设置风扇转速
        CeilingFan ceilingFan = new CeilingFan("客厅风扇");
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanMediunCommand mediunCommand = new CeilingFanMediunCommand(ceilingFan);
        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setCommand(2,lowCommand,offCommand);
        remoteControl.setCommand(3,mediunCommand,offCommand);
        remoteControl.setCommand(4,highCommand,offCommand);

        System.out.println(remoteControl.toString());
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        //将关闭状态设置为打开
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        //将打开状态设置为关闭
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        //风扇
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

    }
}
