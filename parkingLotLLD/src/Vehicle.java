public class Vehicle {
    private final String liscencePlate;
    private final VehicleType type;

    public Vehicle(String liscencePlate,VehicleType type){
        this.liscencePlate=liscencePlate;
        this.type=type;
    }

    public String getLiscencePlate() {
        return liscencePlate;
    }

    public VehicleType getType() {
        return type;
    }
}
