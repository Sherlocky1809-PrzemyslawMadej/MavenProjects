package task29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerykPartTest {

    @Test
    void shouldReturnZeroIfConditionIsFalse() {
        // given
        GenerykPart<Integer> generykPart = new GenerykPart<>();
        Integer[] defaultArray = new Integer[]{1,2,3,4,5};
        boolean condition = 1 > 2;
        double expectedResult = 0.0;
        // when
//        double result = generykPart.partOf(defaultArray,condition);
        // then
//        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnArithmeticExceptionIfArrayIsEmpty() {
        // given
        GenerykPart<Integer> generykPart = new GenerykPart<>();
        Integer[] defaultArray = new Integer[]{};
        boolean condition = 1 > 2;
        // when
//        double result = generykPart.partOf(defaultArray,condition);
        // then
//        assertThrows(ArithmeticException.class, () -> {defaultArray.length} );
    }

}