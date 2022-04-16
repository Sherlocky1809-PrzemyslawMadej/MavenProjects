package task8;

public class ValidatorImpl implements Validator {

    private static final int MAX_SUM_OF_SIZE = 300;
    private static final int MIN_SIZE = 30;
    private static final float MAX_WEIGHT_FOR_NOT_EXPRESSED_PARCEL = 30.0f;
    private static final float MAX_WEIGHT_FOR_EXPRESSED_PARCEL = 15.0f;

    @Override
    public boolean validate(Parcel input) {
        return isGoodSize(input) && isNotTooSmall(input)
                && isWeightNotTooBigForExpressParcel(input) && isWeightNotTooBigForNotExpressParcel(input);
    }

    public boolean isGoodSize(Parcel input) {
        int sumOfLengths = input.getxLength() + input.getyLength() + input.getzLength();

        if (sumOfLengths <= MAX_SUM_OF_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNotTooSmall(Parcel input) {
        if (input.getxLength() < MIN_SIZE || input.getyLength() < MIN_SIZE || input.getzLength() < MIN_SIZE) {
            return false;
        }
        return true;
    }

    public boolean isWeightNotTooBigForNotExpressParcel(Parcel input) {
        if (input.getWeight() <= MAX_WEIGHT_FOR_NOT_EXPRESSED_PARCEL && input.isExpress() == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWeightNotTooBigForExpressParcel(Parcel input) {
        if (input.getWeight() <= MAX_WEIGHT_FOR_EXPRESSED_PARCEL && input.isExpress() == true) {
            return true;
        } else {
            return false;
        }
    }
}
