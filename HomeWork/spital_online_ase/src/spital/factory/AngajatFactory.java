package spital.factory;

import spital.factory.angajati.*;
import spital.factory.tipuriAngajati.TipAngajat;

public interface AngajatFactory {


    PersonalSpital creareAngajat(TipAngajat tipAngajat);
}
