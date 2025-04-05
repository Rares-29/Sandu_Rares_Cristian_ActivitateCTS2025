package spital.factory.angajati;

public class Asistent extends PersonalSpital{

    public Asistent(String nume, Integer vechime) {
        super(nume, vechime);
    }

    @Override
    public void munceste() {
        System.out.println("Asistentul munceste");
    }
}
