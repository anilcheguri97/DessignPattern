package payment;

import Model.Reservation;

import java.time.Period;

public class Bill {
    Reservation reservation;
    double totalAmount;
    boolean isPaid;
    Bill(Reservation reservation){
        this.reservation =reservation;
        this.totalAmount=computeBillAmount();
        this.isPaid=false;
    }

    public double computeBillAmount() {
        Period time = Period.between(reservation.getBookingDateTo(),reservation.getBookingDateFrom());
       return (time.getDays()*24) * reservation.getVehicle().getHourlyRentalCost();
    }

}
