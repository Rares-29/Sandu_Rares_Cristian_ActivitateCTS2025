package spital;

import spital.angajati.*;
import spital.tipuriAngajati.TipAngajat;

public interface AngajatFactory {


    PersonalSpital creareAngajat(TipAngajat tipAngajat);
}
