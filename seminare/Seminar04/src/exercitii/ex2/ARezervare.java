package exercitii.ex2;

public abstract class ARezervare {

    private static String numeDefault = "ABC";
    protected String nume;
    protected int ora;
    protected  int min;
    protected int zi;
    protected int nrPersoane;

    public ARezervare(String nume, int ora, int min, int zi, int nrPersoane) {
        if (nume.length() < 3) nume = numeDefault;
        this.nume = nume;
        this.nume = nume;
        this.ora = ora;
        this.min = min;
        this.zi = zi;
        this.nrPersoane = nrPersoane;
    }

    public ARezervare() {

    }

    public abstract ARezervare clone(int zi);

    public static String getNumeDefault() {
        return numeDefault;
    }

    public static void setNumeDefault(String numeDefault) {
        ARezervare.numeDefault = numeDefault;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getZi() {
        return zi;
    }

    public void setZi(int zi) {
        this.zi = zi;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        return "ARezervare{" +
                "nume='" + nume + '\'' +
                ", ora=" + ora +
                ", min=" + min +
                ", zi=" + zi +
                ", nrPersoane=" + nrPersoane +
                '}';
    }
}
