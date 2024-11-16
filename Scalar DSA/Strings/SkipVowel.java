import java.util.Scanner;

public class SkipVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);

            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u')

            {
                continue;
            }

            System.out.print(s);
        }
    }
}