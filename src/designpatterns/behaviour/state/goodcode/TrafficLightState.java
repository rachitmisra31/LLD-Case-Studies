package designpatterns.behaviour.state.goodcode;

public interface TrafficLightState {
  void next(TrafficLightContext context);
  String geColor();
}
