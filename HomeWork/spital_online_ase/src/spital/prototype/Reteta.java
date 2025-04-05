package spital.prototype;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta {

    public static Integer totalRetetePrintate = 0;
    private Integer nrReteta;
    private List<Ingredient> ingrediente;

    public Reteta(List<Ingredient> ingrediente) {
        totalRetetePrintate++;
        this.ingrediente = ingrediente;
        this.nrReteta = totalRetetePrintate;
        System.out.println("This method takes so long...");
        try {
            Thread.sleep(Duration.ofSeconds(10));
        }catch (InterruptedException ie) {
            System.out.println("Thread interupted");
        }
    }

    private Reteta() {

    }

    public List<Ingredient> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<Ingredient> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Reteta clonare() {
        totalRetetePrintate++;
       Reteta reteta = new Reteta();
       reteta.setIngrediente(new ArrayList<>(ingrediente));
       return reteta;
    }

    public Integer getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(Integer nrReteta) {
        this.nrReteta = nrReteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nrReteta=" + nrReteta +
                ", ingrediente=" + ingrediente +
                '}';
    }
}
