package casestudies.bookmyshow.src.main.java;

import java.util.List;

public class Theater {

    private String name;
    private String theaterId;
    private List<Screen> screens;

    public Theater(String name, String theaterId, List<Screen> screens) {
        this.name = name;
        this.theaterId = theaterId;
        this.screens = screens;
    }

    public String getName() {
        return name;
    }
    public String getTheaterId() {
        return theaterId;
    }
    public List<Screen> getScreens() {
        return screens;
    }
}
