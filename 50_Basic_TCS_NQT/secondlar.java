
import java.util.*;

public class secondlar {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 99};
        int lar = arr[0];
        int sec_lar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lar) {
                sec_lar = lar;
                lar = arr[i];

            } else if (arr[i] > sec_lar && arr[i] != lar) {
                sec_lar = arr[i];

            }
        }
        System.out.println("second largest element  " + sec_lar);
        System.out.println("Largest  " + lar);
    }

}
