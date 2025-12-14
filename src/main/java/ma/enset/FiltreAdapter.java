package ma.enset;

public class FiltreAdapter implements FilterStrategy {

    private ImplNonStandard impl;
    private String filterName;

    public FiltreAdapter(String filterName) {
        this.impl = new ImplNonStandard();
        this.filterName = filterName;
    }

    @Override
    public int[] filter(int[] data) {
        return impl.appliquerFiltre(filterName, data);
    }
}
