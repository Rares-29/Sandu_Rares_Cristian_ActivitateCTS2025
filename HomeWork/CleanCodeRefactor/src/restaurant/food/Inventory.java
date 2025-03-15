// File: Inventory.java
package restaurant.food;

import restaurant.food.Ingredient;

import java.util.*;

public class Inventory {
    public List<Ingredient> ingredients;

    public Inventory() {
        ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ing) {
        ingredients.add(ing);
    }

    public void printInventory() {
        System.out.println("----- Inventory -----");
        for (Ingredient ing : ingredients) {
            System.out.println(ing.name + ": " + ing.quantity + " units");
        }
        System.out.println("---------------------");
    }

    public void useIngredient(String ingName, int amount) {
        for (Ingredient ing : ingredients) {
            if(ing.name.equalsIgnoreCase(ingName)) {
                ing.quantity -= amount;
                if(ing.quantity < 0) {
                    ing.quantity = 0;
                }
                System.out.println("Used " + amount + " of " + ing.name + ". New quantity: " + ing.quantity);
            }
        }
    }


}
