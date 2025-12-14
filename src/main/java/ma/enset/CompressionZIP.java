package ma.enset;

public class CompressionZIP extends CompressionTemplate {
    @Override
    protected int[] compresserDonnees(int[] data) {
        System.out.println("Compression ZIP");
        return data;
    }
}
