public interface ParkingSpace {

    Vehicle vehicle = null;
    Enum parkingType = null;
    int price =0;
   public void parkVehicle(Vehicle vehicle);
   public void removeVehicle(Vehicle vehicle);
   public int price(Vehicle vehicle);



}
