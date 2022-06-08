package task24;

public class Basket {

    private int numberOfElements;

    public Basket(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public void addToBasket() throws Exception {
        if (numberOfElements < 10 && numberOfElements >= 0) {
            numberOfElements++;
        }
    }

    public void removeFromBasket() throws Exception {
        if (numberOfElements <= 10 && numberOfElements > 0) {
            numberOfElements--;
        }
    }
}
