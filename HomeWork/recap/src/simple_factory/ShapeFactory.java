package simple_factory;

import simple_factory.Product.*;

public class ShapeFactory {

    public Shape createShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CUBE -> new Cube();
            case RECTANGLE -> new Rectangle();
            case PARALELIPIPED -> new ParalelipipedDreptunghic();
            case SQUARE -> new Square();
            default -> throw new IllegalArgumentException("Shape type not allowed");
        };
    }

    public void drawOnTheScreen(ShapeType shapeType) {
        System.out.println("Calculate positions..");
        Shape shape = createShape(shapeType);
        shape.draw();
    }
}
