package task7;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyJacket implements IBullet {

    private final Deque<String> stack = new ArrayDeque<>();
    private final int maxBullets;

    public MyJacket() {
        this(10);
    }

    public MyJacket(int maxBullets) {
        this.maxBullets = maxBullets;
    }


    @Override
    public void loadBullet(String bullet) {
        if (stack.size() >= maxBullets) {
            throw new RuntimeException("Jacket is overloaded");
        } else {
//            stack.add(bullet); kolejka typu FIFO
            stack.push(bullet); // kolejka typu FILO
        }
    }

    @Override
    public boolean isLoaded() {
        return !stack.isEmpty();
    }

    @Override
    public String shot() {
        if (isLoaded()) {
            return stack.pop();
        } else {
            return IBullet.EMPTY;
        }
    }
}
