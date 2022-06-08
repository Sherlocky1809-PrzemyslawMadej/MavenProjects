package task27;

public class MainJoiner {

    public static void main(String[] args) {

        Joiner<Integer> joiner = new Joiner<>("-");
        joiner.join(1,2,3,4,5);
        System.out.println("***************");
        String withToString = joiner.joinWithToString(1, 2, 3, 4, 5);
        System.out.println(withToString);

    }
}
