
// abstract layer between high and low level modules
public class OperationManager {

    // we have to use composition
    // because the behavior can be changed at runtime
    // the strategy knows nothing about the concrete implementation

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public  void execute(int num1, int num2) {
        int result = strategy.execute(num1, num2);
        System.out.println(result);
    }
}
