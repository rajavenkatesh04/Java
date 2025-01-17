import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceDemo {
    public static void showLocalizedDetails(Locale locale) {
        // Data to be formatted
        String name = "Cookie";
        BigDecimal price = BigDecimal.valueOf(2.99);
        int quantity = 5;
        LocalDate bestBefore = LocalDate.of(2024, Month.AUGUST, 20);

        // Load the appropriate resource bundle based on locale
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);

        // Create formatters for currency, numbers, and dates
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMM yyyy", locale);

        // Format the values
        String formattedPrice = currencyFormat.format(price);
        String formattedQuantity = numberFormat.format(quantity);
        String formattedDate = bestBefore.format(dateFormat);

        // Fetch the pattern from the resource bundle
        String pattern = bundle.getString("product");

        // Format the message using MessageFormat
        String message = MessageFormat.format(pattern, name, formattedPrice, formattedQuantity, formattedDate);

        // Print the localized message
        System.out.println(message);
    }
}
