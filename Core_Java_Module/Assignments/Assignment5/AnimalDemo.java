class Animal {

    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {

    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void displayDog() {
        displayAnimal();
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal {

    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    void displayCat() {
        displayAnimal();
        System.out.println("Color: " + color);
    }
}

public class AnimalDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Bruno", 3, "Labrador");
        Cat cat = new Cat("Kitty", 2, "Persian");

        System.out.println("----- Dog -----");
        dog.displayDog();

        System.out.println("\n----- Cat -----");
        cat.displayCat();
    }
}