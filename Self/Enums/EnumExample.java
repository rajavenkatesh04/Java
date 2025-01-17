import java.util.Scanner;

public class EnumExample {
    // Define the Enum Condition
    public enum Condition {
        HOT("Warning Hot!"), // Enum constant with a message
        WARM("Just right !"), // Enum constant with a message
        COLD("Warning Cold!"); // Enum constant with a message

        // Instance variable to store caution message
        private String caution;

        // Enum constructor to initialise the caution message
        private Condition(String caution) {
            this.caution = caution;
        }

        // Method to retrieve the caution message
        public String getCaution() {
            return caution;
        }
    }

    public static void main(String[] args) {

        // Display all enums constants with their caution messages
        System.out.println("Available conditions with their messages: ");
        for (Condition condition : Condition.values()) {
            System.out.println(condition + ": " + condition.getCaution());
        }

        // Allow the user to input a condition name
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a new condition [HOT, WARM, COLD] : ");
        String userInput = sc.next().toUpperCase();

        try {
            // Get user Input
            Condition selectedCondition = Condition.valueOf(userInput);
            System.out.println("You selected " + "[ " + selectedCondition + " ]");
            System.out.println("Message:  " + selectedCondition.getCaution());
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal condition please choose from [HOT, WARM, COLD]");
        }

        sc.close();

    }
}