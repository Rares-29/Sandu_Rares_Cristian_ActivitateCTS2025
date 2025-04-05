package builder;

public class House {

    private final Double price;
    private final String address;
    private final boolean hasPool;
    private final Integer surface;
    private final Material material;
    private String doorType;


    private House(Double price, Integer surface, String address, boolean hasPool, Material material, String doorType) {
        this.price = price;
        this.surface = surface;
        this.address = address;
        this.hasPool = hasPool;
        this.material = material;
        this.doorType = doorType;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getSurface() {
        return surface;
    }

    public String getAddress() {
        return address;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public Material getMaterial() {
        return material;
    }

    public static class HouseBuilder {
        private Double price;
        private Integer surface;
        private String address;
        private boolean hasPool;
        private Material material;
        private String doorType;

        public HouseBuilder(Integer surface, String address) {
            this.surface = surface;
            this.address = address;
        }

        public House build() {
            return new House(price, surface, address, hasPool, material, doorType);
        }

        public HouseBuilder addPrice(Double price) {
            this.price = price;
            return this;
        }


        public HouseBuilder addPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder addMaterial(Material material) {
            this.material = material;
            return this;
        }

        public HouseBuilder addDoorType(String doorType) {
            this.doorType = doorType;
            return this;
        }

        @Override
        public String toString() {
            return "HouseBuilder{" +
                    "price=" + price +
                    ", surface=" + surface +
                    ", address='" + address + '\'' +
                    ", hasPool=" + hasPool +
                    ", material=" + material +
                    ", doorType='" + doorType + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", surface=" + surface +
                ", address='" + address + '\'' +
                ", hasPool=" + hasPool +
                ", material=" + material +
                ", doorType='" + doorType + '\'' +
                '}';
    }
}
