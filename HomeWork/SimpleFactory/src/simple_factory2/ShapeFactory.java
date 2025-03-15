package simple_factory2;

import simple_factory2.product.Circle;
import simple_factory2.product.Rectangle;
import simple_factory2.product.Shape;
import simple_factory2.product.Square;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactory {


    public Shape createInstance(ShapeType shapeType, double l1) {
        return createInstance(shapeType, l1, 0);
    }
    public Shape createInstance(ShapeType shapeType, double l1, double l2) {
        switch (shapeType) {
            case CIRCLE -> {
                return new Circle(l1);
            }
            case RECTANGLE -> {
                return new Rectangle(l1, l2);
            }
            case SQUARE -> {
                return new Square(l1);
            }
            default -> throw new IllegalArgumentException("Shape is not recognized");
        }
    }
}
