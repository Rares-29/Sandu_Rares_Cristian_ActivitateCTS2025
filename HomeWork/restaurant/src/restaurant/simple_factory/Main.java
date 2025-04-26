package restaurant.simple_factory;

import restaurant.simple_factory.Supa;
import restaurant.simple_factory.SupaFactory;
import restaurant.simple_factory.TipSupa;

public class Main {
    public static void main(String[] args) {


        SupaFactory supaFactory = new SupaFactory();
        Supa supa = supaFactory.createInstance(TipSupa.SUPA_VITA, 100);
        System.out.println(supa.calculeazaPretTotal());
    }
}