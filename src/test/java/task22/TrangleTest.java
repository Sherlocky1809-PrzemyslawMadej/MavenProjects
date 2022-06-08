package task22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrangleTest {


    @Test
    void shouldPerimeterReturn11IfABCIsGiven() {
        // given
        Trangle trangle = new Trangle(2.0, 4.0, 5.0, 3.0);
        double expectedResult = 11.0;
        // when
        double result = trangle.calculatePerimeter();
        // then
        assertEquals(expectedResult, result);
    }


    @Test
    void shouldAreaReturn0IfAIs0() {
        // given
        Trangle trangle = new Trangle(0.0, 4.0, 5.0, 3.0);
        double expectedResult = 0.0;
        // when
        double result = trangle.calculateArea();
        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldAreaReturn5IfAIs2() {
        // given
        Trangle trangle = new Trangle(2.0, 1.5, 4.0, 3.0);
        double expectedResult = 3.0;
        // when
        double result = trangle.calculateArea();
        // then
        assertEquals(expectedResult, result);
    }


}