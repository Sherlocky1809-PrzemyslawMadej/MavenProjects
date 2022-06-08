package task22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldPerimeterReturn30IfAIs6AndBIs5() {
        // given
        Rectangle rectangle = new Rectangle(6.0, 5.0);
        double expectedResult = 22.0;
        // when
        double result = rectangle.calculatePerimeter();
        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldPerimeterReturn0IfAAndBIs0() {
        // given
        Rectangle rectangle = new Rectangle(0.0, 0.0);
        double expectedResult = 0.0;
        // when
        double result = rectangle.calculatePerimeter();
        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldAreaReturn0IfAAndBIs0() {
        // given
        Rectangle rectangle = new Rectangle(0.0, 0.0);
        double expectedResult = 0.0;
        // when
        double result = rectangle.calculateArea();
        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldAreaReturn30IfAIs6AndBIs5() {
        // given
        Rectangle rectangle = new Rectangle(6.0, 5.0);
        double expectedResult = 30.0;
        // when
        double result = rectangle.calculateArea();
        // then
        assertEquals(expectedResult, result);
    }


}