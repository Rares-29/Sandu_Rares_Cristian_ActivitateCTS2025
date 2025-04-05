import spital.Pacient;

public class Main {
    public static void main(String[] args) {

        Pacient p = new Pacient.Builder("Mihnea", 21)
                .addHalat(true)
                .addPapuci(true)
                .addMicDejun(true).build();
        System.out.println(p);
    }
}