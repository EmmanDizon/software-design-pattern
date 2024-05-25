package video.platform;

public class SqlVideoDatabase implements IVideoDatabase {
    @Override
    public void store(Video video) {
        System.out.println("Storing video metadata");
        System.out.println("Title" + video.getTitle());
        System.out.println("Filename" + video.getFileName());
        System.out.println("Done !\n");
    }
}
