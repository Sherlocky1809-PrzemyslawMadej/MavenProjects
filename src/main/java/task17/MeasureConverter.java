package task17;

public class MeasureConverter {

    public double convert (double value, ConversionType conversionType) {
        return value * conversionType.getFactor();
    }

    public double convert (double value, ConversionTypeWithFunction conversionType) {
        return conversionType.apply(value);
    }
}
