package task29;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GenerykPart<T> {

    public double partOf(Collection<T> collection, Predicate<T> predicate) {

        final long counter = collection.stream()
                .filter(predicate)
                .count();

        return counter * 100 / collection.size();
    }
}
