In addition to basic string and numeric inputs, Java has other common input types and approaches for handling various types of data. Below is a categorized list of commonly used input types and methods, along with examples and use cases.

---

## **1. Primitive Data Types**
These are the most commonly used input types for basic programs.

### a. **Integer (`int`)**
- **Purpose**: To read whole numbers.
- **Method**: `nextInt()`

```java
int number = scanner.nextInt();
```

---

### b. **Floating-point Numbers (`float`, `double`)**
- **Purpose**: To read numbers with decimals.
- **Methods**: 
  - `nextFloat()` (for `float`)
  - `nextDouble()` (for `double`)

```java
double price = scanner.nextDouble();
```

---

### c. **Boolean (`boolean`)**
- **Purpose**: To read `true` or `false` values.
- **Method**: `nextBoolean()`

```java
boolean isActive = scanner.nextBoolean();
```

**Input Examples**:
- For `true`: `true`, `TRUE`, `True`
- For `false`: `false`, `FALSE`, `False`

---

### d. **Character (`char`)**
- **Purpose**: To read a single character.
- **Method**: Java doesn't have a direct `Scanner` method for reading a `char`, but it can be achieved by using `next()` and extracting the first character.

```java
char initial = scanner.next().charAt(0);
```

---

## **2. Strings and Lines**
### a. **Single Word (`String`)**
- **Purpose**: To read a single word or token.
- **Method**: `next()`

### b. **Full Line (`String`)**
- **Purpose**: To read an entire line.
- **Method**: `nextLine()`

---

## **3. Arrays and Lists**
Sometimes, programs require multiple inputs at once.

### a. **Array of Integers**
- **Purpose**: To read multiple integers.
- **Implementation**: Use a loop to populate an array.

```java
int[] arr = new int[5];
System.out.println("Enter 5 integers:");
for (int i = 0; i < arr.length; i++) {
    arr[i] = scanner.nextInt();
}
```

---

### b. **Array of Strings**
- **Purpose**: To read multiple words or strings.
- **Implementation**: Use a loop.

```java
String[] names = new String[3];
System.out.println("Enter 3 names:");
for (int i = 0; i < names.length; i++) {
    names[i] = scanner.nextLine();
}
```

---

### c. **Dynamic Input with Lists**
- **Purpose**: Use `ArrayList` for flexible input size.
- **Implementation**:

```java
import java.util.ArrayList;
import java.util.Scanner;

ArrayList<Integer> numbers = new ArrayList<>();
System.out.println("Enter numbers (type -1 to stop):");

while (true) {
    int num = scanner.nextInt();
    if (num == -1) break;
    numbers.add(num);
}
```

---

## **4. File Input**
- **Purpose**: To read data from a file.
- **Implementation**: Use `Scanner` with `File`.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputExample {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner fileScanner = new Scanner(file);
        
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
        
        fileScanner.close();
    }
}
```

---

## **5. Big Numbers**
For very large integers or floating-point numbers that exceed the range of `int`, `long`, or `double`.

### a. **BigInteger**
- **Purpose**: To handle arbitrarily large integers.
- **Library**: `java.math.BigInteger`

```java
import java.math.BigInteger;
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
BigInteger bigNumber = sc.nextBigInteger();
```

### b. **BigDecimal**
- **Purpose**: To handle high-precision decimal numbers.
- **Library**: `java.math.BigDecimal`

```java
import java.math.BigDecimal;
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
BigDecimal bigDecimal = sc.nextBigDecimal();
```

---

## **6. Date and Time**
### a. **`LocalDate`, `LocalTime`, `LocalDateTime`**
- **Purpose**: To handle date and time input.
- **Library**: `java.time.*`

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.println("Enter a date (yyyy-MM-dd):");
String dateInput = sc.next();
LocalDate date = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
System.out.println("Parsed date: " + date);
```

---

## **7. Mixed Input Handling**
For scenarios where different types of inputs are expected together, handle them in sequence.

```java
Scanner sc = new Scanner(System.in);

System.out.println("Enter your age:");
int age = sc.nextInt();

sc.nextLine(); // Consume leftover newline

System.out.println("Enter your name:");
String name = sc.nextLine();

System.out.println("Age: " + age + ", Name: " + name);
```

---

## **8. Delimiters**
By default, `Scanner` splits input using whitespace. You can customize the delimiter if necessary.

```java
scanner.useDelimiter(",");
System.out.println("Enter numbers separated by commas:");
while (scanner.hasNextInt()) {
    System.out.println(scanner.nextInt());
}
```

---

## **Common Input Types and Methods Table**

| **Input Type**     | **Method**         | **Example**                     |
|---------------------|--------------------|----------------------------------|
| Integer             | `nextInt()`       | `42`                            |
| Float               | `nextFloat()`     | `3.14`                          |
| Double              | `nextDouble()`    | `3.14159`                       |
| Boolean             | `nextBoolean()`   | `true`, `false`                 |
| Character           | `next().charAt(0)`| `'a'`                           |
| Single Word String  | `next()`          | `Hello`                         |
| Full Line String    | `nextLine()`      | `Hello World!`                  |
| Big Integer         | `nextBigInteger()`| `12345678901234567890`          |
| Big Decimal         | `nextBigDecimal()`| `1234567890.1234567890`         |
| File Input          | `Scanner(File)`   | Input from a file               |

---
