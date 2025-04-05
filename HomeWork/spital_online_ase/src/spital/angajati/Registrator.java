package spital.angajati;

public class Registrator extends PersonalSpital {

    public Registrator(String nume, Integer vechime) {
        super(nume, vechime);
    }

    @Override
    public void munceste() {
        System.out.println("Registratorul munceste");
    }
}
