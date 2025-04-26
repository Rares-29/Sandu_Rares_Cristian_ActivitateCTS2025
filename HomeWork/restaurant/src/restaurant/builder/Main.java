package restaurant.builder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare.Builder("Rares", LocalDate.now())
                .addAsezareGeam(true)
                .addGenMuzica(GenMuzica.RAP).build();
        System.out.println(rezervare);
    }
}
