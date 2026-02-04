package bridge;

public class SakshiRemote extends Remote {
    public SakshiRemote(Device device){
        super(device);
    }

    @Override
    void togglePower() {
        System.out.println("Sakshi is toggling power");
        device.turnOn();
    }

    @Override
    void setVolume(int volume) {
        System.out.println("Sakshi is setting volume to " + volume);
        device.setVolume(volume);
    }
}