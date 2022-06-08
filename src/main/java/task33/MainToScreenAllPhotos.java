package task33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class MainToScreenAllPhotos {

    public static void main(String[] args) throws IOException {

        Path workingDirectory = Paths.get("src", "main", "resources", "task33");
        try(Stream<Path> walk = Files.walk(workingDirectory)) {
            walk
                    .filter(path -> path.toString().endsWith(".jpg") || path.toString().endsWith(".png"))
            .forEach(System.out::println);
        }


        //Files.walkFileTree(workingDirectory, new SimpleFileVisitor<>());
    }
}
