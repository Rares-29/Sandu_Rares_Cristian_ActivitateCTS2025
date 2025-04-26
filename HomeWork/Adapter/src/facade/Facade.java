package facade;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Facade {
    private Medic m = new Medic();
    private Salon s = new Salon();

    public void interneazaPacient(Pacient p) {
        p.verificareStare();
        if (!m.confirmarePacient(p))
        {
            System.out.println("Verdict medic: Pacientul nu este bolnav");
            return;
        }
        System.out.println("Verdict medic: Pacientul este bolnav");

        if (s.verificareDisponibilitatePat()) {
            System.out.println("Patul a fost rezervat");
        } else {
            System.out.println("Salonul nu contine paturi disponibile");
        }
    }
}
