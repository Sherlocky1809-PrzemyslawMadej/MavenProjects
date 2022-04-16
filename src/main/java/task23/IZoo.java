package task23;

import java.util.Map;

public interface IZoo {

    int getNumberOfAllAnimals();
    Map <String, Integer> getAnimalCount();
    Map <String, Integer> getAnimalCountSorted();
    void addAnimals(String animal, Integer n);

}
