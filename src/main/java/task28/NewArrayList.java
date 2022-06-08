package task28;

import java.util.ArrayList;
import java.util.List;

public class NewArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int startIndex, int skip) {

        List<E> newCharList = new ArrayList<>();

        for (int i = 0; i < size(); i += skip + 1) {
            newCharList.add(get(i));
        }
        return newCharList;
    }
}
