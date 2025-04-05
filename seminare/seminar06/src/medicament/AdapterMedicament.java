package medicament;

import java.time.LocalDate;

public class AdapterMedicament extends MedicamentFarmacie {

    private MedicamentSpital medicamentSpital;


    public AdapterMedicament(MedicamentSpital medicamentSpital, Integer stoc, LocalDate dataExpirare) {
        super(medicamentSpital.getPretMedicament(), medicamentSpital.getNumeMedicament(), stoc, dataExpirare);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
