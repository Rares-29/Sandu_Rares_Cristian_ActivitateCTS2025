package restaurant.factory_method.produse.desert;

import restaurant.factory_method.produse.Mancare;

public class Papanasi implements Mancare {

    @Override
    public void descriere() {
        System.out.println("Papanasi");
    }
}
