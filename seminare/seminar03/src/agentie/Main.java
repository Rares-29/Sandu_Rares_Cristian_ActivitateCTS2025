package agentie;

import agentie.eager.AgentieImobiliaraEag;

public class Main {
    public static void main(String[] args) {

        AgentieImobiliaraEag agentieImobiliaraEag = AgentieImobiliaraEag.getInstance();
        AgentieImobiliaraEag agentieImobiliaraEag1 = AgentieImobiliaraEag.getInstance();
        System.out.println(agentieImobiliaraEag == agentieImobiliaraEag1);

    }
}