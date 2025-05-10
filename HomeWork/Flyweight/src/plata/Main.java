package plata;

public class Main {

    public static void main(String[] args) {

        Plata plataBitcoin = new PlataBitcoin();
        Plata plataCard = new PlataCard();
        Context context = new Context();
        context.setPlata(plataBitcoin);
        context.efectueazaPlata();
        context.setPlata(plataCard);
        context.efectueazaPlata();
    }
}
