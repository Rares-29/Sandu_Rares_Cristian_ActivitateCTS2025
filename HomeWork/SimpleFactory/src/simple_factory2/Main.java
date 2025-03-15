package simple_factory2;

import simple_factory2.product.Shape;

public class Main {



    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createInstance(ShapeType.RECTANGLE, 50, 20);
        Shape shape2 = shapeFactory.createInstance(ShapeType.CIRCLE, 30);
        System.out.println(shape.calculateArea());
        System.out.println(shape2.calculateArea());
    }
}
