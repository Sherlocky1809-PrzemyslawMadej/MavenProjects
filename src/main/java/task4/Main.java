package task4;

public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addToStorage("k1", "v1");
        storage.addToStorage("k1", "v2");
        storage.addToStorage("k1", "v3");
        storage.addToStorage("k2", "v1");
        storage.addToStorage("k3", "v1");
        storage.addToStorage("k3", "v2");

        storage.printValues("k1");
        storage.printValues("k2");
        storage.printValues("k3");

        System.out.println("Find keys: ");
        System.out.println(storage.findKeysByValue("v2"));

        System.out.println("Find keys by Stream: ");
        System.out.println(storage.findKeysByValueStream("v2"));
    }
}
