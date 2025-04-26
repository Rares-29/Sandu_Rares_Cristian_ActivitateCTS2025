package facade;

import java.util.Arrays;
import java.util.List;

public class Spital {

    public static void main(String[] args) {
        Pacient p = new Pacient("Rares2");
        Facade f = new Facade();
        f.interneazaPacient(p);
        List<Pacient> pacienti =Arrays.asList(
                new Pacient("Rares"),
                new Pacient("Bogdan"),
                new Pacient("Damian"),
                new Pacient("Florin"),
                new Pacient("Cristi"),
                new Pacient("Andrei"));
        pacienti.forEach(pacient -> {
            System.out.println("------------------Pacient nou------------------");
            f.interneazaPacient(pacient);
        });
    }


}
