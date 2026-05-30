
import java.util.*;

public class lcmofnum {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;
            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int gcdval = gcd(a, b);
        int lcm = (a * b) / gcdval;
        System.out.println("LCM :" + lcm);

    }

}
