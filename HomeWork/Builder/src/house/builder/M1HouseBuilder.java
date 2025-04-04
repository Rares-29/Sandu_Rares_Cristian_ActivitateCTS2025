package house;

import house.components.*;

import java.util.List;

public class M1HouseBuilder extends HouseBuilder {
    private Double price;
    private Integer houseSurface;
    private Material material;
    private Door mainDoor;
    private Plan plan;
    private Walls walls;
    private List<Window> windowList;
    private List<Door> restOfDoors;
    private Roof roof;

    public M1HouseBuilder() {
    }

    public void price(Double price) {
        this.price = price;
    }

    public void setHouseSurface(Integer houseSurface) {
        this.houseSurface = houseSurface;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setMainDoor(Door mainDoor) {
        this.mainDoor = mainDoor;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    public void setWindowList(int nrOfWindows) {
        this.windowList = windowList;
    }

    public void setRestOfDoors(int nrOfDoors) {
        this.restOfDoors = restOfDoors;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }
}
