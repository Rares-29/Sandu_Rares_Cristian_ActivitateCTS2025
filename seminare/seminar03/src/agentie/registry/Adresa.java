package agentie.registry;

import java.util.Objects;

public class Adresa {

    private String locatie;
    private Integer apartament;
    private Integer bloc;
    private Integer nrCamere;

    public Adresa(String locatie, Integer apartament, Integer bloc, Integer nrCamere) {
        this.locatie = locatie;
        this.apartament = apartament;
        this.bloc = bloc;
        this.nrCamere = nrCamere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresa adresa = (Adresa) o;
        return Objects.equals(locatie, adresa.locatie) && Objects.equals(apartament, adresa.apartament) && Objects.equals(bloc, adresa.bloc) && Objects.equals(nrCamere, adresa.nrCamere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locatie, apartament, bloc, nrCamere);
    }
}
