package facade;

public class Medic {

    public boolean confirmarePacient(Pacient p) {
        return p.getNume().length() % 2 == 0;
    }
}
