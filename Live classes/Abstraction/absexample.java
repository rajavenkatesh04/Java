abstract class absexample {
    int a = 10;
    int b = 20;

    public void show() {
        System.out.println("Welcome");
    }

    abstract public void add();
}

class child extends absexample {
    public void add() {
        System.out.println(a + b);
    }
}

class Sample1 {
    public static void main(String[] args) {
        child c = new child();
        c.add();
        c.show();
        System.out.println(c.a);
        System.out.println(c.b);
    }
}

// based on student info system, define instance variables, implement method,
// overloading, implement abstract class & methods