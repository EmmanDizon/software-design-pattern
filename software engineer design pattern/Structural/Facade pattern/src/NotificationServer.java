public class NotificationServer {
    // connect to server -> Connection
    //authenticate(appId, key) -> AuthToken
    // send(authToken, message, target)
    // conn.disconnect()

public Connection connect(String ipAddress) {
    return new Connection();
}

public AuthToken authenticate(String appId, String key) {
    return new AuthToken();
}

public void send(AuthToken authToken, Message message, String target){

    System.out.println("Sending a message");
}
}
