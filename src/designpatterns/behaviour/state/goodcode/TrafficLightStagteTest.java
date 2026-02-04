package designpatterns.behaviour.state.goodcode;

public class TrafficLightStagteTest {

    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        context.next();
        context.next();
        context.next();
        context.next();
    }
}
