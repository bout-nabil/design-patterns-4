package ma.enset;

public abstract class CompressionTemplate {

    public final int[] compresser(int[] data) {
        preTraitement();
        int[] result = compresserDonnees(data);
        postTraitement();
        return result;
    }

    protected void preTraitement() {
        System.out.println("Pré-traitement...");
    }

    protected void postTraitement() {
        System.out.println("Post-traitement...");
    }

    protected abstract int[] compresserDonnees(int[] data);
}
