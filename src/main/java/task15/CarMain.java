package task15;

public class CarMain {

    public static void main(String[] args) {

        boolean BMWisPremium = Car.BMW.isPremium();
        System.out.println("Is BMW premium: " + BMWisPremium);

        boolean PorscheIsPremium = Car.PORSCHE.isPremium();
        System.out.println("Is Porsche premium: " + PorscheIsPremium);

        boolean isPorscheFasterThanBMW = Car.PORSCHE.isFasterThan(Car.BMW);
        System.out.println("Is Porsche faster than BMW: " + isPorscheFasterThanBMW);

        boolean isTOpelFasterThanToyota = Car.OPEL.isFasterThan(Car.TOYOTA);
        System.out.println("Is Opel faster than Toyota: " + isTOpelFasterThanToyota);

        boolean isMercedesFasterThanFerrari = Car.MERCEDES.isFasterThan(Car.FERRARI);
        System.out.println(isMercedesFasterThanFerrari);
    }
}
