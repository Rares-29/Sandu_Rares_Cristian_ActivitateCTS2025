package singletone;

public class AgentieImobiliaraEager {

    private final String name;
    private final Double cifraAfaceri;
    private final String adresa;
    private final String website;
    private static AgentieImobiliaraEager agentieImobiliara = new AgentieImobiliaraEager("Rares agency srl", 2000000d, "Bl iuliu maniu 32,36", "www.raresagency.com");

    private AgentieImobiliaraEager(String name, Double cifraAfaceri, String adresa, String website) {
        this.name = name;
        this.cifraAfaceri = cifraAfaceri;
        this.adresa = adresa;
        this.website = website;
    }

    public static AgentieImobiliaraEager getInstance() {
        return agentieImobiliara;
    }

    public String getName() {
        return name;
    }

    public Double getCifraAfaceri() {
        return cifraAfaceri;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getWebsite() {
        return website;
    }


    @Override
    public String toString() {
        return "AgentieImobiliaraEager{" +
                "name='" + name + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                ", adresa='" + adresa + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
