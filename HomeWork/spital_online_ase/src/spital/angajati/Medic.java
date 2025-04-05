package spital.angajati;

public class Medic extends PersonalSpital {

    public Medic(String nume, Integer vechime) {
        super(nume, vechime);
    }

    @Override
    public void munceste() {
        System.out.println("Medicul munceste");
    }
}
