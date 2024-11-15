public class FourWheerParkingSpace implements ParkingSpace {
    Vehicle vehicle;
    int Parking_Id ;
    Enum parkingType;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getParking_Id() {
        return Parking_Id;
    }

    public void setParking_Id(int parking_Id) {
        Parking_Id = parking_Id;
    }

    public Enum getParkingType() {
        return parkingType;
    }

    public void setParkingType(Enum parkingType) {
        this.parkingType = parkingType;
    }

    public boolean isParkingSpaceEmpty() {
        return isParkingSpaceEmpty;
    }

    public void setParkingSpaceEmpty(boolean parkingSpaceEmpty) {
        isParkingSpaceEmpty = parkingSpaceEmpty;
    }

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
        return 200;
    }
}
