package exercitii.ex1.supa;

public class SupaCiuperca extends Supa{

    private static Integer discount = 20;
    public SupaCiuperca(Integer cantitate, Double pret, Boolean isIute) {
        super(cantitate, pret, isIute);
    }

    @Override
    public Double calculeazaPretTotal() {
        return pretTotal - (pretTotal * discount) / 100;
    }

    @Override
    protected void afisareDescriere() {

    }
}
