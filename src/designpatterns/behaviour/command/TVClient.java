package designpatterns.behaviour.command;

public class TVClient {
    public static void main(String[] args) {
        TV  tv = new TV();
        RemoteControl remote = new RemoteControl();
        remote.setCommand("ON", new TurnOnCommand(tv));
        remote.setCommand("Channel_5", new ChannelChangeCommand(tv, 5));
        remote.setCommand("Volume_50", new AdjustVolumeCommand(tv, 50));
        remote.setCommand("OFF", new TurnOffCommand(tv));

        remote.pressButton("ON");
        remote.pressButton("Channel_5");
        remote.pressButton("Volume_50");
        remote.pressButton("OFF");
    }
}
