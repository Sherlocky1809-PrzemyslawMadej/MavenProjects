package task23;

import java.util.Map;

public class MainAnimals {

    public static void main(String[] args) {

        IZoo zoo = new Zoo();

        zoo.addAnimals("Malpa", 4);
        zoo.addAnimals("Zebra", 2);
        zoo.addAnimals("Tygrys", 7);
        zoo.addAnimals("Baran", 9);
        Map<String, Integer> animalCount = zoo.getAnimalCount();
        System.out.println(animalCount);
        int allAnimals = zoo.getNumberOfAllAnimals();
        System.out.println(allAnimals);
        System.out.println("******************");
        System.out.println(zoo.getAnimalCountSorted());
    }
}
