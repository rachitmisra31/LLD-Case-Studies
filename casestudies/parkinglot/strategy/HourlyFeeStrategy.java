package casestudies.parkinglot.strategy;

import casestudies.parkinglot.models.ParkingTicket;

public class HourlyFeeStrategy implements FeeStrategy {
    @Override
    public double calculateFee(ParkingTicket ticket) {
        return ticket.getDurationInHours()*hourlyRate;
    }

    private int hourlyRate;
    public HourlyFeeStrategy(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
