package medicament;

public class MedicamentSpital {

    private Double pretMedicament;
    private String numeMedicament;

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul: " + numeMedicament + " costa " + pretMedicament);
    }

    private void prezintaReteta() {
        System.out.println("Uitati reteta pt medicamentul: " + numeMedicament);
    }

    public MedicamentSpital(Double pretMedicament, String numeMedicament) {
        this.pretMedicament = pretMedicament;
        this.numeMedicament = numeMedicament;
    }

    public Double getPretMedicament() {
        return pretMedicament;
    }

    public void setPretMedicament(Double pretMedicament) {
        this.pretMedicament = pretMedicament;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }
}
