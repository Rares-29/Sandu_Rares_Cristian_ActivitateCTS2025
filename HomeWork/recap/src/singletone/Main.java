package singletone;

public class Main {

    public static void main(String[] args) {
        AgentieImobiliaraEager agentieImobiliaraEager = AgentieImobiliaraEager.getInstance();
        AgentieImobiliaraLazy agentieImobiliaraLazy = AgentieImobiliaraLazy.getInstance("Hugo srl", 2001000d, "Grozavesti 32", "www.hugoagencysrl.ro");
        AgentieImobiliaraLazy agentieImobiliaraLazy2 = AgentieImobiliaraLazy.getInstance();
        System.out.println(agentieImobiliaraEager);
        agentieImobiliaraLazy2.setName("no name");
        System.out.println(agentieImobiliaraLazy);
        System.out.println(agentieImobiliaraLazy2);

    }
}
