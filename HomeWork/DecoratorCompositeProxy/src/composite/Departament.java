package composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements ISectie {

    Integer sum = 0;
    List<ISectie> sectieList = new ArrayList<>();

    @Override
    public Integer calculeazaBuget() {
        return sum;
    }

    public void adaugaSectie(ISectie sectie) {
        sectieList.add(sectie);
        sum += sectie.calculeazaBuget();
    }

    public void stergeSectie(Integer i) {
        sectieList.remove((int)i);
    }

    public ISectie getSectie(Integer i) {
        return sectieList.get(i);
    }
}
