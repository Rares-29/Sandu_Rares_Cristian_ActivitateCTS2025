package factory_method.factories;

import factory_method.Product.Shape;
import factory_method.shape_types.ShapeType;

public abstract class AbstractShapeFactory {

    public abstract Shape createShape(ShapeType shapeType);

    public void drawOnTheScreen(ShapeType shapeType) {
        System.out.println("Calculate positions..");
        Shape shape = createShape(shapeType);
        shape.draw();
    }
}
