public class SpreadSheet implements  IObserver{
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public  void update() {
        System.out.println("Spread sheet notify:" +dataSource.getValue());
    }
}
