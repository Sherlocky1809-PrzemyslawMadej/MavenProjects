package task32;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ListToMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person1 = new Person();
        person1.setAge(22);
        person1.setHeight(190);
        person1.setName("Przemek");

        Person person2 = new Person();
        person2.setAge(32);
        person2.setHeight(180);
        person2.setName("Jan");

        List<Person> people = List.of(person1,person2);


        try (FileOutputStream fileOutputStream = new FileOutputStream("people.obj")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(people);
            objectOutputStream.flush();
        }

        try (FileInputStream fileInputStream = new FileInputStream("people.obj")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Person> deserialized = (List<Person>) objectInputStream.readObject();

            System.out.println(deserialized);
        }

    }
}
