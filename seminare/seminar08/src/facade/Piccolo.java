package facade;

public class Piccolo {

    public boolean debaraseaza(Masa m) {
        if (m.getNrMasa() % 2 == 0) {
            return true;
        }
        else return false;
    }
}
