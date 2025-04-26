package restaurant.builder;

import java.time.LocalDate;

public class Rezervare {

    private String nume;
    private LocalDate dataRezervare;
    private Boolean hasAsezareGeam;
    private Boolean hasScaunErgonomic;
    private Boolean hasDecoratiuni;
    private Boolean hasMuzicaPersonalizata;
    private GenMuzica genMuzica;

    private Rezervare(String nume, LocalDate dataRezervare, Boolean hasAsezareGeam, Boolean hasScaunErgonomic, Boolean hasDecoratiuni, Boolean hasMuzicaPersonalizata, GenMuzica genMuzica) {
        this.nume = nume;
        this.dataRezervare = dataRezervare;
        this.hasAsezareGeam = hasAsezareGeam;
        this.hasScaunErgonomic = hasScaunErgonomic;
        this.hasDecoratiuni = hasDecoratiuni;
        this.hasMuzicaPersonalizata = hasMuzicaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public static class Builder {
        private String nume;
        private LocalDate dataRezervare;
        private Boolean hasAsezareGeam;
        private Boolean hasScaunErgonomic;
        private Boolean hasDecoratiuni;
        private Boolean hasMuzicaPersonalizata;
        private GenMuzica genMuzica;

        public Builder(String nume, LocalDate dataRezervare) {
            this.nume = nume;
            this.dataRezervare = dataRezervare;
            this.hasDecoratiuni = false;
            this.hasAsezareGeam = false;
            this.hasMuzicaPersonalizata = false;
            this.hasScaunErgonomic = false;
        }

        public Rezervare build() {
            return new Rezervare(nume, dataRezervare, hasAsezareGeam, hasScaunErgonomic, hasDecoratiuni, hasMuzicaPersonalizata, genMuzica);
        }

        public Builder addAsezareGeam(Boolean hasAsezareGeam) {
            this.hasAsezareGeam = hasAsezareGeam;
            return this;
        }

        public Builder addScaunErgonomic(Boolean hasScaunErgonomic) {
            this.hasScaunErgonomic = hasScaunErgonomic;
            return this;
        }

        public Builder addDecoratiuni(Boolean hasDecoratiuni) {
            this.hasDecoratiuni = hasDecoratiuni;
            return this;
        }

        public Builder addMuzicaPersonalizata(Boolean hasMuzicaPersonalizata) {
            this.hasMuzicaPersonalizata = hasMuzicaPersonalizata;
            return this;
        }

        public Builder addGenMuzica(GenMuzica genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", dataRezervare=" + dataRezervare +
                ", hasAsezareGeam=" + hasAsezareGeam +
                ", hasScaunErgonomic=" + hasScaunErgonomic +
                ", hasDecoratiuni=" + hasDecoratiuni +
                ", hasMuzicaPersonalizata=" + hasMuzicaPersonalizata +
                ", genMuzica=" + genMuzica +
                '}';
    }
}
