package Model;

import interfaces.ReservationStatus;
import interfaces.ReservationType;
import interfaces.Vehicle;

import java.time.LocalDate;
import java.util.Date;

public class Reservation {
    int reservationId;
    Vehicle vehicle;
    Date bookingDateFrom;
    Date bookingDateTo;

    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getBookingDateFrom() {
        return bookingDateFrom;
    }

    public void setBookingDateFrom(Date bookingDateFrom) {
        this.bookingDateFrom = bookingDateFrom;
    }

    public LocalDate getBookingDateTo() {
        return bookingDateTo;
    }

    public void setBookingDateTo(Date bookingDateTo) {
        this.bookingDateTo = bookingDateTo;
    }

    public Long getFromTimeStamp() {
        return fromTimeStamp;
    }

    public void setFromTimeStamp(Long fromTimeStamp) {
        this.fromTimeStamp = fromTimeStamp;
    }

    public Long getToTimeStamp() {
        return toTimeStamp;
    }

    public void setToTimeStamp(Long toTimeStamp) {
        this.toTimeStamp = toTimeStamp;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
