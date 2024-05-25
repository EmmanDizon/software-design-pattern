public class DatabaseConnector {

    private static DatabaseConnector INSTANCE;

    private DatabaseConnector() {}

    public static DatabaseConnector getInstance() {
        if(INSTANCE == null)
            INSTANCE = new DatabaseConnector();

        return INSTANCE;
    }

    public void connect() {
        System.out.println("connecting to db...");
    }

    public void disconnect() {
        System.out.println("disconnecting....");
    }
}
