package restaurant.simple_factory;

public class SupaFactory {

    public Supa createInstance(TipSupa tipSupa, Integer cantitateInG) {
        return switch (tipSupa) {
            case SUPA_VITA -> new SupaVita(cantitateInG);
            case SUPA_CIUPERCI -> new SupaCiuperci(cantitateInG);
            case SUPA_LEGUME -> new SupaLegume(cantitateInG);
            default -> throw new IllegalArgumentException("This type is not available for now");
        };
    }
}
