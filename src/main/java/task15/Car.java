package task15;

import java.util.Comparator;

public enum Car {

    FERRARI (500_000, 400, 300, false),
    PORSCHE (400_000, 350, 280, false),
    MERCEDES (200_000, 220, 260, false),
    BMW (80_000, 200, 240, true),
    OPEL (65_000, 160, 220, true),
    FIAT (40_000, 120, 200, true),
    TOYOTA (30_000, 90, 180, true);

    private final int price;
    private final int power;
    private final int maxSpeed;
    private final boolean isRegular;

    Car(int price, int power, int maxSpeed, boolean isRegular) {
        this.price = price;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.isRegular = isRegular;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public boolean isPremium() {
        return !isRegular;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isFasterThan(Car car) {
        return this.getMaxSpeed() > car.getMaxSpeed();
    }

}
