package ma.enset;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i] + 10;
        }
        return result;
    }
}
