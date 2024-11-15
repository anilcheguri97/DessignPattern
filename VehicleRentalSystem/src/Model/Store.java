package Model;

import interfaces.VehicleInventory;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int store_id;
    VehicleInventory vehicleInventory;
    Location storeLocation;
    List<Reservation> reservationList = new ArrayList<>();

}
