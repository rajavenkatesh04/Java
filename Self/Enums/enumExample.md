Sure! Here's a complete **working program** that incorporates enums using the same `Condition` example. This program will demonstrate how to define an enum, initialize values using a constructor, and use the enum in a real-world scenario.

---

### **Program Description**

- We create an `enum Condition` with constants: `HOT`, `WARM`, and `COLD`, each associated with a caution message.
- The main program displays each condition and its caution message using the `getCaution()` method.
- A user can input a condition name (e.g., `HOT`), and the program will display the corresponding message.

---

### **Full Working Program**

```java
import java.util.Scanner;

public class EnumExample {

    // Define the enum Condition
    public enum Condition {
        HOT("Warning HOT!"),      // Enum constant with a message
        WARM("Just right"),       // Enum constant with a message
        COLD("Warning COLD!");    // Enum constant with a message

        private String caution;   // Instance variable to store the caution message

        // Enum constructor to initialize the caution message
        private Condition(String caution) {
            this.caution = caution;
        }

        // Method to retrieve the caution message
        public String getCaution() {
            return caution;
        }
    }

    public static void main(String[] args) {
        // Display all enum constants with their caution messages
        System.out.println("Available Conditions and their Messages:");
        for (Condition condition : Condition.values()) {
            System.out.println(condition + ": " + condition.getCaution());
        }

        // Allow the user to input a condition name
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a condition (HOT, WARM, COLD): ");
        String userInput = scanner.next().toUpperCase(); // Convert input to uppercase

        try {
            // Get the enum constant from user input
            Condition selectedCondition = Condition.valueOf(userInput);
            // Display the caution message for the selected condition
            System.out.println("You selected: " + selectedCondition);
            System.out.println("Message: " + selectedCondition.getCaution());
        } catch (IllegalArgumentException e) {
            // Handle invalid user input
            System.out.println("Invalid condition! Please enter HOT, WARM, or COLD.");
        }

        // Close the scanner
        scanner.close();
    }
}
```

---

### **How It Works**

1. **Define the `Condition` Enum**:

   - Each constant (`HOT`, `WARM`, `COLD`) is initialized with a caution message.
   - A constructor assigns the message to the `caution` variable.

2. **Use the Enum in `main()`**:

   - Display all available enum constants and their messages using a loop.
   - Accept user input for a condition name (e.g., `HOT` or `COLD`).
   - Use `Condition.valueOf()` to match user input to an enum constant.
   - Display the caution message for the selected constant.

3. **Handle Errors**:
   - If the user enters an invalid condition (e.g., `WET`), the program catches the exception and displays an error message.

---

### **Sample Output**

#### **Case 1: Display All Conditions**

```
Available Conditions and their Messages:
HOT: Warning HOT!
WARM: Just right
COLD: Warning COLD!

Enter a condition (HOT, WARM, COLD):
WARM
You selected: WARM
Message: Just right
```

#### **Case 2: Invalid Input**

```
Available Conditions and their Messages:
HOT: Warning HOT!
WARM: Just right
COLD: Warning COLD!

Enter a condition (HOT, WARM, COLD):
WET
Invalid condition! Please enter HOT, WARM, or COLD.
```

---

### **Key Takeaways**

- Enums can store data using **instance variables** and can initialize them using a **constructor**.
- Use **methods** like `getCaution()` to access values stored in enums.
- Use `Condition.valueOf()` to convert user input into an enum constant safely.

Run the program, experiment with the inputs, and let me know if you need further clarification! 😊
