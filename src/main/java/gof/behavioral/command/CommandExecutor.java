package gof.behavioral.command;

import gof.behavioral.command.commands.*;
import java.util.HashMap;
import java.util.Map;

/** All known client operations executor */
public class CommandExecutor {
    private static final Map<ClientOperation, Command> allKnownCommandsMap = new HashMap<ClientOperation, Command>();

    static {
        allKnownCommandsMap.put(ClientOperation.ADD, new CommandADD());
        allKnownCommandsMap.put(ClientOperation.REMOVE, new CommandREMOVE());
        allKnownCommandsMap.put(ClientOperation.REFRESH, new CommandREFRESH());
        allKnownCommandsMap.put(ClientOperation.INFO, new CommandINFO());
        allKnownCommandsMap.put(ClientOperation.EXIT, new CommandEXIT());
    }

    private CommandExecutor() {
    }

    public static void execute(ClientOperation operation) {
        allKnownCommandsMap.get(operation).execute();
    }

}
