public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new ElectricCar("Veloz", 6);

        vehicle.speedUp();
        vehicle.slowDown();
        vehicle.fuel();
    }
}