package designpatterns.behaviour.state.uglycode;

public class TrafficLightTest {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red");
        trafficLight.nextTrafficLight();
        trafficLight.nextTrafficLight();
        trafficLight.nextTrafficLight();

    }
}
