package house;

import house.components.*;

import java.util.List;

public class House {

    private final Double price;
    private final Integer houseSurface;
    private final Material material;
    private final Door mainDoor;
    private final Plan plan;
    private final Walls walls;
    private final List<Window> windowList;
    private final List<Door> restOfDoors;
    private final Roof roof;
    private final Pool pool;

    public House(Double price, Integer houseSurface, Material material, Door mainDoor, Plan plan, Walls walls, List<Window> windowList, List<Door> restOfDoors, Roof roof, Pool pool) {
        this.price = price;
        this.houseSurface = houseSurface;
        this.material = material;
        this.mainDoor = mainDoor;
        this.plan = plan;
        this.walls = walls;
        this.windowList = windowList;
        this.restOfDoors = restOfDoors;
        this.roof = roof;
        this.pool = pool;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getHouseSurface() {
        return houseSurface;
    }

    public Material getMaterial() {
        return material;
    }

    public Door getMainDoor() {
        return mainDoor;
    }

    public Plan getPlan() {
        return plan;
    }

    public Walls getWalls() {
        return walls;
    }

    public List<Window> getWindowList() {
        return windowList;
    }

    public List<Door> getRestOfDoors() {
        return restOfDoors;
    }

    public Roof getRoof() {
        return roof;
    }
}
