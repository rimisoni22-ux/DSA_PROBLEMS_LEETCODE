
import java.util.*;

public class bubblesort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array 
        int[] arr = new int[n]; // creation of array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // bubble sort  
        for (int turn = 0; turn < n - 1; turn++) {

            //  comparision  
            for (int i = 0; i < n - 1 - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
            // print sorted array
            for (int j = 0; j < n; j++) {
                System.out.print( + arr[j]);

            }

        }

    

}
