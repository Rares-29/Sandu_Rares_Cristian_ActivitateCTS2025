package factory_method;

import factory_method.factories.AbstractShapeFactory;
import factory_method.factories.Shape2DFactory;
import factory_method.factories.Shape3DFactory;
import factory_method.shape_types.ShapeType;
import factory_method.shape_types.Shapes2D;
import factory_method.shape_types.Shapes3D;

public class Main {
    public static void main(String[] args) {

        AbstractShapeFactory shapeFactory = new Shape2DFactory();
        shapeFactory.drawOnTheScreen(Shapes2D.SQUARE);

        shapeFactory = new Shape3DFactory();
        shapeFactory.drawOnTheScreen(Shapes3D.PARALELIPIPED);
    }
}
