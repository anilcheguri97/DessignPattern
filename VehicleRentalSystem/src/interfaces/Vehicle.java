package interfaces;

public class Vehicle {
    int id;
    String vehicle_Name;
    VehicleType vehicleType;
    String kmsDriven;
    int avg;
    int cc;
    int no_of_seats;
    int dailyRentalCost;
    int hourlyRentalCost;
    Status vehicleStatus;

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(int dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public int getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public void setHourlyRentalCost(int hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public Vehicle(int id, String vehicle_Name, VehicleType vehicleType, String kmsDriven, Status vehicleStatus) {
        this.id = id;
        this.vehicle_Name = vehicle_Name;
        this.vehicleType = vehicleType;
        this.kmsDriven = kmsDriven;
        this.vehicleStatus = vehicleStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicle_Name() {
        return vehicle_Name;
    }

    public void setVehicle_Name(String vehicle_Name) {
        this.vehicle_Name = vehicle_Name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getKmsDriven() {
        return kmsDriven;
    }

    public void setKmsDriven(String kmsDriven) {
        this.kmsDriven = kmsDriven;
    }

    public Status getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(Status vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}
