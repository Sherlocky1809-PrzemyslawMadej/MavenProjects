package task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {


    @Test
    void shouldMove() {
        // given
        Point2D point2D = new Point2D(0.0, 0.0);
        MoveDirection moveDirection = new MoveDirection(1.0, 2.0);
        Point2D expectedPoint = new Point2D(1.0, 2.0);
        // when
        point2D.move(moveDirection);
        // then
        assertEquals(2.0, point2D.getX());


    }

}