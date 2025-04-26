package decorator;

public class NotaSfarsitDeAn extends NotaDecorata{

    public NotaSfarsitDeAn(double amount) {
        super(amount);
    }

    public NotaSfarsitDeAn(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani!!");
    }
}
