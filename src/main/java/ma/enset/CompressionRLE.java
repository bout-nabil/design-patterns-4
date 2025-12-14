package ma.enset;

public class CompressionRLE extends CompressionTemplate {
    @Override
    protected int[] compresserDonnees(int[] data) {
        System.out.println("Compression RLE");
        return data;
    }
}
