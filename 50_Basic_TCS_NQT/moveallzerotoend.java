
import java.util.Scanner;

public class moveallzerotoend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[idx] = arr[i];
                idx++;

            }

        }
        while (idx < n) {
            arr[idx] = 0;
            idx++;
        }
        for (int num : arr) {
            System.out.println(num + " ");

        }

    }

}
