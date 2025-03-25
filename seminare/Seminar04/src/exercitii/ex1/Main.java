package exercitii.ex1;

import exercitii.ex1.SupaFactory;
import exercitii.ex1.TipSupa;
import exercitii.ex1.supa.Supa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SupaFactory supaFactory = new SupaFactory();
        Supa supaCiup = supaFactory.createSupa(TipSupa.CIUPERCA);
        Supa supaLeg = supaFactory.createSupa(TipSupa.LEGUME);
        List<Supa> supaList = new ArrayList<>();
        supaList.add(supaLeg);
        supaList.add(supaCiup);

        for (Supa s : supaList) {
        System.out.println(s.calculeazaPretTotal());
        }
    }
}