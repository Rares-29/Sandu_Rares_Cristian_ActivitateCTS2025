package decorator;

public class NotaCraciun extends NotaDecorata {

    public NotaCraciun(double amount) {
        super(amount);
    }

    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit!");
        System.out.println("La multi ani!");
    }
}
