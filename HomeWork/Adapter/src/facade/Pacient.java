package facade;

public class Pacient {

    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void verificareStare() {
        System.out.println(nume + ": sunt bolnav");
    }

    public String getNume() {
        return nume;
    }
}
