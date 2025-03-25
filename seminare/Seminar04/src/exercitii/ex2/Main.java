package exercitii.ex2;

public class Main {

    public static void main(String[] args) {

        RezervareCompleta rezervareCompleta = new RezervareCompleta("Rares", 20, 30, 15, 4);
        ARezervare r2 = rezervareCompleta.clone(14);
        System.out.println(rezervareCompleta);
        System.out.println(r2);
    }
}
