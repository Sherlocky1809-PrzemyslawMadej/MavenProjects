package task22;

public class Trangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double h;

    public Trangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double calculatePerimeter() {
        return getA() + getB() + getC();
    }

    @Override
    public double calculateArea() {
        return 0.5 * getA() * getH();
    }
}
