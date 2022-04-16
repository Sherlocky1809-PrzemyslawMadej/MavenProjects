package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListOfStringsIgnoreCase {

    public static void main(String[] args) {

        List<String> unsorted = new ArrayList<>();
        unsorted.add("A");
        unsorted.add("a");
        unsorted.add("B");
        unsorted.add("Z");
        unsorted.add("c");
        unsorted.add("r");
        System.out.println(unsorted);

        List<String> sorted = sortLettersIgnoreCase(unsorted);

        System.out.println("*************");
        System.out.println(sorted);

        System.out.println("*************");
        System.out.println(sortLettersIgnoreCaseWithComparator(unsorted));

        System.out.println("*************");
        System.out.println(unsorted);

    }

    private static List<String> sortLettersIgnoreCaseWithComparator(List<String> unsorted) {

        List<String> stringListComparator = new ArrayList<>(unsorted);
        stringListComparator.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        return stringListComparator;
    }

    private static List<String> sortLettersIgnoreCase(List<String> unsorted) {

        List<String> stringList = new ArrayList<>(unsorted);
        stringList.sort((o1, o2) -> o2.compareToIgnoreCase(o1));
        return stringList;
    }
}
