# Common Java Exceptions and Their Fixes

This document lists common Java exceptions, what they mean, and how they can be fixed.

---

## 1. `java.lang.NullPointerException`

### **Description**

A `NullPointerException` occurs when you attempt to use an object reference that has not been initialized (i.e., it is `null`).

### **Example**

```java
String name = null;
System.out.println(name.length()); // Causes NullPointerException
```

## 2. `java.lang.ArrayIndexOutOfBoundsException`

### **Description**

This exception occurs when you try to access an invalid index of an array (i.e., an index that is less than 0 or greater than or equal to the array length).

### **Example**

```java
int[] numbers = {1, 2, 3};
System.out.println(numbers[5]); // Causes ArrayIndexOutOfBoundsException
```

<!-- Template to add new Exception -->
<!-- ## X. `ExceptionName`

### **Description**

A brief explanation of the exception.

### **Example**

```java
// Code snippet that causes the exception
``` -->
