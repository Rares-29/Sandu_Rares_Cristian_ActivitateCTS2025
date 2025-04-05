package spital.factory;

import spital.factory.angajati.PersonalSpital;
import spital.factory.angajati.Registrator;
import spital.factory.angajati.Secretar;
import spital.factory.tipuriAngajati.TipAngajat;
import spital.factory.tipuriAngajati.TipNonMedical;

public class PersonalNonMedicalFactory implements AngajatFactory {
    @Override
    public PersonalSpital creareAngajat(TipAngajat tipAngajat) {
        TipNonMedical tipNonMedical = (TipNonMedical) tipAngajat;
        return switch (tipNonMedical) {
            case SECRETAR -> new Secretar("Cornel", 5);
            case REGISTRATOR -> new Registrator("Darius", 2);
            default -> throw new IllegalArgumentException("type not available");
        };
    }
}
