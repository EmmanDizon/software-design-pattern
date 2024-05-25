public class Main {
    public static void main(String[] args) {
       DatabaseController controller  = new DatabaseController(new MySQLDatabase()); // or oracle
    }
}