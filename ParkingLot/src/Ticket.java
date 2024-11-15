import java.util.Date;

public class Ticket {
    public Date getEntryTime() {
        return EntryTime;
    }

    public ParkingStrategy getParkingStrategy() {
        return parkingStrategy;
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public void setEntryTime(Date entryTime) {
        EntryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    Date EntryTime;
    Vehicle vehicle;

    ParkingStrategy parkingStrategy;
    ParkingSpace parkingSpace;


}
