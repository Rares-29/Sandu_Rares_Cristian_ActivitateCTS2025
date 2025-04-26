package restaurant.simple_factory;

public class SupaLegume implements Supa{

    private static final Double pretPer100G = 15.5;
    private final Integer cantitateInG;
    private int discount;

    public SupaLegume(Integer cantitateInG) {
        this.cantitateInG = cantitateInG;
        if (cantitateInG >= 400) {
            discount = 20;
        } else if (cantitateInG >= 200) {
            discount = 10;
        }
    }

    @Override
    public Double calculeazaPretTotal() {
        double pretFaraDiscount = (pretPer100G * cantitateInG) / 100;
        return pretFaraDiscount - pretFaraDiscount * discount / 100;
    }

    public Integer getCantitateInG() {
        return cantitateInG;
    }

    public Integer getDiscount() {
        return discount;
    }
}
