package ma.enset;

public class FiltreSimple implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i] / 2;
        }
        return result;
    }
}
