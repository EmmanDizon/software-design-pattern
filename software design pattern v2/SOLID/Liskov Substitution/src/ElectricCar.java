public class ElectricCar extends Vehicle {

    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Car is speeding up ...");
    }

    @Override
    protected void slowDown() {
        System.out.println("Car is slowing up ...");
    }

    @Override
    protected void fuel() {
        System.out.println("Electric car cannot be fueled ...");
    }
}
