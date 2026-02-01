package designpatterns.behaviour.command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {

    private final Map<String, Command> commandMap = new HashMap<>();

    public void setCommand(String button, Command command) {
        commandMap.put(button, command);
    }

    public void pressButton(String button) {
        commandMap.get(button).execute();
    }
}
