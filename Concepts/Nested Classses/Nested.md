Think of a university as a class. Inside this university, you have classrooms. These classrooms are like nested classes - they exist inside the university and have a special relationship with it. Just like how classrooms can access university resources (like electricity and wifi), nested classes can access the members of their outer class.

Let's break down the four types of nested classes in Java:

First, let's look at Static Nested Classes. Imagine a classroom that can function even when the rest of the university is closed. That's what a static nested class is - it can exist independently of the outer class instance. Here's an example:

```java
public class University {                 // Outer class
    private String universityName = "MIT";
    
    static class Department {             // Static nested class
        void printInfo() {
            // Can't directly access universityName because it's static
            System.out.println("I'm a department");
        }
    }
    
    public static void main(String[] args) {
        // Create static nested class without outer class instance
        University.Department dept = new University.Department();
    }
}
```

Next, we have Inner Classes (non-static nested classes). These are like regular classrooms that can only operate when the university is open. They have full access to their outer class's members:

```java
public class University {
    private String universityName = "MIT";
    
    class Classroom {                     // Inner class
        void printInfo() {
            // Can access outer class members directly
            System.out.println("I'm a classroom in " + universityName);
        }
    }
    
    public static void main(String[] args) {
        // Need University instance to create Classroom
        University uni = new University();
        University.Classroom room = uni.new Classroom();
    }
}
```

Third, we have Local Classes. Think of these like temporary study groups that only exist within a specific method. They're defined inside a method and can only be used there:

```java
public class University {
    void conductClass() {
        final String topic = "Java";
        
        class StudyGroup {               // Local class
            void discuss() {
                // Can access method variables if they're final or effectively final
                System.out.println("Studying " + topic);
            }
        }
        
        StudyGroup group = new StudyGroup();
        group.discuss();
    }
}
```

Finally, we have Anonymous Classes. These are like pop-up events that happen once and never again. They're created and used on the spot:

```java
public class University {
    interface Student {
        void study();
    }
    
    void startClass() {
        // Anonymous class implementing Student interface
        Student student = new Student() {
            public void study() {
                System.out.println("Studying anonymously!");
            }
        };
        student.study();
    }
}
```

Key points to remember:
1. Static nested classes can't directly access non-static members of their outer class, but they're easier to instantiate.
2. Inner classes have access to all members of their outer class, but need an instance of the outer class to exist.
3. Local classes can only be used within their defining method and can access final or effectively final local variables.
4. Anonymous classes are used when you need a one-time implementation of an interface or extension of a class.
