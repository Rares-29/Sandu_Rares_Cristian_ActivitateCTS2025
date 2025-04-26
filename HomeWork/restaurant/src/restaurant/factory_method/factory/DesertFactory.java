package restaurant.factory_method.factory;

import restaurant.factory_method.produse.Mancare;
import restaurant.factory_method.produse.desert.CheeseCake;
import restaurant.factory_method.produse.desert.Clatite;
import restaurant.factory_method.produse.desert.Papanasi;
import restaurant.factory_method.tipuri.Desert;
import restaurant.factory_method.tipuri.FelMancare;

public class DesertFactory implements BaseFactory{

    @Override
    public Mancare createMancare(FelMancare felMancare) {
        Desert desert = (Desert) felMancare;
        return switch (desert) {
            case CLATITE -> new Clatite();
            case PAPANASI -> new Papanasi();
            case CHEESECAKE -> new CheeseCake();
        };
    }
}
