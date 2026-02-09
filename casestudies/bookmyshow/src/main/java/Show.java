package casestudies.bookmyshow.src.main.java;

import java.time.LocalDateTime;

public class Show {

    private final String showId;
    private final Movie movie;
    private final Screen screen;
    private final LocalDateTime startTime;

    public String getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
    public Show(String showId, Movie movie, Screen screen, LocalDateTime startTime) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;

    }
}
