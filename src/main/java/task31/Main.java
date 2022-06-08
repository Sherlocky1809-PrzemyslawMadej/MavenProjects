package task31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        Path workingDirectory = Paths.get("src", "main", "resources", "task31");
        String sourceFileName = "zadania.txt";

        Path pathToFile = workingDirectory.resolve(sourceFileName);

        Map<String, Integer> wordsOccurences = new TreeMap<>();

        for (String line: Files.readAllLines(pathToFile)) {
            for (String word:
                 line.split("\\s+")) {
                Integer count = wordsOccurences.get(word);
                if (count != null) {
                    count++;
                } else {
                    count = 1;
                }
                wordsOccurences.put(word, count);
            }
            wordsOccurences.forEach((key,value) -> System.out.println(key + " - " + value));
        }

        Files.writeString(workingDirectory.resolve("counters"), wordsOccurences.toString());
    }

}
