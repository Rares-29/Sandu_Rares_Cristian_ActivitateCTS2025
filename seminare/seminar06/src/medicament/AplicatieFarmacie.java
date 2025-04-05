package medicament;

import java.time.LocalDate;

public class AplicatieFarmacie {
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(20d, "Nurofen", 30, LocalDate.now());
        MedicamentSpital medicamentSpital = new MedicamentSpital(30d, "Gaviscon");
        medicamentSpital.achizitioneazaMedicament();
        System.out.println();
        medicamentFarmacie.cumparaMedicament();
        AdapterMedicament adapterMedicament = new AdapterMedicament(medicamentSpital, 300, LocalDate.now());
        System.out.println();
        System.out.println(adapterMedicament);
    }
}
