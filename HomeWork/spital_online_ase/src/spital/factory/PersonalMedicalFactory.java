package spital.factory;

import spital.factory.angajati.Asistent;
import spital.factory.angajati.Brancardier;
import spital.factory.angajati.Medic;
import spital.factory.angajati.PersonalSpital;
import spital.factory.tipuriAngajati.TipAngajat;
import spital.factory.tipuriAngajati.TipMedical;

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
