package proxy;

public class RezervareProxy implements IRezervare {
    IRezervare rezervare;

    public RezervareProxy() {
        this.rezervare = new Rezervare();
    }

    @Override
    public boolean realizeazaRezervare(String numeClient, int nrPersoane) {
        return nrPersoane >= 4 && rezervare.realizeazaRezervare(numeClient, nrPersoane);
    }
}
