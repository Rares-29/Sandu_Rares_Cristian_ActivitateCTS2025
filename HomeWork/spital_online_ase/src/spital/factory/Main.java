package spital.factory;

import spital.factory.AngajatFactory;
import spital.factory.PersonalNonMedicalFactory;
import spital.factory.angajati.PersonalSpital;
import spital.factory.tipuriAngajati.TipNonMedical;

public class Main {
    public static void main(String[] args) {

        AngajatFactory angajatFactory = new PersonalNonMedicalFactory();
        PersonalSpital p = angajatFactory.creareAngajat(TipNonMedical.REGISTRATOR);
        PersonalSpital p2 = angajatFactory.creareAngajat(TipNonMedical.SECRETAR);
        System.out.println(p);
        System.out.println(p2);
    }
}