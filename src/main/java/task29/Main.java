package task29;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GenerykPart<Integer> integerGenerykPart = new GenerykPart<>();

        Integer[] arrayofNumbers = new Integer[]{1,2,3,4,5};

        double partOf = integerGenerykPart.partOf(List.of(arrayofNumbers), integer -> integer % 2 != 0);
        System.out.println(partOf + " %");
    }
}
