package simple_factory;

import simple_factory.Product.Shape;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.drawOnTheScreen(ShapeType.CUBE);
        shapeFactory.drawOnTheScreen(ShapeType.PARALELIPIPED);
    }
}
