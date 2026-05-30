
import java.util.Scanner;

public class findmissing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n - 1];
        // input array
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        //expexted sum 
        int total = n * (n + 1) / 2;
        int actual = 0;
        for (int i = 0; i < n - 1; i++) {
            actual += arr[i];

        }
        // missing number 
        int missing = total - actual;
        System.out.println("Missing Number = " + missing);

    }

}
