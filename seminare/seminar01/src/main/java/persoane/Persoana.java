package persoane;

public abstract class Persoana implements IPersoana {

    protected String nume;
    protected int varsta;

    public Persoana() {

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }
    public abstract void afiseazaModInvatare();

    @Override
    public String toString() {
        return "main.java.university.persoane.Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
