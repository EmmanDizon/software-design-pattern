
// high level module
public class DatabaseController {

    // we are programming to an interface - achieved loosely coupled architecture
    // the higher module knows nothing about the concrete implementation
    private Database database;

    public DatabaseController(Database database) {
        // tight binding
        // database = new MySQLDatabase();
        // database.connect();
        // database.disconnect();

        // abstract implementation

      this.database = database;
    }

    public void connect() {
        database.connect();
    }

    public  void disconnect() {
        database.disconnect();
    }
}
