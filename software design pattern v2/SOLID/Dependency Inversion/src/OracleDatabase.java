
// another low level module
public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to a oracle database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting oracle database");
    }
}
