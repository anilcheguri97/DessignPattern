import java.util.Date;
import java.util.List;

public class EntryGate {
    Vehicle vehicle;

    public void generateTicket(Vehicle vehicle) {
        Ticket t = new Ticket();
        t.setEntryTime(new Date());
        t.setVehicle(vehicle);
        t.setParkingStrategy(new NearToEntrance());
    }


}
