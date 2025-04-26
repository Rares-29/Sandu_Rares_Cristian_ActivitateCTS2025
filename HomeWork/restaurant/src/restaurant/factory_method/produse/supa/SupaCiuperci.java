package restaurant.factory_method.produse.supa;

import restaurant.factory_method.produse.Mancare;

public class SupaCiuperci implements Mancare {

    @Override
    public void descriere() {
        System.out.println("Supa ciuperci");
    }
}
