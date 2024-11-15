import org.w3c.dom.xpath.XPathResult;

public class ParkingSpaceFactory {
    ParkingManger parkingManger;
    ParkingSpaceFactory (ParkingManger parkingManger){
        this.parkingManger= parkingManger;
    }
    public ParkingManger getParkingSpace(Vehicle vehicle){
        if(vehicle.getVehicleType().equals("FOURWHEELER")) {
            return new FourWheelerParkingManager();
        }
        else {
            return new TwoWheelerParkingManager();
        }
    }
}
