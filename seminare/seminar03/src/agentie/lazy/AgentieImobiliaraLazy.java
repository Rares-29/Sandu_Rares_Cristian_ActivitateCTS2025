package agentie.lazy;

public class AgentieImobiliaraLazy {

    private String name;
    private Integer nrAnunturi;

    private String site;
    private Double cifraAfaceri;
    private static AgentieImobiliaraLazy agentieImobiliara;

    private AgentieImobiliaraLazy(String name, Integer nrAnunturi, String site, Double cifraAfaceri) {
        this.name = name;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }
    public static AgentieImobiliaraLazy getInstance() {
        if (agentieImobiliara == null) {
            agentieImobiliara = new AgentieImobiliaraLazy("myAgency", 100, "www.agentie.com", 100000d);
        }
        return agentieImobiliara;
    }

    @Override
    public String toString() {
        return "AgentieImobiliaraLazy{" +
                "name='" + name + '\'' +
                ", nrAnunturi=" + nrAnunturi +
                ", site='" + site + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                '}';
    }
}
