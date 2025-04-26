package facade;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public class Salon {

    private final boolean[] paturiDisponibile = new boolean[3];


    public Salon() {
        init();
    }

    private void init() {
        Arrays.fill(paturiDisponibile, true);
    }

    public boolean verificareDisponibilitatePat() {
        int nrPat = obtinePatDisponibil();
        if (nrPat != -1)
        {
            ocupaPat(nrPat);
            return true;
        }
        return false;
    }

    private int obtinePatDisponibil() {
        for (int i = 0 ; i < paturiDisponibile.length; i++) {
            if (paturiDisponibile[i]) {
                return i;
            }
        }
        return -1;
    }

    private void ocupaPat(int nrPat) {
        paturiDisponibile[nrPat] = false;
    }
}
