package adapter;

public class SoftBucatarie implements Soft {


    @Override
    public void printareFactura(double suma) {
        System.out.println("Factura de la bucatarie este de: " + suma + " lei.");
    }
}
