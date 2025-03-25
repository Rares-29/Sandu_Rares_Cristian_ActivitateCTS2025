package exercitii.ex1;

import exercitii.ex1.supa.Supa;
import exercitii.ex1.supa.SupaCiuperca;
import exercitii.ex1.supa.SupaLegume;
import exercitii.ex1.supa.SupaVita;

public class SupaFactory {

    private static int cantitate = 200;
    private static double pret = 14d;

    public Supa createSupa(TipSupa tipSupa) {
        switch (tipSupa) {
            case VITA -> {
                return new SupaVita(cantitate, pret, true);
            }
            case LEGUME -> {
                return new SupaLegume(cantitate, pret, true);
            }
            case CIUPERCA -> {
                return new SupaCiuperca(cantitate, pret, true);
            }
            default -> {
                throw new IllegalArgumentException("Not a supported type of supa");
            }
        }
    }
}
