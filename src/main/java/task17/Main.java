package task17;

public class Main {


    public static void main(String[] args) {
        MeasureConverter measurementConverter = new MeasureConverter();

        System.out.println(measurementConverter.convert(2, ConversionType.METERS_TO_YARDS));
        System.out.println(measurementConverter.convert(2, ConversionTypeWithFunction.METERS_TO_YARDS));

    }
}
