package task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorImplTest {

    @Test
    void SumOfLengthsIsLessThanThreeHundred() {
        // given
        ValidatorImpl validatorOfLengths = new ValidatorImpl();
        Parcel parcel1 = new Parcel(100, 80, 50, 10.5f, true);
        // when
        boolean isLessThan300 = validatorOfLengths.isGoodSize(parcel1);
        // then
        assertTrue(isLessThan300);
    }

    @Test
    void SumOfLengthsIsEqualThreeHundred() {
        // given
        ValidatorImpl validatorOfLengths = new ValidatorImpl();
        Parcel parcel1 = new Parcel(100, 120, 80, 10.5f, true);
        // when
        boolean isEqualMaxSize = validatorOfLengths.isGoodSize(parcel1);
        // then
        assertTrue(isEqualMaxSize);
    }

    @Test
    void shouldGetExceptionIfSumOfLengthsIsMoreThreeHundred() {
        // given
        ValidatorImpl validatorOfLengths = new ValidatorImpl();
        Parcel parcel1 = new Parcel(100, 120, 140, 10.5f, true);
        // when
        boolean isLessThanMaxSize = validatorOfLengths.isGoodSize(parcel1);
        // then
        assertFalse(isLessThanMaxSize);
    }

    @Test
    void shouldReturnFalseIfXLengthIsLessThan30() {
        // given
        ValidatorImpl validatorOfLengths = new ValidatorImpl();
        Parcel parcel1 = new Parcel(25, 120, 80, 10.5f, true);
        // when
        boolean isGoodSizes = validatorOfLengths.isNotTooSmall(parcel1);
        // then
        assertFalse(isGoodSizes);
    }

    @Test
    void shouldReturnTrueIfXLengthIsEqual30() {
        // given
        ValidatorImpl validatorOfLengths = new ValidatorImpl();
        Parcel parcel1 = new Parcel(30, 120, 80, 10.5f, true);
        // when
        boolean isGoodSizes = validatorOfLengths.isNotTooSmall(parcel1);
        // then
        assertTrue(isGoodSizes);

    }

    @Test
    void shouldReturnTrueForNotExpressedParcelIfWeightIs30() {
        // given
        ValidatorImpl validatorOfWeight = new ValidatorImpl();
        Parcel parcel1 = new Parcel(30, 120, 80, 30.0f, false);
        // when
        boolean isGoodWeight = validatorOfWeight.isWeightNotTooBigForNotExpressParcel(parcel1);
        // then
        assertTrue(isGoodWeight);

    }

    @Test
    void shouldReturnFalseForNotExpressedParcelIfWeightIs31() {
        // given
        ValidatorImpl validatorOfWeight = new ValidatorImpl();
        Parcel parcel1 = new Parcel(30, 120, 80, 30.1f, false);
        // when
        boolean isGoodWeight = validatorOfWeight.isWeightNotTooBigForNotExpressParcel(parcel1);
        // then
        assertFalse(isGoodWeight);

    }

    @Test
    void shouldReturnTrueForExpressedParcelIfWeightIs15() {
        // given
        ValidatorImpl validatorOfWeight = new ValidatorImpl();
        Parcel parcel1 = new Parcel(30, 120, 80, 15.0f, true);
        // when
        boolean isGoodWeight = validatorOfWeight.isWeightNotTooBigForExpressParcel(parcel1);
        // then
        assertTrue(isGoodWeight);
    }

    @Test
    void shouldReturnFalseForExpressedParcelIfWeightIs16() {
        // given
        ValidatorImpl validatorOfWeight = new ValidatorImpl();
        Parcel parcel1 = new Parcel(30, 120, 80, 16.0f, true);
        // when
        boolean isGoodWeight = validatorOfWeight.isWeightNotTooBigForExpressParcel(parcel1);
        // then
        assertFalse(isGoodWeight);
    }
}