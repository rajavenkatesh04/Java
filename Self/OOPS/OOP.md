Great question! Let me explain why we write:

```java
Parent obj = new Child();
```

This works because of **polymorphism**, a key concept in Java. Let's break it down step by step.

---

## **1. Parent Reference Holding Child Object**

In Java, a **parent class reference** can hold a **child class object**. This is allowed because of **inheritance**.

**Example:**

```java
class Parent {
    void display() {
        System.out.println("This is the Parent method.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the Child method.");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent reference, Child object
        obj.display(); // Which method will be called?
    }
}
```

### **Output:**

```
This is the Child method.
```

### **Why Does This Work?**

- The `Parent` reference **can hold** an object of any class that **extends Parent**.
- At runtime, Java checks the **actual object type** and calls the correct method.
- This is called **Runtime Polymorphism** or **Dynamic Method Dispatch**.

---

## **2. Why Not `Parent obj = new Parent();` Always?**

If we write:

```java
Parent obj = new Parent();
```

- It simply means we’re creating a **Parent object**.
- It cannot use any methods or features of the **Child class**, because the object is of type `Parent`.

But when we write:

```java
Parent obj = new Child();
```

- We are using **polymorphism**.
- This allows us to call overridden methods **from the Child class** using the Parent reference.

---

## **3. Polymorphism Example**

Let’s look at this example with multiple subclasses:

```java
class Product {
    void displayPrice() {
        System.out.println("This is the Product price.");
    }
}

class Food extends Product {
    @Override
    void displayPrice() {
        System.out.println("This is the Food price.");
    }
}

class Drink extends Product {
    @Override
    void displayPrice() {
        System.out.println("This is the Drink price.");
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Food();   // Parent reference, Child object
        Product p2 = new Drink();  // Parent reference, Child object

        p1.displayPrice(); // Calls Food's version
        p2.displayPrice(); // Calls Drink's version
    }
}
```

### **Output:**

```
This is the Food price.
This is the Drink price.
```

---

## **4. Benefits of `Parent obj = new Child();`**

1. **Flexibility**: You can write more general code.

   - A single `Parent` reference can hold any type of child object.

2. **Runtime Method Resolution**: Even though we use a `Parent` reference, the method **in the actual object (Child)** is executed.

3. **Useful for Collections**: In real applications, polymorphism allows us to store different child objects in a single array or list.

**Example:**

```java
Product[] products = new Product[2];
products[0] = new Food();
products[1] = new Drink();

for (Product p : products) {
    p.displayPrice(); // Calls appropriate method
}
```

**Output:**

```
This is the Food price.
This is the Drink price.
```

---

## **5. Why Can't Parent Access Child-Specific Methods?**

If you write:

```java
Parent obj = new Child();
obj.childSpecificMethod(); // ERROR!
```

You get an error because the **reference type** (`Parent`) determines which methods are accessible at compile time. Since `Parent` does not have `childSpecificMethod`, it is not allowed.

To fix this, you need **downcasting**:

```java
if (obj instanceof Child) {
    Child childObj = (Child) obj; // Downcasting
    childObj.childSpecificMethod();
}
```

---

## **Key Summary**

1. `Parent obj = new Child();` works because of **polymorphism**.
2. The Parent reference can point to a Child object, but it can only access methods defined in the Parent class.
3. At runtime, the **actual object’s method** (Child’s overridden method) gets called.
4. This makes code more flexible and reusable.

---
