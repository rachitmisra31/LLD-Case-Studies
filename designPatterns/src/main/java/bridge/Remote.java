package bridge;

public abstract class Remote {

    protected Device device;
    public Remote(Device device){
        this.device = device;
    }
    public void mute(){
        System.out.println("volume set to 0");
    }
    abstract void togglePower();
    abstract void setVolume(int volume);
}
