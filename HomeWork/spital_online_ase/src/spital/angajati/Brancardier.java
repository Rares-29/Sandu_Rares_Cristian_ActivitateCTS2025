package spital.angajati;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, Integer vechime) {
        super(nume, vechime);
    }

    @Override
    public void munceste() {
        System.out.println("Brancardierul munceste");
    }
}
