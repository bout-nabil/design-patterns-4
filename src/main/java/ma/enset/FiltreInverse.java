package ma.enset;

public class FiltreInverse implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = 255 - data[i];
        }
        return result;
    }
}
