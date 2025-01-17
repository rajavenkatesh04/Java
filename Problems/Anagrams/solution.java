import java.util.*;

public class solution {

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < a.length(); i++) {
            freq[Character.toLowerCase(a.charAt(i)) - 'a']++;
            freq[Character.toLowerCase(b.charAt(i)) - 'a']--;
        }

        for (int f : freq) {
            if (f != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean result = isAnagram(a, b);
        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
}
