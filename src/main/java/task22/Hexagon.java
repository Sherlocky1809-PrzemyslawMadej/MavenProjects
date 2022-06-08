package task22;

public class Hexagon extends Shape {

    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * getA();
    }

    @Override
    public double calculateArea() {
        return (Math.pow(getA(), 2) * Math.sqrt(3)) / 4;
    }
}
