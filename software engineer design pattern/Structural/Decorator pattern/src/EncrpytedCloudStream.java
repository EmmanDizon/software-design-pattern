public class EncrpytedCloudStream implements Stream {
    private Stream stream;

    public EncrpytedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt (String data) {
        return "!@#@!#$%^#^";
    }
}
