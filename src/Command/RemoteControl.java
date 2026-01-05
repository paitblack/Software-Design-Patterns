package command;

public class RemoteControl {

    Command[] onCommands = new Command[4];
    Command[] offCommands = new Command[4];

    Command undo;


    public void setCommand(int index, Command onCommand, Command offCommand) {

        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void onButtonWasPressed(int index){

        onCommands[index].execute();
        undo = onCommands[index];
    }

    public void offButtonWasPressed(int index){

        offCommands[index].execute();
        undo = offCommands[index];
    }

    public void undoWasPressed(){
        if (undo !=null){
            undo.undo();
        }
    }
}
