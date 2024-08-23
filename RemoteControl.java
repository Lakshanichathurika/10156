class RemoteControl {
    private command[][] commands;
    private command undoCommand;

    public RemoteControl(int slots) {
        commands = new command[slots][2];
    }

    public void setCommands(int slot, command onCommand, command offCommand) {
        commands[slot][0] = onCommand;
        commands[slot][1] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        commands[slot][0].execute();
        undoCommand = commands[slot][0];
    }
    public void offButtonWasPressed(int slot) {
        commands[slot][1].execute();
        undoCommand = commands[slot][1];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
}