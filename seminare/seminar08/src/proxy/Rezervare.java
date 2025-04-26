package proxy;

public class Rezervare implements IRezervare {

    @Override
    public boolean realizeazaRezervare(String numeClient, int nrPersoane) {
        return nrPersoane % 2 == 0;
    }
}
