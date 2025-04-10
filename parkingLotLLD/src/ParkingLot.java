import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private static List<Level> levels;

    public ParkingLot(int numOfLevels,int numOfSpots){
        levels=new ArrayList<>();
        for(int i=0;i<numOfLevels;i++){
            levels.add(new Level(i,numOfSpots));
        }
    }
    public boolean park(Vehicle vehicle){
        for(Level level:levels){
            if(level.parkVehicle(vehicle)){
                System.out.println("Vehicle parked at level "+level.getLevelNumber());
                return true;
            }
        }
        System.out.println("No spots available");
        return false;
    }

    public boolean unPark(String licensePlate){
        for(Level level:levels){
            if(level.unparkVehicle(licensePlate)){
                System.out.println("Unparked from level "+level.getLevelNumber());
                return  true;
            }
        }
        System.out.println("Vehicle not found");
        return false;
    }
}
