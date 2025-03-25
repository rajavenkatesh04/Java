### **📌 Notes on Number Extraction in Java**  

#### **1️⃣ Extracting Digits from a Number**
To extract digits from a number, we **repeatedly** take the last digit and remove it from the number.

#### **🔹 Steps to Extract Digits**
1. **Get the last digit:** `last_digit = n % 10`
2. **Remove the last digit:** `n = n / 10`
3. **Repeat** until `n` becomes `0`

🔹 **Example: Extracting digits from `n = 1234`**  
```java
int n = 1234;

while (n > 0) {
    int last_digit = n % 10;  // Get last digit
    System.out.println(last_digit);
    n = n / 10;  // Remove last digit
}
```
💡 **Output:**  
```
4
3
2
1
```
(Extracted in **reverse order**, since we process digits from right to left)

---

#### **2️⃣ Reversing a Number**
If we need digits in the correct order, we can **reverse** the number while extracting.

```java
int n = 1234;
int reversed = 0;

while (n > 0) {
    int last_digit = n % 10;
    reversed = reversed * 10 + last_digit;  // Append digit to reversed number
    n = n / 10;
}

System.out.println(reversed);  // Output: 4321
```
---

#### **3️⃣ Checking if a Number Contains a Specific Digit**
**Example:** Check if `5` is in `n = 12753`
```java
int n = 12753;
boolean found = false;

while (n > 0) {
    int last_digit = n % 10;
    if (last_digit == 5) {
        found = true;
        break;
    }
    n = n / 10;
}

System.out.println(found ? "5 is present" : "5 is not present");
```

---

#### **4️⃣ Counting Digits in a Number**
```java
int n = 54321;
int count = 0;

while (n > 0) {
    count++;    // Increase count for each digit
    n = n / 10;
}

System.out.println("Total digits: " + count);
```
🔹 **Output:** `Total digits: 5`

---

#### **5️⃣ Checking if a Digit Divides the Number Evenly**
Example: Count digits in `n = 1246` that divide `n` evenly.
```java
int n = 1246;
int original = n;
int count = 0;

while (n > 0) {
    int last_digit = n % 10;
    
    if (last_digit != 0 && original % last_digit == 0) { // Avoid division by 0
        count++;
    }
    
    n = n / 10;
}

System.out.println("Count of evenly dividing digits: " + count);
```
🔹 **Output for `1246`** → `2` (because only `1` and `2` divide `1246` exactly)

---

### **📌 Summary**
- **Extract last digit:** `n % 10`
- **Remove last digit:** `n = n / 10`
- **Count digits:** Increment a counter in a loop
- **Reverse number:** Multiply `reversed = reversed * 10 + last_digit`
- **Check divisibility:** Use `original % last_digit == 0`
- **Avoid division by zero:** Always check `if (last_digit != 0)`

---

This concept is **super useful** for problems like:
✅ Counting digits  
✅ Checking divisibility  
✅ Reversing numbers  
✅ Finding a specific digit in a number  