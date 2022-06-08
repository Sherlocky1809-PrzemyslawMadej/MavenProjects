package task9;

public class Point2D implements Movable {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void move(MoveDirection moveDirection) {

        this.setX(this.getX() + moveDirection.getX());
        this.setY(this.getY() + moveDirection.getY());
//        x += moveDiretion.getX();
//        y += moveDirection.getY();
    }


//    @Override
//    public Object move(MoveDirection moveDirection) {
//
//        double XOrdinate = getX() + moveDirection.getX();
//        double YOrdinate = getY() + moveDirection.getY();
//
//        return new Point2D(XOrdinate, YOrdinate);
//    }
}
