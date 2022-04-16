package task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void radiusIs5ForThisPoints() {
        // given
        Circle circle = new Circle(new Point2D(0,3), new Point2D(4, 0));
        double expectedRadius = 5;
        // when
        double radius = circle.getRadius();
        // then
        assertEquals(expectedRadius, radius);
    }

    @Test
    void perimeterIsAround31ForThisPoints() {
        // given
        Circle circle = new Circle(new Point2D(0,3), new Point2D(4, 0));
        double expectedPerimeter = 2 * Math.PI * 5;
        // when
        double perimeter = circle.getPerimeter();
        // then
        assertEquals(expectedPerimeter, perimeter);
    }

    @Test
    void areaIsAround25PiForThisPoints() {
        // given
        Circle circle = new Circle(new Point2D(0,3), new Point2D(4, 0));
        double expectedArea = Math.PI * 25;
        // when
        double area = circle.getArea();
        // then
        assertEquals(expectedArea, area);
    }


}