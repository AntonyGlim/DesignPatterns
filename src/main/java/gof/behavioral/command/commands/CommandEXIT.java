package gof.behavioral.command.commands;

public class CommandEXIT implements Command {
    public void execute() {
        System.out.println("CommandEXIT");
        System.out.println(("До встречи!"));
    }
}