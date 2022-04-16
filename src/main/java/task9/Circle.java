package task9;

public class Circle implements Movable{

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {

        double poweredDifferenceBetweenTwoXCoordinates = Math.pow((center.getX()
                - point.getX()),2);
        double poweredDifferenceBetweenTwoYCoordinates = Math.pow((center.getY()
                - point.getY()),2);

        return Math.sqrt(poweredDifferenceBetweenTwoXCoordinates + poweredDifferenceBetweenTwoYCoordinates);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public Object move(MoveDirection moveDirection) {

        Point2D movedCenter = (Point2D) center.move(moveDirection);
        Point2D movedPoint = (Point2D) point.move(moveDirection);

        return new Circle(movedCenter, movedPoint);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }
}
