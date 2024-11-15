package interfaces;

public class Car extends Vehicle{

    public Car(int id, String vehicle_Name, VehicleType vehicleType, String kmsDriven, Status vehicleStatus) {
        super(id, vehicle_Name, vehicleType, kmsDriven, vehicleStatus);
    }
}
