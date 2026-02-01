package designpatterns.behaviour.state.goodcode;

public class RedState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from red to green. Lets Go!! ");
        context.setState(new GreenState());
    }

    @Override
    public String geColor() {
        return "RED";
    }
}
