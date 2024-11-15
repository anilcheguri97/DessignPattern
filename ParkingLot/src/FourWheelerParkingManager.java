import java.util.List;

public class FourWheelerParkingManager extends ParkingManger {
    FourWheelerParkingManager(List<ParkingSpace> parkingSpaceList) {
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
