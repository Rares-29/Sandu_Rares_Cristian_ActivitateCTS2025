package restaurant.food;

public class InventoryStock {

    private Inventory inventory;
    private static final Integer minQuantity = 50;
    private static final Integer restockQuantity = 100;

    public InventoryStock(Inventory inventory) {
        this.inventory = inventory;
    }

    public void restockIngredients() {
        if(inventory != null && inventory.ingredients.size() > 0) {
            for (Ingredient ing : inventory.ingredients) {
                if (ing.quantity < minQuantity) {
                    System.out.println("Low stock on: " + ing.name);
                    ing.quantity += restockQuantity;
                    System.out.println("Restocked " + ing.name + " to " + ing.quantity);
                }
            }
        }
    }
}
