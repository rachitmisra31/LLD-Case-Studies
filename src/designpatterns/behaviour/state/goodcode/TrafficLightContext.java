package designpatterns.behaviour.state.goodcode;

public class TrafficLightContext {

    private TrafficLightState state;
    public TrafficLightContext() {
        state = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void next(){
        state.next(this);
    }

    public String getColor(){
        return state.geColor();
    }
}
