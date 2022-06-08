package task18;

public class ComputerMain {

    public static void main(String[] args) {

        Computer dell = new Computer("Intel Core i5", 16,
                "Intel Iris Xe Graphics", "Dell", "Inspiron 5310");

        Computer lenovo = new Computer("Intel Core i7", 16,
                "Intel Iris Plus Grpahics", "Lenovo", "IdeaPad 5");

        Computer hp = new Computer("Intel Core i5", 8,
                "Intel Iris Xe Graphics", "HP", "HP 15");


        System.out.println(dell);
        System.out.println(lenovo);
        System.out.println(hp);

        System.out.println(dell.getCompany());
        System.out.println(lenovo.getProcessor());

        System.out.println(dell.equals(lenovo));

        System.out.println(hp.getGraphicCard());

    }
}
