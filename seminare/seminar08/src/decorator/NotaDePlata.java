package decorator;

public class NotaDePlata implements Nota {
    double amount;

    public NotaDePlata(double amount) {
        this.amount = amount;
    }

    @Override
    public void printare() {
        System.out.println("Aveti de plata: " + amount);
    }
}
