package agentie.eager;

public class AgentieImobiliaraEag {

    private String name;
    private Integer nrAnunturi;

    private String site;

    private Double cifraAfaceri;

    private static final AgentieImobiliaraEag agentieImobiliara = new AgentieImobiliaraEag("myAgency", 100, "www.agentie.com", 100000d);

    public static AgentieImobiliaraEag getInstance() {
        return agentieImobiliara;
    }

    private AgentieImobiliaraEag() {

    }

    private AgentieImobiliaraEag(String name, Integer nrAnunturi, String site, Double cifraAfaceri) {
        this.name = name;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }


    @Override
    public String toString() {
        return "AgentieImobiliaraEag{" +
                "name='" + name + '\'' +
                ", nrAnunturi=" + nrAnunturi +
                ", site='" + site + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                '}';
    }
}
