package decorator;

public class Main {
    public static void main(String[] args) {

        ResultViewer resultViewer = new Imprimanta();
        resultViewer.analize.add(new Analiza(TipAnaliza.COLESTEROL, 300));
        resultViewer.analize.add(new Analiza(TipAnaliza.INSULINA, 240));


        ResultViewer platforma = new Platforma(resultViewer);
        platforma.printeazaRezultate();

    }
}