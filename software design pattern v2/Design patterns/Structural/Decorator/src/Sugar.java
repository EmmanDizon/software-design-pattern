public class Sugar extends  BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 5;
    }

    public String getDescription(){
        return beverage.getDescription() + " with sugar";
    }
}
