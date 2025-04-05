package builder;

public class Main {
    public static void main(String[] args) {
        House.HouseBuilder houseBuilder = new House.HouseBuilder(200, "Ilie Petre 88");
        houseBuilder.addPool(true)
                .addMaterial(Material.WOOD)
                .addPrice(250000d);
        House house = houseBuilder.build();
        House house2 = houseBuilder.addPrice(2000d).build();
        System.out.println(house);
        System.out.println(house2);
    }
}