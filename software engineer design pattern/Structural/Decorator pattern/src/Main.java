public class Main {
    public static void main(String[] args) {
        var cloud = new CloudStream();

        storeCreditCard(new EncrpytedCloudStream(cloud));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234");
    }
}