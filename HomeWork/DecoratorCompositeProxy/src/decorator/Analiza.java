package decorator;

import java.util.HashMap;
import java.util.Map;

public class Analiza {

    private TipAnaliza tipAnaliza;
    private static final Map<TipAnaliza, Integer> praguriRisc = new HashMap<>();

    {
        praguriRisc.put(TipAnaliza.COLESTEROL, 220);
        praguriRisc.put(TipAnaliza.INSULINA, 250);
    }
    private int rezultat;

    public Analiza(TipAnaliza tipAnaliza, int rezultat) {
        this.tipAnaliza = tipAnaliza;
        this.rezultat = rezultat;
    }

    public TipAnaliza getTipAnaliza() {
        return tipAnaliza;
    }

    public void setTipAnaliza(TipAnaliza tipAnaliza) {
        this.tipAnaliza = tipAnaliza;
    }

    public int getRezultat() {
        return rezultat;
    }

    public void setRezultat(int rezultat) {
        this.rezultat = rezultat;
    }

    public boolean isResultGood() {
        int prag = praguriRisc.getOrDefault(tipAnaliza, -1);
        return prag > rezultat;
    }
}
