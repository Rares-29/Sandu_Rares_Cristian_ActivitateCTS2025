package hospital;

public class Pacient {

    public Integer codPacient;
    private String name;
    private String address;
    private String phoneNumber;

    public Pacient(Integer codPacient, String name, String address, String phoneNumber) {
        this.codPacient = codPacient;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void afiseazaInternare(Internare i) {
        System.out.println("Pacientul " + name + " de la adresa" + address + " este internat pentru: " + i.getNrZileInternare() + " la salonul/patul: " + i.getCodSalon() + "/" + i.getNrPat());
    }
}
