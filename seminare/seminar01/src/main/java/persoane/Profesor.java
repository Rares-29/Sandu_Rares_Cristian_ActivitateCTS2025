package persoane;

public class Profesor extends Persoana implements IPredabil {

    private int idAngajat;
    private int experienta;
    @Override
    public void preda() {
        System.out.println("Currently teaching...");
    }

    public Profesor() {

    }


    public int getExperienta() {
        return experienta;
    }

    public void setExperienta(int experienta) {
        this.experienta = experienta;
    }

    public Profesor(int idAngajat, int experienta) {
        this.idAngajat = idAngajat;
        this.experienta = experienta;
    }

    public Profesor(String nume, int varsta, int idAngajat, int experienta) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
        this.experienta = experienta;
    }

    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    @Override
    public void afiseazaModInvatare() {
        System.out.println(getNume() + " invata de " + experienta);
    }
}
