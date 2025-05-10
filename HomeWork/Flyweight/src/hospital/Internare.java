package hospital;

public class Internare {

    private Integer codSalon;
    private Integer nrPat;
    private Integer nrZileInternare;

    public Internare(Integer codSalon, Integer nrPat, Integer nrZileInternare) {
        this.codSalon = codSalon;
        this.nrPat = nrPat;
        this.nrZileInternare = nrZileInternare;
    }

    public Integer getCodSalon() {
        return codSalon;
    }

    public Integer getNrPat() {
        return nrPat;
    }

    public Integer getNrZileInternare() {
        return nrZileInternare;
    }
}
