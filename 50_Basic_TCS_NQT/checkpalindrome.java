
import java.util.*;

public class checkpalindrome {
    // reverse digit and compare with original number
    // 1221 = 1221

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10; // find first digit
        }
        if (original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");

        }

    }

}
