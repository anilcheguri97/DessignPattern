
public class TwoWheelerParkingSpace implements ParkingSpace{
    Vehicle vehicle;
    int Parking_Id ;
    public boolean isParkingSpaceEmpty;

    @Override
    public void parkVehicle(Vehicle vehicle) {
        isParkingSpaceEmpty = false;
    }

    @Override
    public void removeVehicle(Vehicle vehicle) {
        isParkingSpaceEmpty = true;
    }

    @Override
    public int price(Vehicle vehicle) {
        return 100;
    }
}
