public class NearToEntrance extends ParkingStrategy {
    Vehicle vehicle;
     public void bookSpot(Vehicle vehicle){
         System.out.println(vehicle.vehicleType+"  is parked at Near to Entrance ");
     }
}
