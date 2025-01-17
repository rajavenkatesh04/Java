class Product {
    void displayPrice() {
        System.out.println("price of the product: ");
    }
}

class Food extends Product {
    void displayPrice() {
        System.out.println("Price of the Food: ");
    }
}

class Drink extends Product {
    void displayPrice() {
        System.out.println("Price of the Drink: ");
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Food();
        Product p2 = new Drink();

        p1.displayPrice();
        p2.displayPrice();
    }
}