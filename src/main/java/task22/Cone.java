package task22;

public class Cone extends ThreeDShape implements Fillable{

    private double radius;
    private double length;
    private double height;
    private static final double PI = Math.PI;

    public Cone(double radius, double length, double height) {
        this.radius = radius;
        this.length = length;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Cone doesn't have a perimeter");
        return 0;
    }

    @Override
    public double calculateArea() {
        return PI * getRadius() * (getRadius() + getLength());
    }

    @Override
    public double calculateVolume() {
        return PI * Math.pow(getRadius(), 2) * getHeight() / 3;
    }


    @Override
    public void fill(double amountOfWater) {
        if (amountOfWater > calculateVolume()) {
            System.out.println("The bottle is overloaded - it poured too much water.");
        } else if (amountOfWater == calculateVolume()) {
            System.out.println("The bottle is full - it poured enough amount of water.");
        } else {
            System.out.println("The bottle is not full - You can pour much water.");
        }
    }
}
