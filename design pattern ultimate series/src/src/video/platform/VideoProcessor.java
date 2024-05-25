package video.platform;

public class VideoProcessor {
    private IVideoEncoder encoder;
    private IVideoDatabase database;
    private IEmail email;

    public VideoProcessor(IVideoEncoder encoder, IVideoDatabase database, IEmail email) {
        this.encoder = encoder;
        this.database = database;
        this.email = email;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        email.notify(video.getUser());
    }
}
