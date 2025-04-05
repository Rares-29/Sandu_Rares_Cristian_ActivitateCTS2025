package spital;

import spital.angajati.Asistent;
import spital.angajati.Brancardier;
import spital.angajati.Medic;
import spital.angajati.PersonalSpital;
import spital.tipuriAngajati.TipAngajat;
import spital.tipuriAngajati.TipMedical;

public class PersonalMedicalFactory implements AngajatFactory {
    @Override
    public PersonalSpital creareAngajat(TipAngajat tipAngajat) {
        TipMedical tipMedical = (TipMedical) tipAngajat;
        return switch (tipMedical) {
            case BRANCARDIER -> new Brancardier("Rares", 20);
            case MEDIC ->  new Medic("Vasile", 3);
            case ASISTENT -> new Asistent("Bogdan", 5);
        };
    }
}
