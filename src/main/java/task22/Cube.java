package task22;

public class Cube extends ThreeDShape implements Fillable {

    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Cube is a block so it doesn't have a perimeter ");
        return 0;
    }

    @Override
    public double calculateArea() {
        return Math.pow(getA(),2) * 6;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getA(),3);
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
