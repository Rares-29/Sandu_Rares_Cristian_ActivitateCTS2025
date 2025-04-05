package spital.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ingredient[] ingredients = {
                new Ingredient("ABC", 10.2), new Ingredient("BCD", 50.2)};
        List<Ingredient> listaIngrediente = new ArrayList<>(Arrays.asList(ingredients));
        Reteta reteta = new Reteta(listaIngrediente);
        Reteta reteta2 = reteta.clonare();
        reteta2.setNrReteta(Reteta.totalRetetePrintate);
        reteta2.getIngrediente().add(new Ingredient("CCC", 123d));
        System.out.println(reteta);
        System.out.println(reteta2);
    }
}
