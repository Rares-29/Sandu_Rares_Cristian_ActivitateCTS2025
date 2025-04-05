import medicament.AdapterMedicament;
import medicament.MedicamentFarmacie;
import medicament.MedicamentSpital;

import java.time.LocalDate;

public class Main {

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie) {
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(20d, "Nurofen", 20, LocalDate.now());
        MedicamentSpital medicamentSpital = new MedicamentSpital(30d, "Gaviscon");
        AdapterMedicament adapterMedicament = new AdapterMedicament(medicamentSpital, 20, LocalDate.now());
        vindeMedicament(medicamentFarmacie);
        vindeMedicament(adapterMedicament);
    }
}