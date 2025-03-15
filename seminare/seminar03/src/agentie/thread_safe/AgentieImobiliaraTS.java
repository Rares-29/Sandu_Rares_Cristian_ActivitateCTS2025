package agentie.thread_safe;


import agentie.lazy.AgentieImobiliaraLazy;

public class AgentieImobiliaraTS {

    private String name;
    private Integer nrAnunturi;

    private String site;
    private Double cifraAfaceri;
    private static AgentieImobiliaraTS agentieImobiliara;

    private AgentieImobiliaraTS(String name, Integer nrAnunturi, String site, Double cifraAfaceri) {
        this.name = name;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }
    public static AgentieImobiliaraTS getInstance() {
        synchronized (agentieImobiliara) {
            if (agentieImobiliara == null) {
                agentieImobiliara = new AgentieImobiliaraTS("myAgency", 100, "www.agentie.com", 100000d);
            }
            return agentieImobiliara;
        }
    }

    @Override
    public String toString() {
        return "AgentieImobiliaraTS{" +
                "name='" + name + '\'' +
                ", nrAnunturi=" + nrAnunturi +
                ", site='" + site + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                '}';
    }
}