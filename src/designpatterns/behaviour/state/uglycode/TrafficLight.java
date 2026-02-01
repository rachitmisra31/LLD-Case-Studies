package designpatterns.behaviour.state.uglycode;

public class TrafficLight {

    private String color;

    public  TrafficLight(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void nextTrafficLight() {
        switch (color) {
            case "green" -> {
                color = "yellow";
                System.out.println("Light color changed from green to yellow slow down!! ");
            }
            case "yellow" -> {
                color = "red";
                System.out.println("Light color changed from yellow to red.Stop! ");
            }
            case "red" -> {
                color = "green";
                System.out.println("Light color changed from red to green.Lets go!! ");
            }
        }
    }
}
