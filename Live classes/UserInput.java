import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        long age = sc.nextLong();
        double salary = sc.nextDouble();

        System.out.println("Hi " + name + "Your salary is : " + salary + "you're " + age + "years old.");

    }
}

// static keyword and static method
// Instance keyword and instance method (-_-)!