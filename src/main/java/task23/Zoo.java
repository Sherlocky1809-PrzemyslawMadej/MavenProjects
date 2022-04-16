package task23;

import java.util.*;
import java.util.stream.Collectors;

public class Zoo implements IZoo {

   private Map<String, Integer> animalsCounter = new HashMap<>();

    @Override
    public int getNumberOfAllAnimals() {

        int counter = 0;

        for (Map.Entry<String, Integer> entry : animalsCounter.entrySet()) {
            counter = counter + entry.getValue();
        }
        return counter;
    }

    @Override
    public Map<String, Integer> getAnimalCount() {
        return new HashMap<>(animalsCounter);
    }

    @Override
    public Map<String, Integer> getAnimalCountSorted() {

        List<Map.Entry<String, Integer>> mapList = new LinkedList<>(animalsCounter.entrySet());

        Collections.sort(mapList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Map<String, Integer> sortedAnimalCounter = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : mapList) {
            sortedAnimalCounter.put(entry.getKey(), entry.getValue());
        }
        return sortedAnimalCounter;
    }

    @Override
    public void addAnimals(String animal, Integer n) {

        List<String> animals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            animals.add(animal);
        }
        animalsCounter.put(animal, animals.size());
    }



    @Override
    public String toString() {
        return " Zoo { " +
                " animalsCounter = " + animalsCounter +
                " }";
    }
}
