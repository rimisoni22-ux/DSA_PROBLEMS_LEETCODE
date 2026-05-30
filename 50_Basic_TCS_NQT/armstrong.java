
import java.util.*;
//Armstrong number means 153 = 1^3+5^3+3^3= 153 
// opproach  

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
 //  store the origi9nal number in temp variable sum = 0 initialize number with 0
        int temp = n, sum = 0;
// loop till n ==0
        while (n != 0) {
            //  find last digit 
            int digit = n % 10;
             // cube of digits and add  into sum
            sum += digit * digit * digit; 

            // remove last element
            n /= 10;
        }

        System.out.println(temp == sum ? "Armstrong " : "Not armstrong");

    }

}
