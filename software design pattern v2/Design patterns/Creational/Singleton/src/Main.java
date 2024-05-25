public class Main {
    public static void main(String[] args) {
       DatabaseConnector db1 = DatabaseConnector.getInstance();
       DatabaseConnector db2 = DatabaseConnector.getInstance();

       if(db1 == db2)
           System.out.println("The objects are the same");
    }
}