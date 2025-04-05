package spital.angajati;

public class Secretar extends PersonalSpital{

    public Secretar(String nume, Integer vechime) {
        super(nume, vechime);
    }

    @Override
    public void munceste() {
        System.out.println("Secretarul munceste");
    }
}
