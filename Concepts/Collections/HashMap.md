The `HashMap` in Java is a widely used data structure that stores key-value pairs. It is part of the `java.util` package and provides efficient retrieval, insertion, and deletion operations based on hashing.

---

### General Syntax for HashMap in Java

1. **Import the HashMap Class**
   To use a `HashMap`, import it from the `java.util` package:

   ```java
   import java.util.HashMap;
   ```

2. **Declare and Initialize a HashMap**
   Use the following syntax to create a `HashMap`:

   ```java
   HashMap<KeyType, ValueType> mapName = new HashMap<>();
   ```

   - `KeyType`: The type of keys (e.g., `String`, `Integer`, `CustomClass`, etc.).
   - `ValueType`: The type of values.
   - `mapName`: The variable name for your `HashMap`.

3. **Add Key-Value Pairs**
   Use the `put()` method to add key-value pairs to the `HashMap`:

   ```java
   mapName.put(key, value);
   ```

4. **Access a Value**
   Retrieve a value by its key using the `get()` method:

   ```java
   ValueType value = mapName.get(key);
   ```

5. **Check for a Key or Value**

   - Check if a key exists:
     ```java
     boolean hasKey = mapName.containsKey(key);
     ```
   - Check if a value exists:
     ```java
     boolean hasValue = mapName.containsValue(value);
     ```

6. **Remove a Key-Value Pair**
   Use the `remove()` method to delete a key (and its associated value):

   ```java
   mapName.remove(key);
   ```

7. **Get the Size of the HashMap**
   Find out how many key-value pairs are in the `HashMap`:

   ```java
   int size = mapName.size();
   ```

8. **Iterate Over the HashMap**
   You can iterate through the keys, values, or entries:

   - **Keys**:
     ```java
     for (KeyType key : mapName.keySet()) {
         // Process each key
     }
     ```
   - **Values**:
     ```java
     for (ValueType value : mapName.values()) {
         // Process each value
     }
     ```
   - **Entries**:
     ```java
     for (Map.Entry<KeyType, ValueType> entry : mapName.entrySet()) {
         // Process each key-value pair
         KeyType key = entry.getKey();
         ValueType value = entry.getValue();
     }
     ```

9. **Clear the HashMap**
   Remove all key-value pairs:
   ```java
   mapName.clear();
   ```

---

### Example Code:

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Access a value
        int ageOfAlice = map.get("Alice"); // Retrieves the value 30

        // Check if a key or value exists
        boolean hasBob = map.containsKey("Bob");         // true
        boolean hasAge40 = map.containsValue(40);        // false

        // Remove a key-value pair
        map.remove("Charlie");

        // Check the size of the HashMap
        int size = map.size(); // 2 (Alice and Bob are left)

        // Iterate over keys
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterate over values
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        // Iterate over key-value pairs
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear the HashMap
        map.clear();
        System.out.println("Map size after clear: " + map.size()); // 0
    }
}
```

---

### Key Points:

- **HashMap Characteristics**:

  - Stores key-value pairs (`key -> value`).
  - **Keys must be unique**; values can be duplicated.
  - Allows one `null` key and multiple `null` values.
  - **Unordered**: No guaranteed order of keys or values.

- **Performance**:

  - Average time complexity for `get()`, `put()`, and `remove()` is O(1).
  - Time complexity can degrade to O(n) in rare cases of hash collisions.

- **Common Methods**:
  - `put(key, value)`: Adds or updates a key-value pair.
  - `get(key)`: Retrieves the value associated with the key.
  - `remove(key)`: Removes a key-value pair by its key.
  - `containsKey(key)`: Checks if the key exists.
  - `containsValue(value)`: Checks if the value exists.
  - `keySet()`, `values()`, `entrySet()`: Useful for iteration.
