
// low level
public class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to a mysql database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting mysql database");
    }
}
