package decorator;

public abstract class NotaDecorata implements Nota{

    protected Nota nota;
   public NotaDecorata(double amount) {
       this.nota = new NotaDePlata(amount);
   }

    public NotaDecorata(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void printare() {
        nota.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
