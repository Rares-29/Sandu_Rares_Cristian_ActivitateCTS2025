package restaurant.factory_method.factory;

import restaurant.factory_method.produse.Mancare;
import restaurant.factory_method.produse.desert.CheeseCake;
import restaurant.factory_method.produse.desert.Clatite;
import restaurant.factory_method.produse.desert.Papanasi;
import restaurant.factory_method.produse.supa.SupaCiuperci;
import restaurant.factory_method.produse.supa.SupaLegume;
import restaurant.factory_method.produse.supa.SupaVita;
import restaurant.factory_method.tipuri.Desert;
import restaurant.factory_method.tipuri.FelMancare;
import restaurant.factory_method.tipuri.Supa;

public class SupaFactory implements BaseFactory {

    @Override
    public Mancare createMancare(FelMancare felMancare) {
        Supa supa = (Supa) felMancare;
        return switch (supa) {
            case SUPA_VITA -> new SupaVita();
            case SUPA_LEGUME -> new SupaLegume();
            case SUPA_CIUPERCI -> new SupaCiuperci();
            default -> throw new IllegalArgumentException("This type is not accepted yet");
        };
    }
}
