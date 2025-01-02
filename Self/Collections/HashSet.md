The general syntax for using a **HashSet** in Java involves the following steps:

### 1. **Import the HashSet Class**

To use a `HashSet`, you must import it from the `java.util` package:

```java
import java.util.HashSet;
import java.util.Set;
```

### 2. **Declare and Initialize the HashSet**

A `HashSet` can be declared and initialized using the following syntax:

```java
Set<Type> setName = new HashSet<>();
```

- `Type`: The type of elements the `HashSet` will store (e.g., `String`, `Integer`, `CustomClass`, etc.).
- `setName`: The variable name for your `HashSet`.

### 3. **Add Elements to the HashSet**

Use the `add()` method to insert elements into the `HashSet`:

```java
setName.add(element);
```

### 4. **Remove Elements from the HashSet**

Use the `remove()` method to delete elements:

```java
setName.remove(element);
```

### 5. **Check if an Element Exists**

Use the `contains()` method to check if an element is in the `HashSet`:

```java
boolean exists = setName.contains(element);
```

### 6. **Get the Size of the HashSet**

Use the `size()` method to find out how many elements are in the `HashSet`:

```java
int size = setName.size();
```

### 7. **Iterate Over the HashSet**

You can iterate through the elements in the `HashSet` using a loop:

```java
for (Type element : setName) {
    // Process each element
}
```

---

### Example Code:

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Try to add a duplicate
        fruits.add("Apple"); // This will be ignored

        // Remove an element
        fruits.remove("Banana");

        // Check if an element exists
        boolean hasOrange = fruits.contains("Orange");

        // Get the size of the HashSet
        int size = fruits.size();

        // Print elements using a loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Output size and existence check
        System.out.println("Size: " + size);
        System.out.println("Contains Orange? " + hasOrange);
    }
}
```

### Key Points:

- **HashSet does not allow duplicate elements.**
- The order of elements is **not guaranteed** (unlike a `List`).
- HashSet provides **constant time performance (O(1))** for basic operations like add, remove, and contains.
