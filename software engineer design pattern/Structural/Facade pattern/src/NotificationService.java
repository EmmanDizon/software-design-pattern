public class NotificationService {
    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("192.168.1.1");
        var authToken = server.authenticate("123", "333");

        server.send(authToken, new Message(message), target);
        connection.disconnect();

    }
}
