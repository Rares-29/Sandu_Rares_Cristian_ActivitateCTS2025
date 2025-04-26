package restaurant.simple_factory;

public class SupaVita implements Supa {

    private static final Double pretPer100G = 20.5;
    private final Integer cantitateInG;
    private int discount;

    public SupaVita(Integer cantitateInG) {
        this.cantitateInG = cantitateInG;
        if (cantitateInG >= 400) {
            discount = 10;
        } else if (cantitateInG >= 200) {
            discount = 5;
        }
    }

    @Override
    public Double calculeazaPretTotal() {
        double pretFaraDiscount = (pretPer100G * cantitateInG) / 100;
        return pretFaraDiscount - pretFaraDiscount * discount / 100;
    };
}
