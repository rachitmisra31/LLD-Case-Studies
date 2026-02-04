package bridge;

public class BridgeClient {

    public static void main(String[] args) {
        Device tv = new TV();

        Remote sakshiRemote = new SakshiRemote(tv);

        sakshiRemote.setVolume(15);
        sakshiRemote.togglePower();
        sakshiRemote.mute();

        System.out.println("For Radio----------------------------------");

        Device radio = new Radio();
        Remote sakshiRadioRemote = new SakshiRemote(radio);
        sakshiRadioRemote.togglePower();
        sakshiRadioRemote.setVolume(30);
        sakshiRadioRemote.mute();
    }
}
