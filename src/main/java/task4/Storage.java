package task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {

    private final Map<String, List<String>> stringStringMap = new HashMap<>();


    public void addToStorage(String key, String value) {
// If map does not contain the key then create and put new list, add value to list
        if (!stringStringMap.containsKey(key)) {
            List<String> values = new ArrayList<>();
            values.add(value);
            stringStringMap.put(key, values);
        } else {
//        else if the map contains the key then get existing list and append another value
            List<String> values = stringStringMap.get(key);
            values.add(value);
        }
    }

    public void printValues(String key) {

        List<String> strings = stringStringMap.get(key);
        System.out.println(strings);
    }

    public List<String> findKeysByValue (String value) {

        List<String> listOfKeys = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : stringStringMap.entrySet()) {
            if (entry.getValue().contains(value)) {
                listOfKeys.add(entry.getKey());
            }
        }
        return listOfKeys;
    }

    public List<String> findKeysByValueStream (String value) {
        List<String> listKeys = stringStringMap.entrySet().stream()
                .filter(entry -> entry.getValue().contains(value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return listKeys;
    }
}
