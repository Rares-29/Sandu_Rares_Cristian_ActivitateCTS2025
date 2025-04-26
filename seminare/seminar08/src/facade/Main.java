package facade;

import facade.Facade;
import facade.Masa;
import facade.Ospatar;
import facade.Piccolo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Masa m = new Masa(1, true);
        Masa m2 = new Masa(2, true);
        Masa m3 = new Masa(4, false);
        Masa m4 = new Masa(8, true);
        Masa m5 = new Masa(12, true);
        List<Masa> mese = new ArrayList<>();
        mese.add(m);
        mese.add(m2);
        mese.add(m3);
        mese.add(m4);
        mese.add(m5);
        Facade facade = new Facade();
        for (Masa masa : mese) {
            System.out.println(facade.verificaAsezareMasa(masa));
        }
    }
}