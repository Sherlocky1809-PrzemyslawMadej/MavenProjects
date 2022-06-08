package task28;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        NewArrayList newArrayList = new NewArrayList();

        newArrayList.add('a');
        newArrayList.add('b');
        newArrayList.add('c');
        newArrayList.add('d');
        newArrayList.add('e');
        newArrayList.add('f');
        newArrayList.add('g');
        System.out.println(newArrayList);

        List<Character> characters = newArrayList.getEveryNthElement(2, 3);
        System.out.println(characters);

    }
}
