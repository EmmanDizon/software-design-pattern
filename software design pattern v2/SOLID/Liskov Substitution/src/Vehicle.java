public abstract class Vehicle {

    protected String type;
    protected  int age;

    public Vehicle(String type, int age) {
        this.type = type;
        this.age = age;
    }

    protected void speedUp() {
        System.out.println("Vehicle is speeding up ...");
    }

    protected void slowDown() {
        System.out.println("Vehicle is slowing up ...");
    }

    protected abstract void fuel();


}
