package spital.factory;

public class Pacient {
    private String nume;
    private Integer varsta;
    private Boolean hasPatRabatabil;
    private Boolean hasMicDejun;
    private Boolean hasPapuci;
    private Boolean hasHalat;

    private Pacient(String nume, Integer varsta, Boolean hasPatRabatabil, Boolean hasMicDejun, Boolean hasPapuci, Boolean hasHalat) {
        this.nume = nume;
        this.varsta = varsta;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejun = hasMicDejun;
        this.hasPapuci = hasPapuci;
        this.hasHalat = hasHalat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Boolean getHasPatRabatabil() {
        return hasPatRabatabil;
    }

    public void setHasPatRabatabil(Boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    public Boolean getHasMicDejun() {
        return hasMicDejun;
    }

    public void setHasMicDejun(Boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
    }

    public Boolean getHasPapuci() {
        return hasPapuci;
    }

    public void setHasPapuci(Boolean hasPapuci) {
        this.hasPapuci = hasPapuci;
    }

    public Boolean getHasHalat() {
        return hasHalat;
    }

    public void setHasHalat(Boolean hasHalat) {
        this.hasHalat = hasHalat;
    }

    public static class Builder {
        private String nume;
        private Integer varsta;
        private Boolean hasPatRabatabil;
        private Boolean hasMicDejun;
        private Boolean hasPapuci;
        private Boolean hasHalat;

        public Builder(String nume, Integer varsta) {
            this.nume = nume;
            this.varsta = varsta;
            hasHalat = false;
            hasMicDejun = false;
            hasPapuci = false;
            hasPatRabatabil = false;
        }

        public Pacient build() {
            return new Pacient(nume, varsta, hasPatRabatabil, hasMicDejun, hasPapuci, hasHalat);
        }

        public Builder addPatRabatabil(Boolean hasPatRabatabil) {
            this.hasPatRabatabil = hasPatRabatabil;
            return this;
        }

        public Builder addMicDejun(Boolean hasMicDejun) {
            this.hasMicDejun = hasMicDejun;
            return this;
        }

        public Builder addPapuci(Boolean hasPapuci) {
            this.hasPapuci = hasPapuci;
            return this;
        }

        public Builder addHalat(Boolean hasHalat) {
            this.hasHalat = hasHalat;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", hasPatRabatabil=" + hasPatRabatabil +
                ", hasMicDejun=" + hasMicDejun +
                ", hasPapuci=" + hasPapuci +
                ", hasHalat=" + hasHalat +
                '}';
    }
}
