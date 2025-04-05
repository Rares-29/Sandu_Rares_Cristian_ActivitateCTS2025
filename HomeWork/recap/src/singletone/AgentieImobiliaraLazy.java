package singletone;

public class AgentieImobiliaraLazy {
    private String name;
    private Double cifraAfaceri;
    private String adresa;
    private String website;
    private static AgentieImobiliaraLazy agentieImobiliara;
    private AgentieImobiliaraLazy(String name, Double cifraAfaceri, String adresa, String website) {
        this.name = name;
        this.cifraAfaceri = cifraAfaceri;
        this.adresa = adresa;
        this.website = website;
    }

    public static AgentieImobiliaraLazy getInstance() {
        return getInstance(null, null, null, null);
    }
    public static AgentieImobiliaraLazy getInstance(String name, Double cifraAfaceri, String adresa, String website) {
        if (agentieImobiliara == null) {
            agentieImobiliara = new AgentieImobiliaraLazy(name, cifraAfaceri, adresa, website);
        }
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCifraAfaceri(Double cifraAfaceri) {
        this.cifraAfaceri = cifraAfaceri;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}
