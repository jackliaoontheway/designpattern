package behavioral.command.HeadFirst;

/**
 * 宏命令
 */
public class MacroCommand implements Command {

    /**
     * 这里的commands 相当于宏命令的receiver
     */
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
