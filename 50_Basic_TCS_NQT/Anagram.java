
import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();
  
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
