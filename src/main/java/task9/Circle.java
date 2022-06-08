package task9;

public class Circle implements Movable, Rezisable {

    private final Point2D center;
    private final Point2D point;

    private double radius;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
        this.radius = calculateRadius();
    }

    public double getRadius() {
        return radius;
    }

    public double calculateRadius() {

        System.out.println("Calculate radius");

        double poweredDifferenceBetweenTwoXCoordinates = Math.pow((center.getX()
                - point.getX()),2);
        double poweredDifferenceBetweenTwoYCoordinates = Math.pow((center.getY()
                - point.getY()),2);

        return Math.sqrt(poweredDifferenceBetweenTwoXCoordinates + poweredDifferenceBetweenTwoYCoordinates);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {

//        move center
        center.move(moveDirection);
        // move point
        point.move(moveDirection);
    }

//    @Override
//    public Object move(MoveDirection moveDirection) {
//
//        Point2D movedCenter = (Point2D) center.move(moveDirection);
//        Point2D movedPoint = (Point2D) point.move(moveDirection);
//
//        return new Circle(movedCenter, movedPoint);
//    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }

    @Override
    public void resize(double resizeFactor) {
        radius *= resizeFactor;
    }
}
