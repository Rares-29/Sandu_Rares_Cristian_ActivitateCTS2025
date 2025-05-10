import hospital.FabricaPacienti;
import hospital.Internare;
import hospital.Pacient;

public class Main {
    public static void main(String[] args) {

        Internare i = new Internare(1, 2, 5);
        Internare i2 = new Internare(1, 3, 7);
        FabricaPacienti fabricaPacienti = new FabricaPacienti();
        fabricaPacienti.getPacient(1, "Rares", "Magheru 32-36", "0770762385").afiseazaInternare(i);
        fabricaPacienti.getPacient(2, "Rares", "Magheru 32-36", "0770762385").afiseazaInternare(i2);
        fabricaPacienti.getPacient(2, "Corina", "Magheru 32-36", "0739541233").afiseazaInternare(i2);

    }
}