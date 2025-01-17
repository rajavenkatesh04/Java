class Parent {
    void display() {
        System.out.println("This is the Parent method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the Child method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();

        obj.display();
    }
}