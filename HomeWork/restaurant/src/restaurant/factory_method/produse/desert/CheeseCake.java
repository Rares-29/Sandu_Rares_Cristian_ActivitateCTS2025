package restaurant.factory_method.produse.desert;

import restaurant.factory_method.produse.Mancare;

public class CheeseCake implements Mancare {

    @Override
    public void descriere() {
        System.out.println("cheese cake");
    }
}
