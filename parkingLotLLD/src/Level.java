import java.util.ArrayList;
import java.util.List;

public class Level {

    private final int levelNumber;
    private final List<ParkingSpot> spots;

    public Level(int levelNumber,int numberOfSpots){
        this.levelNumber=levelNumber;
        this.spots=new ArrayList<>();
        for(int i=0;i<numberOfSpots;i++){
            spots.add(new ParkingSpot(i));
        }
    }
    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot:spots){
            if(spot.isOccupied()==false){
                return spot.park(vehicle);
            }
        }
        return  false;
    }

    public boolean unparkVehicle(String licensePlate){
        for(ParkingSpot spot:spots){
            if(spot.isOccupied() && spot.getParkedVehicle().getLiscencePlate().equals(licensePlate)){
                spot.unpark();
                return  true;
            }
        }
        return false;
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
