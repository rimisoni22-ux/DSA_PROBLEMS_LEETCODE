
import java.util.*;
//Euclidean algoritham
//

public class gcdof2num { 

     static int gcd (int a,int b) {
         if(b==0){
            return  a;

         } 
          return gcd(b,a%b);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(); 
         System.out.println("gcd"+gcd(a,b));



         
        




         // while (b != 0) {
        //     int temp = b;
        //     b = a % b;
        //     a = temp;

        // }
        // System.out.println(a);

    }
}
