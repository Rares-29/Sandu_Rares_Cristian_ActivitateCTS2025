package decorator;

public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaDePlata(200d);
        nota.printare();

        NotaDecorata notaD = new NotaSfarsitDeAn(nota);
        notaD.printare();
    }
}
