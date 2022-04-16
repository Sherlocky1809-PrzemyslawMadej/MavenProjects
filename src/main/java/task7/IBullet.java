package task7;

public interface IBullet {

    String EMPTY = "Pusty magazynek";

    void loadBullet(String bullet);
    boolean isLoaded();
    String shot();

}
