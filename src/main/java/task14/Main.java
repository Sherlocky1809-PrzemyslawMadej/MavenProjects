package task14;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static final int BOUND = 1001;

    public static void main(String[] args) {

        int[] array = new int[100_000];
        fill(array);

        System.out.println(Arrays.toString(array));

        System.out.println("*****************");

        List<Integer> distinct = distinct(array);
        System.out.println(distinct);

        List<Integer> setOfRepeatableValues = getListOfDuplicates(array);
        System.out.println("*****************");
        System.out.println("Duplicates: " + setOfRepeatableValues);
        System.out.println("*****************");

        List<Integer> The25MostCommonElements = getTop25(array);
        System.out.println("List of 25 the most common elements: " + The25MostCommonElements);
    }

    private static List<Integer> distinct(int[] array) {

        List<Integer> newIntegerArrayList = new ArrayList<>();

        for (Integer integer: array) {
            if (!newIntegerArrayList.contains(integer)) {
                newIntegerArrayList.add(integer);
            }
        }
        return newIntegerArrayList;

//        Implementacja z hashSet:

    }

    private static List<Integer> distinctWithSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        return new ArrayList<>(set);
    }

    private static void fill(int[] array) {

        Random random = new Random();

        for (int i = 0; i < 100_000; i++) {
            array[i] = random.nextInt(BOUND);
        }
    }

    private static List<Integer> getListOfDuplicates (int[] array) {

        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> alreadySeen = new HashSet<>();
        for (int i : array) {
            if(!alreadySeen.add(i)) {
                duplicates.add(i);
            }
        }

        return new ArrayList<>(duplicates);



//        Set<Integer> newIntegerHashSet = new HashSet<>();
//        Set<Integer> alreadySeen = new HashSet<>();
//
//        for (Integer integer: array) {
//            newIntegerHashSet.add(integer);
//            if (newIntegerHashSet.contains(integer)) {
//                alreadySeen.add(integer);
//            }
//        }
//        return alreadySeen;

//        Implementacja z hashSet:

    }

    private static List<Integer> getTop25 (int[] array) {

        Map<Integer, Integer> mapOfOccurences = new HashMap<>();

        for (int element: array) {
            if (!mapOfOccurences.containsKey(element)) {
                mapOfOccurences.put(element, 1);
            } else {
                Integer counter = mapOfOccurences.get(element);
                mapOfOccurences.put(element, ++counter);
            }
        }
        return mapOfOccurences.entrySet()
                .stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue())) //sorted(Comparator)
                .limit(25)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

//    private static int getOccurrences (int[] array, int element) {
//        int counter = 0;
//
//        for (int i: array) {
//            if (i == element) {
//                counter++;
//            }
//        }
//        return counter;
//    }
}
