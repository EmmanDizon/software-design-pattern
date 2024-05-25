public class ManagerClass implements Manager {
    @Override
    public void salary() {
        System.out.println("Getting the salary");
    }

    @Override
    public void hire() {
        System.out.println("Hiring");
    }

    @Override
    public void train() {
        System.out.println("Training");
    }

    @Override
    public void addBonus() {
        System.out.println("Bonus");
    }
}
