public class Main {
    public static void main(String[] args) {

        ParkingLot lot=new ParkingLot(2,5);

        Vehicle car=new Car("KA01AB1234");
        Vehicle bike1=new Bike("KA02XY5678");

        lot.park(car);
        lot.park(bike1);

        lot.unPark("KA02XY5673");
        lot.unPark("KA02XY5678");
    }
}
