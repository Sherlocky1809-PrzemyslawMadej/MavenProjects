package task22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexagonTest {

    @Test
    void shouldPerimeterReturn30IfAIs5() {
        // given
        Hexagon hexagon = new Hexagon(5.0);
        double expectedResult = 30.0;
        // when
        double result = hexagon.calculatePerimeter();
        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldPerimeterReturn0IfAIs0() {
        // given
        Hexagon hexagon = new Hexagon(0.0);
        double expectedResult = 0.0;
        // when
        double result = hexagon.calculatePerimeter();
        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldAreaReturn0IfAIs0() {
        // given
        Hexagon hexagon = new Hexagon(0.0);
        double expectedResult = 0.0;
        // when
        double result = hexagon.calculateArea();
        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldAreaReturnSqrt3IfAIs2() {
        // given
        Hexagon hexagon = new Hexagon(2.0);
        double expectedResult = Math.sqrt(3.0);
        // when
        double result = hexagon.calculateArea();
        // then
        assertEquals(expectedResult, result);
    }

}