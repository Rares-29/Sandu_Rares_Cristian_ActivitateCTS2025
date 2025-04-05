package spital;

import spital.angajati.PersonalSpital;
import spital.angajati.Registrator;
import spital.angajati.Secretar;
import spital.tipuriAngajati.TipAngajat;
import spital.tipuriAngajati.TipNonMedical;

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
