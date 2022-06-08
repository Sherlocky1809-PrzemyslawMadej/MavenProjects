package task27;

public class Joiner<T> {

    private String separator;
    private T element;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String getSeparator() {
        return separator;
    }

    public T getElement() {
        return element;
    }

    public void join(T... elements) {
        for (int i = 0; i < elements.length; i++) {
            if (i < elements.length - 1) {
                System.out.print(elements[i] + separator);
            } else {
                System.out.println(elements[i]);
            }
        }
    }

        public String joinWithToString(T... elements) {

        StringBuilder builder = new StringBuilder();

            for (int i = 0; i < elements.length; i++) {
                if (i < elements.length - 1) {
                    builder.append(elements[i]).append(separator);
                } else {
                    builder.append(elements[i]);
                }
            }
            return builder.toString();
        }

    @Override
    public String toString() {
        return element + separator;
    }
}
