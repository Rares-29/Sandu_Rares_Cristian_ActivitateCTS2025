package spital;

import spital.angajati.*;

public class AngajatFactory {


    public PersonalSpital creareAngajat(TipAngajat tipAngajat) {
        return switch (tipAngajat) {
            case MEDIC -> new Medic("Rares", 20);
            case ASISTENT -> new Asistent("Bogdan", 5);
            case BRANCARDIER -> new Brancardier("Mihai", 10);
            default -> throw new IllegalArgumentException("Not available");
        };
    }
}
