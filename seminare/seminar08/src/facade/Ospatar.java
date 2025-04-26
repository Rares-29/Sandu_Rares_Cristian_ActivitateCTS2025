package facade;

public class Ospatar {

    public boolean esteAranjata(Masa m){
        if (m.getNrMasa() % 4 == 0) {
            return true;
        }
        return false;
    }

}
