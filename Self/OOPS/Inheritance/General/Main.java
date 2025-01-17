class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks woof woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.sound(); // Inherited from Animal
        myDog.bark();

    }
}