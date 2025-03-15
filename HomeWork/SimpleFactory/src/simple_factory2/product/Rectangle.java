package simple_factory2.product;

public class Rectangle implements Shape{

    double l1;
    double l2;

    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public double calculateArea() {
        return l1 * l2;
    }
}
