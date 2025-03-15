package simple_factory2.product;

public class Square implements Shape{

    double l1;

    public Square(double l1) {
        this.l1 = l1;
    }

    @Override
    public double calculateArea() {
        return l1 * l1;
    }
}
