
import java.util.*;

public class fibonacci {

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));

        // method 2
        // int a = 0 , b = 1;
        // for(int i =1;i<=n;i++){
        //     int c = a+b;
        //     a = b;
        //     b =c ;
        // }
    }

}
