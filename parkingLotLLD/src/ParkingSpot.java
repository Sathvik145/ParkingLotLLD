public class ParkingSpot {
    private final int spotId;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotId){
        this.spotId=spotId;
        this.isOccupied=false;
    }

    public boolean park(Vehicle vehicle){

            this.parkedVehicle=vehicle;
            this.isOccupied=true;
            return true;

    }

    public boolean unpark(){
        if(isOccupied){
            this.parkedVehicle=null;
            this.isOccupied=false;
            return true;
        }
        return false;
    }





    public int getSpotId() {
        return spotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
