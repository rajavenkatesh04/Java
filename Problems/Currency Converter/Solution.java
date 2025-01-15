import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read the double-precision number
        double payment = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Create Locale objects
        Locale usLocale = Locale.US;
        Locale indiaLocale = new Locale("en", "IN");
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        // Create NumberFormat instances for each locale
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);

        // Print formatted values
        System.out.println("US: " + usFormat.format(payment));

        // Manually add Rupee symbol for India
        String indianCurrency = indiaFormat.format(payment).replace("₹", "Rs.");
        System.out.println("India: " + indianCurrency);

        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}