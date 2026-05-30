
import java.util.*;

public class check_prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
         if(n<=1){
            isPrime = false;
         }
          for(int i = 2;i<n/2;i++){
            if(n%1==0){
                isPrime = true;
                break;

            }  
            else {
                isPrime= false;
            }
             
          }
          if(isPrime){
           System.out.print("Prime");
        } 
        else { 
              System.out.print("Not Prime");

        }
    }
}

