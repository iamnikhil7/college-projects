/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

class PersonPersistence {
    private static final String FILE_PATH = "persons.dat";

    public static void savePersons(List<Person> persons) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(persons);
            System.out.println("Persons saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> loadPersons() {
        List<Person> persons = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            persons = (List<Person>) ois.readObject();
            System.out.println("Persons loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }
}

public class Lab61 {
    public static void main(String[]  args) {
        List<Person> persons = List.of(new Person("Alice", 25), new Person("Bob", 30));

        PersonPersistence.savePersons(new ArrayList<>(persons));
        List<Person> loadedPersons = PersonPersistence.loadPersons();

        System.out.println("Loaded Persons: " + loadedPersons);
    }
}
