package designpatterns.behaviour.command;

public class ChannelChangeCommand implements Command {
    private final TV tv;
    private final int channel;
    public ChannelChangeCommand(TV tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }
    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}
