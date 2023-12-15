import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean isAnagram(String s, String t) {
        // Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Sort char arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare sorted char arrays
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        // Example usage:
        Scanner s= new Scanner(System.in);
        String s1 = s.next();
        String t1 = s.next();
        System.out.println(isAnagram(s1, t1));  // Output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2));  // Output: false
    }
}
