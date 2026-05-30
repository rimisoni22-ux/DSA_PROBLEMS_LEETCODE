
import java.util.Scanner;

public class merge2arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // first array size
        int n1 = sc.nextInt();

        // first array
        int[] a = new int[n1];

        // input first array elements
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        // second array size
        int n2 = sc.nextInt();

        // second array
        int[] b = new int[n2];

        // input second array elements
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        // merged array
        int[] merged = new int[n1 + n2];

        // copy first array
        for (int i = 0; i < n1; i++) {
            merged[i] = a[i];
        }

        // copy second array
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = b[i];
        }

        // print merged array
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
