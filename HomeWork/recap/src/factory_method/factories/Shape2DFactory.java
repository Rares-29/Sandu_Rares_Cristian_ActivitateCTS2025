package factory_method.factories;

import factory_method.Product.*;
import factory_method.shape_types.ShapeType;
import factory_method.shape_types.Shapes2D;

public class Shape2DFactory extends AbstractShapeFactory {

    @Override
    public Shape createShape(ShapeType shapeType) {
        Shapes2D shapeType1 = (Shapes2D) shapeType;
        return switch (shapeType1) {
            case  SQUARE -> new Cube();
            case RECTANGLE -> new Rectangle();
            default -> throw new IllegalArgumentException("Shape type not allowed");
        };
    }


}
