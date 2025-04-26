package adapter;

public class SoftAdapter implements Soft{

    private SoftBar softBar;

    public SoftAdapter(SoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printareFactura(double suma) {
        softBar.printFactura(suma, 0);
    }
}
