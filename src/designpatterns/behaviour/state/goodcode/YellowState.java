package designpatterns.behaviour.state.goodcode;

public class YellowState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from Yellow to red. Stop!! ");
        context.setState(new RedState());
    }

    @Override
    public String geColor() {
        return "YELLOW";
    }
}
