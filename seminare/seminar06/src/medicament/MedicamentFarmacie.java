package medicament;

import java.time.LocalDate;

public class MedicamentFarmacie {

    private Double pretMedicament;
    private String denumireMedicament;
    private Integer stoc;
    private LocalDate dataExpirare;

    public MedicamentFarmacie(Double pretMedicament, String denumireMedicament, Integer stoc, LocalDate dataExpirare) {
        this.pretMedicament = pretMedicament;
        this.denumireMedicament = denumireMedicament;
        this.stoc = stoc;
        this.dataExpirare = dataExpirare;
    }

    public void cumparaMedicament() {
        System.out.println("Medicamentul " + denumireMedicament + " costa " + pretMedicament + ". Avem in stoc: " + stoc);
        System.out.println("Medicamentul expira in: " + dataExpirare);
    }

}
