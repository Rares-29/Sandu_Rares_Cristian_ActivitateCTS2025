// File: Ingredient.java
package restaurant.food;

public class Ingredient {
    public String name;
    public int quantity;

    public Ingredient(String n, int q) {
        name = n;
        quantity = q;
    }

    public void printIngredient() {
        System.out.println(name + " (" + quantity + " units)");
    }

}
