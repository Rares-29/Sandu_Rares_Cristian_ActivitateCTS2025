package exercitii.ex2;

public class RezervareCompleta extends ARezervare {

    public RezervareCompleta(String nume, int ora, int min, int zi, int nrPersoane) {
        super(nume, ora, min, zi, nrPersoane);
    }

    public RezervareCompleta() {

    }

    @Override
    public ARezervare clone(int zi) {
        RezervareCompleta rezervareCompleta = new RezervareCompleta();
        rezervareCompleta.setMin(this.min);
        rezervareCompleta.setNume(this.nume);
        rezervareCompleta.setOra(this.ora);
        rezervareCompleta.setNrPersoane(this.nrPersoane);
        rezervareCompleta.setZi(zi);
        return rezervareCompleta;
    }


}
