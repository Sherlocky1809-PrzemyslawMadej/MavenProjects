package task3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapkaMain {

    public static void main(String[] args) {

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("Java", 18);
        stringIntegerMap.put("C#", 9);
        stringIntegerMap.put("Python", 1);
        stringIntegerMap.put("JavaScript", 10);
        stringIntegerMap.put("PHP", 0);

        printMap(stringIntegerMap);
        System.out.println("**********************");
        printMapWithStream(stringIntegerMap);
    }

    private static void printMapWithStream(Map<String, Integer> stringIntegerMap) {

        String collect = stringIntegerMap.entrySet().stream()
                .map(entry -> "Klucz: " + entry.getKey() + ", " + " Wartość: " + entry.getValue())
                .collect(Collectors.joining("," + System.lineSeparator(), "", "."));

        System.out.println(collect);
    }

    private static void printMap(Map<String, Integer> stringIntegerMap) {

//        for (String i : stringIntegerMap.keySet()) {
//            System.out.println("Klucz: " + i + ", " + " Wartość: " + stringIntegerMap.get(i) + ".");
//        }

            int index = 0;

            for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {

                boolean isLastElement = index == stringIntegerMap.size() - 1;
                if (isLastElement) {
                    System.out.println("Klucz: " + entry.getKey() + ", " + " Wartość: " + entry.getValue() + ".");
                } else {
                    System.out.println("Klucz: " + entry.getKey() + ", " + " Wartość: " + entry.getValue() + ",");
                }
                index++;
            }
        }
    }

