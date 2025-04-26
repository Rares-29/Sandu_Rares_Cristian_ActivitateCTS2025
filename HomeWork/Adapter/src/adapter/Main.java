package adapter;

public class Main {
    public static void main(String[] args) {

        Soft s = new SoftBucatarie();
        s.printareFactura(200);
        s.printareFactura(300);
        SoftBar bar = new SoftBar();
        bar.printFactura(200, 20);

        System.out.println("-----conta-----");
        SoftAdapter softAdapter = new SoftAdapter(bar);
        contabilitate(softAdapter, 200);
    }


    public static void contabilitate(Soft s, double suma) {
        s.printareFactura(suma);
    }
}