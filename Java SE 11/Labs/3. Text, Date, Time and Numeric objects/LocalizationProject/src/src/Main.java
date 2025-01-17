import java.util.Locale;

public class Main{
    public static void main(String[] args) {
//        Set up Locale objects for English(GB) and French (FR)
          Locale localeGB = new Locale("en", "GB");
          Locale localeFR = new Locale("fr", "FR");
          
//          Call Resource demo to display localised output
          System.out.println("----(GB)----");
          ResourceDemo.showLocalizedDetails(localeGB);
          
          System.out.println("\n----(FR)----");
          ResourceDemo.showLocalizedDetails(localeFR);
    }
}

