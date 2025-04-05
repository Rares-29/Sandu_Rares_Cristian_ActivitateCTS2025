package spital.factory.angajati;

public abstract class PersonalSpital {

    private String nume;
    private Integer vechime;

    public PersonalSpital(String nume, Integer vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }

    public abstract void munceste();
}
