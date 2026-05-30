
import java.util.Scanner; 
 //sum of digits = 123 = 1+2+3=6
 // approach 
 // initailize sum=0
 // find last digit 
 // add into sum
 // then remove that last digit 
 // repeat the process
 // find the sum

public class sumofdigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println(sum);
    }

}
