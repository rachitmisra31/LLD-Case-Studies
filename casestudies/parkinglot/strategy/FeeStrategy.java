package casestudies.parkinglot.strategy;

import casestudies.parkinglot.models.ParkingTicket;

public interface FeeStrategy {

    double calculateFee(ParkingTicket ticket);
}
