public class PetrolCar extends Vehicle {

    public PetrolCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Car is speeding up ...");
    }

    @Override
    protected void slowDown() {
        System.out.println("Car car is slowing up ...");
    }

    @Override
    protected void fuel() {
        System.out.println("Car fuel method ...");
    }
}
