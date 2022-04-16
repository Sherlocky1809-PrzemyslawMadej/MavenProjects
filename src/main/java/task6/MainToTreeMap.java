package task6;

import java.util.Map;
import java.util.TreeMap;

public class MainToTreeMap {

    public static void main(String[] args) {

        Map<String, Integer> studentsGrades = new TreeMap<>();

        studentsGrades.put("Przemek", 5);
        studentsGrades.put("Kasia", 3);
        studentsGrades.put("Rafal", 2);
        studentsGrades.put("Jacek", 1);
        studentsGrades.put("Michal", 2);

        printFirstAndLastEntrySet(studentsGrades);

    }

    private static void printFirstAndLastEntrySet (Map<String, Integer> studentsGrades) {

        int index = 0;

        for (Map.Entry<String,Integer> entry: studentsGrades.entrySet()) {

            boolean isLastElement = index == studentsGrades.size() - 1;
            if (isLastElement || index == 0) {
                System.out.println("Klucz: " + entry.getKey() + ", " + " Wartość: " + entry.getValue() + ".");
            }
            index++;
        }
    }
}
