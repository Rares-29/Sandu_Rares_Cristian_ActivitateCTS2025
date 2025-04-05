import spital.AngajatFactory;
import spital.PersonalMedicalFactory;
import spital.PersonalNonMedicalFactory;
import spital.angajati.PersonalSpital;
import spital.tipuriAngajati.TipAngajat;
import spital.tipuriAngajati.TipMedical;
import spital.tipuriAngajati.TipNonMedical;

public class Main {
    public static void main(String[] args) {

        AngajatFactory angajatFactory = new PersonalNonMedicalFactory();
        PersonalSpital p = angajatFactory.creareAngajat(TipNonMedical.REGISTRATOR);
        PersonalSpital p2 = angajatFactory.creareAngajat(TipNonMedical.SECRETAR);
        System.out.println(p);
        System.out.println(p2);
    }
}