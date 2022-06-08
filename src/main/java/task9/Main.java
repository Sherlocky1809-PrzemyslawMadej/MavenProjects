package task9;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(new Point2D(0,0), new Point2D(1,0));
        System.out.println("Center point: x=0.0, y=0.0, point2D: x=1, y=0");
        double radius = circle.getRadius();
        System.out.println(radius);

        double perimeter = circle.getPerimeter();
        System.out.println(perimeter);

        double area = circle.getArea();
        System.out.println(area);

        System.out.println("*************************");
        circle.move(new MoveDirection(2, 2));
        System.out.println(circle);
        Circle circle1 = circle;
        circle1.resize(2.0);
        System.out.println("Enlarged circle: " + circle1);
        double radius1 = circle.getRadius();
        System.out.println(radius1);

        double perimeter1 = circle.getPerimeter();
        System.out.println(perimeter1);

        double area1 = circle.getArea();
        System.out.println(area1);
    }
}
