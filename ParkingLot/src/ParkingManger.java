import java.util.ArrayList;
import java.util.List;

public abstract class ParkingManger {

    List<ParkingSpace> parkingSpaceList = new ArrayList<>();
    ParkingManger(List<ParkingSpace>  parkingSpaceList){
        this.parkingSpaceList=parkingSpaceList;
    }
    public abstract void addParkingSpace(ParkingSpace parkingSpace);
    public abstract void removeParkingSpace(ParkingSpace parkingSpace);

}
