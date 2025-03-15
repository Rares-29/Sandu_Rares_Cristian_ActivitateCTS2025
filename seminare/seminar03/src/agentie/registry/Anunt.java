package agentie.registry;

public class Anunt {

    private Adresa adresa;
    private String proprietar;

    private Double pret;

    protected Anunt(Adresa adresa, String proprietar, Double pret) {
        this.adresa = adresa;
        this.proprietar = proprietar;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Anunt{" +
                "adresa=" + adresa +
                ", proprietar='" + proprietar + '\'' +
                ", pret=" + pret +
                '}';
    }
}
