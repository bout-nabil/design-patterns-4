package ma.enset;

public class ImageProcessor {

    private FilterStrategy filter;
    private CompressionTemplate compression;

    public void setFilter(FilterStrategy filter) {
        this.filter = filter;
    }

    public void setCompression(CompressionTemplate compression) {
        this.compression = compression;
    }

    public int[] process(int[] data) {
        int[] filtered = filter.filter(data);
        return compression.compresser(filtered);
    }
}
