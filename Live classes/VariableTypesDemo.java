public class VariableTypesDemo {

    // Static variable (class variable)
    static int staticCount = 0;

    // Instance variable
    int instanceCount = 0;

    // Constructor to demonstrate instance and static variables
    public VariableTypesDemo() {
        // Increment the static variable
        staticCount++;
        // Increment the instance variable
        instanceCount++;
    }

    // Method to demonstrate a local variable
    public void displayCounts() {
        // Local variable
        int localCount = 10;

        System.out.println("Local Count (inside displayCounts method): " + localCount);
        System.out.println("Instance Count (specific to this instance): " + instanceCount);
        System.out.println("Static Count (shared among all instances): " + staticCount);
    }

    public static void main(String[] args) {
        // Create first object
        VariableTypesDemo obj1 = new VariableTypesDemo();
        obj1.displayCounts();

        // Create second object
        VariableTypesDemo obj2 = new VariableTypesDemo();
        obj2.displayCounts();

        // Displaying the static variable directly from the class
        System.out.println("Static Count (accessed via class): " + VariableTypesDemo.staticCount);
    }
}
