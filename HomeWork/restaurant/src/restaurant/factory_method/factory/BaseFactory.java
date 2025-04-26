package restaurant.factory_method.factory;

import restaurant.factory_method.produse.Mancare;
import restaurant.factory_method.tipuri.FelMancare;

public interface BaseFactory {


    Mancare createMancare(FelMancare felMancare);
}
