package decorator;

public class NotaPaste extends NotaDecorata{

    public NotaPaste(double amount) {
        super(amount);
    }

    public NotaPaste(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Paste fericit");
    }
}
