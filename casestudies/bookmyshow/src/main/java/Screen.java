import java.util.List;

public class Screen {

    private final String screenId;
    private final String screenName;
    private final int screenNumber;
    private List<Seat> seats;

    public Screen(String screenId, String screenName, int screenNumber, List<Seat> seats) {
        this.screenId = screenId;
        this.screenName = screenName;
        this.screenNumber = screenNumber;
        this.seats = seats;
    }

    public String getScreenId() {
        return screenId;
    }

    public String getScreenName() {
        return screenName;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
