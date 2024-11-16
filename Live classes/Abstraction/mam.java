import java.util.*;

interface add {
    int a = 10;
    int b = 20;
    static int d = 90;

    void add();

    static void show() {
        System.out.println("Hello");
    }
}

interface sub {
    int c = 34;
    int f = 24;

    void sub();
}

class intexample implements add, sub {
    public void add() {

        System.out.println(a + b);
    }

    public void sub() {

        System.out.println(c - f);
    }
}

class Sample1 {

public static void main(String[] args) {
	     
		 intexample e = new intexample();
		 e.add();
		 e.sub();