package task19;



public class LaptopMain {

    public static void main(String[] args) {

        Laptop dell = new Laptop("Intel Core i5", 16,
                "Intel Iris Xe Graphics", "Dell", "Inspiron 5310", "Słaba");

        Laptop lenovo = new Laptop("Intel Core i7", 16,
                "Intel Iris Plus Grpahics", "Lenovo", "IdeaPad 5", "średnia");

        Laptop hp = new Laptop("Intel Core i5", 8,
                "Intel Iris Xe Graphics", "HP", "HP 15", "zajebista");

        Laptop lenovo1 = lenovo;

        Laptop lenovo2 = new Laptop("Intel Core i7", 16,
                "Intel Iris Plus Grpahics", "Lenovo", "IdeaPad 5", "średnia");

        String battery = dell.getBattery();
        System.out.println(battery);

        String company = dell.getCompany();
        System.out.println(company);

        System.out.println(lenovo);
        System.out.println(lenovo.equals(lenovo1));
        System.out.println(lenovo.equals(lenovo2));


    }
}
