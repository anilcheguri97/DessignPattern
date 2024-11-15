package interfaces;

import Model.Location;

import java.util.List;

public class VehicleInventory {
    List<Vehicle> vehicles;

    public VehicleInventory(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
