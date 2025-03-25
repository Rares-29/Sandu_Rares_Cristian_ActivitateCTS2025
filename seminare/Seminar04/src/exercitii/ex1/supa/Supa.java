package exercitii.ex1.supa;

public abstract class Supa {

    protected Integer cantitate;
    protected Double pretTotal;
    protected Boolean isIute;


    public Supa(Integer cantitate, Double pret, Boolean isIute) {
        this.cantitate = cantitate;
        this.pretTotal = pret;
        this.isIute = isIute;
    }

    public abstract Double calculeazaPretTotal();
    protected abstract void afisareDescriere();

    public Double getPretTotal() {
        return pretTotal;
    }

    public void setPretTotal(Double pretTotal) {
        this.pretTotal = pretTotal;
    }
}
