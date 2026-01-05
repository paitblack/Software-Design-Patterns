package command;

public class TestRemoteControl {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Command[] onCommands = new Command[3];
        Command[] offCommands = new Command[3];

        Light light = new Light();
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);
        remoteControl.setCommand(0,
                onCommand,offCommand);
        onCommands[0] = onCommand;
        offCommands[0] = offCommand;

        GarageDoor door = new GarageDoor();
        onCommand =  new GarageOpenCommand(door);
        offCommand = new GarageCloseCommand(door);
        onCommands[1] = onCommand;
        offCommands[1] = offCommand;

        remoteControl.setCommand(1,onCommand
               ,offCommand);

        Stereo stereo = new Stereo();
        onCommand =  new StereoOnCommand(stereo);
        offCommand = new StereoOffCommand(stereo);
        onCommands[2] = onCommand;
        offCommands[2] = offCommand;

        remoteControl.setCommand(2,onCommand
                ,offCommand);


        remoteControl.setCommand(3,new MacroCommand(onCommands)
                ,new MacroCommand(offCommands));

        remoteControl.onButtonWasPressed(2);
        remoteControl.onButtonWasPressed(1);
        remoteControl.undoWasPressed();
        remoteControl.onButtonWasPressed(3);
    }

}
