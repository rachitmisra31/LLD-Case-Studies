package designpatterns.behaviour.state.goodcode;

public class GreenState implements TrafficLightState {

    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from Green to Yellow. Slow Down!! ");
        context.setState(new YellowState());
    }

    @Override
    public String geColor() {
        return "Green";
    }
}
