package house.builder;

import house.House;
import house.Material;
import house.components.*;

import java.util.LinkedList;
import java.util.List;

public class M2HouseBuilder extends HouseBuilder {
    // This class has some default values that needs to be set, is model2 of house made of wooden

    private Double price;
    private Integer houseSurface;
    private final Material material = Material.WOODEN;
    private Door mainDoor;
    private Plan plan;
    private Walls walls;
    private List<Window> windowList;
    private List<Door> restOfDoors;
    private Roof roof;
    private Pool pool;

    public M2HouseBuilder() {
    }

    public M2HouseBuilder addPrice(Double price) {
        this.price = price;
        return this;
    }

    public M2HouseBuilder addSurface(Integer houseSurface) {
        this.houseSurface = houseSurface;
        return this;
    }

    public M2HouseBuilder addMainDoor(String type) {
        this.mainDoor = new Door();
        return this;
    }

    public M2HouseBuilder addPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    public M2HouseBuilder addWalls(Walls walls) {
        this.walls = walls;
        return this;

    }

    public M2HouseBuilder addWindowsList(int nrOfWindows) {
        this.windowList = new LinkedList<>();
        return this;

    }

    public M2HouseBuilder addRestOfDoors(int nrOfDoors) {
        this.restOfDoors = new LinkedList<>();
        return this;
    }

    public M2HouseBuilder addRoof(Roof roof) {
        this.roof = roof;
        return this;
    }

    public M2HouseBuilder addPool(Pool pool) {
        this.pool = pool;
        return this;
    }

    @Override
    public House build() {
        return new House(price, houseSurface, material, mainDoor, plan, walls, windowList, restOfDoors, roof, pool);
    }
}
