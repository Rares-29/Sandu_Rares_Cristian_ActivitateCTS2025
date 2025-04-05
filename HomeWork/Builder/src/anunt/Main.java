package anunt;

import anunt.v2.AnuntBuilderV2;
import anunt.v2.AnuntV2;

public class Main {
    public static void main(String[] args) {

        AnuntBuilder anuntBuilder = new AnuntBuilder("Apartament 2 camere Militari", "Acesta este ap", 1500d);
        Anunt anunt = anuntBuilder
                .suprafata(20.5d)
                .anConstructie(2015)
                .email("rares.cris29@yahoo.ro")
                .build();
        System.out.println(anunt);

        AnuntBuilderV2 anuntBuilderV2 = new AnuntBuilderV2();
        AnuntV2 anuntV2 = anuntBuilderV2.email("rares.cris29@yahoo.ro").build();
        System.out.println(anuntV2);
    }
}