package task22;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getA() + getB());
    }

    @Override
    public double calculateArea() {
        return getB() * getA();
    }
}
