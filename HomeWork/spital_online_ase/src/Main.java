import spital.AngajatFactory;
import spital.Pacient;
import spital.angajati.PersonalSpital;
import spital.angajati.TipAngajat;

public class Main {
    public static void main(String[] args) {

        AngajatFactory angajatFactory = new AngajatFactory();
        PersonalSpital personalSpital = angajatFactory.creareAngajat(TipAngajat.BRANCARDIER);
        personalSpital.munceste();
    }
}