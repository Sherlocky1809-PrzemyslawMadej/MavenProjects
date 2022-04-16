package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfStrings {

    public static void main(String[] args) {
        
        List<String> unsorted = new ArrayList<>();
        unsorted.add("A");
        unsorted.add("a");
        unsorted.add("B");
        unsorted.add("Z");
        unsorted.add("c");
        unsorted.add("r");
        System.out.println(unsorted);

        List<String> sorted = sortLetters(unsorted);

        System.out.println("*************");
        System.out.println(sorted);
        System.out.println(unsorted);
        
    }

    private static List<String> sortLetters(List<String> unsorted) {

        List<String> stringList = new ArrayList<>(unsorted);
        stringList.sort((o1, o2) -> o2.compareToIgnoreCase(o1));
        return stringList;
    }
}
