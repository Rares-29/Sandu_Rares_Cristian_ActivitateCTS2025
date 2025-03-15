package agentie.registry;

public class Main {

    public static void main(String[] args) {

        Agentie agentie = new Agentie("Agentia Tulpac", 2000);
        Adresa adresa = new Adresa("Romana", 20, 3, 5);
        Adresa adresa2 = new Adresa("Universitate", 20, 3, 5);
        Anunt anunt = agentie.getAnunt(adresa, "Rares", 200000d);
        Anunt anunt2 = agentie.getAnunt(adresa2, "Bogdan", 300000d);
        Anunt anunt3 = agentie.getAnunt(adresa2, "Mihnea", 400000d);
        System.out.println(anunt);
        System.out.println(anunt2);
        System.out.println(anunt3);
    }
}
