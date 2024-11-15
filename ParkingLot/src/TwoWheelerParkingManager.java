import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingManager extends ParkingManger {
    // List<ParkingSpace> twoWheelerParkingList = new ArrayList<>();
    TwoWheelerParkingManager(List<ParkingSpace> parkingSpaceList) {
        super(parkingSpaceList);
    }

    @Override
    public void addParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaceList.add(parkingSpace);
    }

    @Override
    public void removeParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaceList.remove(parkingSpace);
    }
}
