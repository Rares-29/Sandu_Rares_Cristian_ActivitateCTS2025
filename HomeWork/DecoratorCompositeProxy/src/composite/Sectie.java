package composite;

public class Sectie implements ISectie{

    private Integer buget;

    public Sectie() {
        buget = (int) (Math.random() * 10000);
    }

    public Integer calculeazaBuget() {
        return buget;
    }
}
