package agentie.registry;

import java.util.HashMap;
import java.util.Map;

public class Agentie {
    private String nume;
    private Integer cifraDeAfaceri;

    private Map<Adresa, Anunt> anunturi = new HashMap<>();

    public Agentie(String nume, Integer cifraDeAfaceri) {
        this.nume = nume;
        this.cifraDeAfaceri = cifraDeAfaceri;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getCifraDeAfaceri() {
        return cifraDeAfaceri;
    }

    public void setCifraDeAfaceri(Integer cifraDeAfaceri) {
        this.cifraDeAfaceri = cifraDeAfaceri;
    }

    public Anunt getAnunt(Adresa adresa, String proprietar, Double pret) {
        if (anunturi.containsKey(adresa)) {
            return anunturi.get(adresa);
        }
        Anunt anunt = new Anunt(adresa, proprietar, pret);
        anunturi.put(adresa, anunt);
        return anunt;
    };
}
