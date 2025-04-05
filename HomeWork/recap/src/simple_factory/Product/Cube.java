package simple_factory.Product;

import simple_factory.Product.Shape;

public class Cube implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a cube");
    }
}
