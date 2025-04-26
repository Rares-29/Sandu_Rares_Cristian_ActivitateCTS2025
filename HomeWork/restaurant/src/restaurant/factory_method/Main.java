package restaurant.factory_method;

import restaurant.factory_method.factory.BaseFactory;
import restaurant.factory_method.factory.DesertFactory;
import restaurant.factory_method.factory.SupaFactory;
import restaurant.factory_method.produse.Mancare;
import restaurant.factory_method.tipuri.Desert;
import restaurant.factory_method.tipuri.Supa;

public class Main {
    public static void main(String[] args) {

        BaseFactory factory = new SupaFactory();
        Mancare mancare = factory.createMancare(Supa.SUPA_CIUPERCI);
        mancare.descriere();
    }
}
