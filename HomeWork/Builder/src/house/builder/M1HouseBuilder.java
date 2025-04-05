package house.builder;

import house.House;
import house.Material;
import house.components.*;

import java.util.LinkedList;
import java.util.List;

public class M1HouseBuilder extends HouseBuilder {
    // This class has some default values that needs to be set, is model1 of house made of brick
    private Double price;
    private Integer houseSurface;
    private final Material material = Material.BRICK;
    private Door mainDoor;
    private Plan plan;
    private Walls walls;
    private List<Window> windowList;
    private List<Door> restOfDoors;
    private Roof roof;
    private Pool pool;

    public M1HouseBuilder() {
    }

    public M1HouseBuilder addPrice(Double price) {
        this.price = price;
        return this;
    }

    public M1HouseBuilder addSurface(Integer houseSurface) {
        this.houseSurface = houseSurface;
        return this;
    }

    public M1HouseBuilder addMainDoor(String type) {
        this.mainDoor = new Door();
        return this;
    }

    public M1HouseBuilder addPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    public M1HouseBuilder addWalls(Walls walls) {
        this.walls = walls;
        return this;

    }

    public M1HouseBuilder addWindowList(int nrOfWindows) {
        this.windowList = new LinkedList<>();
        return this;

    }

    public M1HouseBuilder addRestOfDoors(int nrOfDoors) {
        this.restOfDoors = new LinkedList<>();
        return this;
    }

    public M1HouseBuilder addRoof(Roof roof) {
        this.roof = roof;
        return this;
    }

    public M1HouseBuilder addPool(Pool pool) {
        this.pool = pool;
        return this;
    }

    @Override
    public House build() {
        return new House(price, houseSurface, material, mainDoor, plan, walls, windowList, restOfDoors, roof, pool);
    }
}
