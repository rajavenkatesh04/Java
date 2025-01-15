The `Deque` (short for **Double-Ended Queue**) in Java is an interface in the `java.util` package that allows you to add and remove elements from both ends of the queue. It is implemented by classes such as `ArrayDeque` and `LinkedList`.

---

### General Syntax for Deque in Java

1. **Import the Deque Interface**
   To use a `Deque`, import it from the `java.util` package:

   ```java
   import java.util.Deque;
   import java.util.ArrayDeque;  // or LinkedList
   ```

2. **Declare and Initialize a Deque**
   Use one of its implementations, such as `ArrayDeque` or `LinkedList`:

   ```java
   Deque<Type> dequeName = new ArrayDeque<>();
   ```

   - `Type`: The type of elements the `Deque` will store (e.g., `String`, `Integer`, `CustomClass`, etc.).
   - `dequeName`: The variable name for your `Deque`.

3. **Add Elements to the Deque**

   - Add elements at the front:
     ```java
     dequeName.addFirst(element);
     ```
   - Add elements at the end:
     ```java
     dequeName.addLast(element);
     ```
     Alternatively, you can use:
   - `dequeName.offerFirst(element);` // Returns `true` or `false`
   - `dequeName.offerLast(element);` // Returns `true` or `false`

4. **Remove Elements from the Deque**

   - Remove elements from the front:
     ```java
     dequeName.removeFirst();
     ```
   - Remove elements from the end:
     ```java
     dequeName.removeLast();
     ```
     Alternatively, you can use:
   - `dequeName.pollFirst();` // Returns the removed element or `null` if empty
   - `dequeName.pollLast();` // Returns the removed element or `null` if empty

5. **Access Elements in the Deque**

   - Access the first element:
     ```java
     Type firstElement = dequeName.getFirst();
     ```
   - Access the last element:
     ```java
     Type lastElement = dequeName.getLast();
     ```
     Alternatively, you can use:
   - `dequeName.peekFirst();` // Returns the first element or `null` if empty
   - `dequeName.peekLast();` // Returns the last element or `null` if empty

6. **Check if Deque is Empty**

   ```java
   boolean isEmpty = dequeName.isEmpty();
   ```

7. **Get the Size of the Deque**

   ```java
   int size = dequeName.size();
   ```

8. **Iterate Over the Deque**
   Use a `for-each` loop or an iterator:
   ```java
   for (Type element : dequeName) {
       // Process each element
   }
   ```

---

### Example Code:

```java
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // Create a Deque of Integers
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements at both ends
        deque.addFirst(10); // Adds 10 at the front
        deque.addLast(20);  // Adds 20 at the end
        deque.addLast(30);  // Adds 30 at the end

        // Access elements
        int first = deque.getFirst(); // Retrieves the first element (10)
        int last = deque.getLast();   // Retrieves the last element (30)

        // Remove elements
        deque.removeFirst(); // Removes 10 from the front
        deque.removeLast();  // Removes 30 from the end

        // Check if the deque contains a specific element
        boolean has20 = deque.contains(20); // true

        // Check size and if empty
        int size = deque.size();       // 1
        boolean isEmpty = deque.isEmpty(); // false

        // Iterate through the deque
        for (int num : deque) {
            System.out.println(num); // Prints remaining elements (20)
        }

        // Output results
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        System.out.println("Contains 20? " + has20);
        System.out.println("Size: " + size);
        System.out.println("Is empty? " + isEmpty);
    }
}
```

---

### Key Points:

- A `Deque` can act as both a **queue** (FIFO) and a **stack** (LIFO).
- **Double-ended**: You can add or remove elements from both ends.
- The `Deque` interface is implemented by classes like `ArrayDeque` (efficient for most use cases) and `LinkedList` (useful for frequent insertions/removals).
- Common methods include:
  - `addFirst()`, `addLast()`, `removeFirst()`, `removeLast()`, `getFirst()`, `getLast()`.
  - Variants like `offerFirst()`, `offerLast()`, `pollFirst()`, and `pollLast()` are safer (return `null` if the deque is empty).
