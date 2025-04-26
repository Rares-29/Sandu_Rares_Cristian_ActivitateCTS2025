package proxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        afisare(rezervare.realizeazaRezervare("Rares", 2));
        afisare(rezervare.realizeazaRezervare("Rares", 3));


        System.out.println("-----------Proxy---------------");
        rezervare = new RezervareProxy();
        afisare(rezervare.realizeazaRezervare("Rares", 2));
        afisare(rezervare.realizeazaRezervare("Rares", 3));

    }

    public static void afisare(boolean success) {
        String message;
        if (success) {
            message = "Rezervarea s-a realizat cu succes";
        } else {
            message = "Rezervarea nu s-a realizat";
        }
        System.out.println(message);
    }
}
