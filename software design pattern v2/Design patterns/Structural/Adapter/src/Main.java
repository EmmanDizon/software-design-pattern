public class Main {
    public static void main(String[] args) {
       Vehicle bus = new Bus();
       Vehicle bicycle = new BicycleAdapter(new Bicycle());

       bus.accelerate();
       bicycle.accelerate();
    }
}