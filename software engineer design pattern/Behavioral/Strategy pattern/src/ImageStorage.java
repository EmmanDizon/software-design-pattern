public class ImageStorage {
    private ICompressor compressor;
    private IFilter filter;

    public ImageStorage(ICompressor compressor, IFilter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String filename) {
        compressor.compress(filename);
        filter.apply(filename);
    }
}
