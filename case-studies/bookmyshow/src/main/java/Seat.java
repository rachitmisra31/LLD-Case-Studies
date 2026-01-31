public class Seat {

    private String seatId;
    private final SEAT_TYPE type;


    public Seat(SEAT_TYPE type, String seatId) {
        this.type = type;
        this.seatId = seatId;
    }

    public String getSeatId() {
        return seatId;
    }

    public SEAT_TYPE getType() {
        return type;
    }
}
