package persoane;

public class Asistent extends Persoana implements IPredabil {

    private int idAsistent;
    private float experienta;

    public Asistent(int idAsistent, float experienta) {
        this.idAsistent = idAsistent;
        this.experienta = experienta;
    }

    public Asistent(String nume, int varsta, int idAsistent, float experienta) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.experienta = experienta;
    }

    @Override
    public void preda() {
        String sb = getNume() + "preda la seminar";
        System.out.println(sb);
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public Asistent() {

    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    public float getExperienta() {
        return experienta;
    }

    public void setExperienta(float experienta) {
        this.experienta = experienta;
    }

    @Override
    public void afiseazaModInvatare() {
        System.out.println("Invata din carti");
    }
}
