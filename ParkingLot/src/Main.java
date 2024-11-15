public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle v = new Vehicle();
        v.setVehicleType(VehicleType.TWOWHEELER);
        v.setVehileId(123);

        Vehicle fourWheeler1 = new Vehicle();
        fourWheeler1.setVehileId(1234);
        fourWheeler1.setVehicleType(VehicleType.FOURWHEELER);


        EntryGate entryGate = new EntryGate();
        entryGate.generateTicket(v);
    }
}