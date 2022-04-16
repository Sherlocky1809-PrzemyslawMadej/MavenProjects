package task9;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(4,0), new Point2D(0,3));
        double radius = circle.getRadius();
        System.out.println(radius);

        double perimeter = circle.getPerimeter();
        System.out.println(perimeter);

        double area = circle.getArea();
        System.out.println(area);

        System.out.println("*************************");
        Object movedCircle = circle.move(new MoveDirection(2, 2));
        System.out.println(movedCircle);
    }
}
