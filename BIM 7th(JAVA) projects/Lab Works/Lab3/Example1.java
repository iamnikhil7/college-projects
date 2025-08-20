
package Lab3;


class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal barks");
    }
}

class Dog extends Animal {

    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void makeSound(String sound) {
        System.out.println("Dog makes a " + sound + " sound");
    }
}

final class Husky extends Dog {

    Husky(String name) {
        super(name, "Husky");
    }

    @Override
    final void makeSound() {
        System.out.println("Husky barks loudly");
    }
}

public class Example1 {

    public static void main(String[] args) {
        Animal animal = new Animal("Overall Animal");
        animal.makeSound();

        Dog dog = new Dog("Bella", "Japenese Spitz");
        dog.makeSound();
        dog.makeSound("growl");

        Husky husky = new Husky("Max");
        husky.makeSound();

        Animal huskyAsAnimal = husky;
        huskyAsAnimal.makeSound();
    }
}
