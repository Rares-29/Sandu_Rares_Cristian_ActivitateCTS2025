package decorator;

public enum TipAnaliza {
    COLESTEROL("colesterol"), INSULINA("insulina");

    private final String denumire;

    TipAnaliza(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }
}
