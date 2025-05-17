package ChainOfResponsability;

public class InfoAutobuz extends InfoTransport {


    @Override
    public String recomandaTransport(int nrKm) {
        if (nrKm >= 3 && nrKm <= 5) return "Autobuz";
        return next.recomandaTransport(nrKm);
    };


}
