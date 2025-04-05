package factory_method.factories;

import factory_method.Product.Cube;
import factory_method.Product.ParalelipipedDreptunghic;
import factory_method.Product.Rectangle;
import factory_method.Product.Shape;
import factory_method.shape_types.ShapeType;
import factory_method.shape_types.Shapes2D;
import factory_method.shape_types.Shapes3D;

public class Shape3DFactory extends AbstractShapeFactory{

    @Override
    public Shape createShape(ShapeType shapeType) {
        Shapes3D shapeType1 = (Shapes3D) shapeType;
        return switch (shapeType1) {
            case  PARALELIPIPED -> new ParalelipipedDreptunghic();
            case CUBE -> new Cube();
            default -> throw new IllegalArgumentException("Shape type not allowed");
        };
    }
}
