class Parent {
    void display() {
        System.out.println("This is from the parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is from the child");
    }

    void childSpecific() {
        System.out.println("Child Specific method has been called");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();

        if (p instanceof Child) {
            ((Child) p).childSpecific(); // Downcasting and method call in one line
        }

    }
}