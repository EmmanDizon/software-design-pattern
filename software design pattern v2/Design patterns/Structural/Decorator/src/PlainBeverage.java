public class PlainBeverage implements Beverage {
    @Override
    public int getCost() {
        // all beverages start at 5
        return 5;
    }

    @Override
    public String getDescription() {
        return "Plain beverage";
    }
}
