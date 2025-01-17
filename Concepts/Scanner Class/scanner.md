Sure! The `Scanner` class in Java is a commonly used utility for reading input from the user. It provides methods for parsing various types of input, such as strings, integers, floats, etc. Let me break down the most important methods and explain their behavior, particularly for strings, along with examples.

---

### 1. **`next()`**
   - **Purpose**: Reads a single word (up to the first whitespace).
   - **Behavior**:
     - It reads input until it encounters a space, tab, or newline.
     - If there are multiple words in the input, it only captures the first word.
   - **Use Case**: When you need a single word or token from the input.

   **Example:**
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a word:");
           String word = sc.next(); // Only captures one word
           System.out.println("You entered: " + word);
       }
   }
   ```
   **Input**: `Hello World!`  
   **Output**: `Hello` (It ignores "World!" as `next()` stops at the first space).

---

### 2. **`nextLine()`**
   - **Purpose**: Reads the entire line of input, including spaces.
   - **Behavior**:
     - It reads everything until it encounters a newline character (`\n`).
     - This is ideal for capturing full sentences or lines of text.
   - **Use Case**: When you need an entire line of input, such as a sentence or phrase.

   **Example:**
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a sentence:");
           String sentence = sc.nextLine(); // Captures the entire line
           System.out.println("You entered: " + sentence);
       }
   }
   ```
   **Input**: `Hello World!`  
   **Output**: `Hello World!` (Captures everything on the line).

   **Note**: If you mix `next()` or other methods with `nextLine()`, you might encounter issues due to leftover newline characters in the input buffer. Use `sc.nextLine()` carefully after methods like `sc.nextInt()`.

---

### 3. **`nextInt()`**
   - **Purpose**: Reads an integer from the input.
   - **Behavior**:
     - Parses the next token as an integer.
     - It stops reading after encountering whitespace or a non-integer character.
   - **Use Case**: When you need numeric input.

   **Example:**
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter an integer:");
           int num = sc.nextInt(); // Reads an integer
           System.out.println("You entered: " + num);
       }
   }
   ```
   **Input**: `42`  
   **Output**: `42`

   **Common Issue**: If you press Enter after entering the integer, the newline character (`\n`) remains in the input buffer. This can cause problems if you follow this with a `nextLine()`.

   **Fix**: Clear the buffer using `sc.nextLine()`.

---

### 4. **`nextDouble()`**
   - **Purpose**: Reads a double (floating-point number) from the input.
   - **Behavior**:
     - Parses the next token as a double.
   - **Use Case**: When you need numeric input with decimals.

   **Example:**
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a decimal number:");
           double num = sc.nextDouble(); // Reads a double
           System.out.println("You entered: " + num);
       }
   }
   ```
   **Input**: `3.14`  
   **Output**: `3.14`

---

### 5. **Mixing Inputs**
   A common issue arises when combining `next()` or `nextInt()` with `nextLine()`. The problem occurs because methods like `nextInt()` leave the newline (`\n`) in the buffer, causing `nextLine()` to read an empty line.

   **Example of the Issue:**
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter an integer:");
           int num = sc.nextInt(); // Reads the integer
           System.out.println("Enter a string:");
           String line = sc.nextLine(); // Reads the leftover newline, not the actual input
           System.out.println("You entered: " + line);
       }
   }
   ```
   **Input**:  
   ```
   42
   Hello World!
   ```
   **Output**:  
   ```
   Enter an integer:
   Enter a string:
   You entered: 
   ```

   **Solution**: Use `sc.nextLine()` after `nextInt()` to consume the leftover newline.
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter an integer:");
           int num = sc.nextInt();
           sc.nextLine(); // Consume the newline
           System.out.println("Enter a string:");
           String line = sc.nextLine();
           System.out.println("You entered: " + line);
       }
   }
   ```

---

### 6. **`hasNext()` and `hasNextLine()`**
   - **Purpose**: To check if there is more input to read.
   - **Behavior**:
     - `hasNext()`: Checks if there is another token in the input.
     - `hasNextLine()`: Checks if there is another line in the input.
   - **Use Case**: Useful in loops when processing unknown amounts of input.

   **Example:**
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter multiple words (type 'STOP' to end):");

           while (sc.hasNext()) {
               String word = sc.next();
               if (word.equals("STOP")) break;
               System.out.println("Word: " + word);
           }
       }
   }
   ```

---

### Summary Table

| Method         | Reads                                   | Stops At                        | Use Case                                  |
|----------------|----------------------------------------|---------------------------------|-------------------------------------------|
| `next()`       | Single word/token                      | Whitespace                     | Reading one word                          |
| `nextLine()`   | Entire line                            | Newline (`\n`)                 | Reading a full sentence or line          |
| `nextInt()`    | Integer                                | Whitespace/non-integer         | Reading integers                          |
| `nextDouble()` | Floating-point number                  | Whitespace/non-numeric         | Reading decimal numbers                   |
| `hasNext()`    | Checks for next token                 | -                               | Looping through tokens in unknown input   |
| `hasNextLine()`| Checks for next line                  | -                               | Looping through lines                     |

---

