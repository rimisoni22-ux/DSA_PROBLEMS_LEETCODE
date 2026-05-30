public class pairsum_2 {
    public static void main(String[] args) {
        // sorted and rotated array
        int[] arr = {11, 15, 6, 4, 8, 9, 10};
        int target = 16;
        findRotatedPairs(arr, target);
    }

    public static void findRotatedPairs(int[] arr, int target) {
        int n = arr.length;

        // Step 1: Find pivot (largest element index)
        int pivot = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If array is not rotated
        if (pivot == -1) {
            pivot = n - 1;
        }

        // Step 2: Set pointers
        int lp = (pivot + 1) % n; // smallest element
        int rp = pivot;           // largest element

        // Step 3: Two pointer approach
        while (lp != rp) {
            int sum = arr[lp] + arr[rp];

            if (sum == target) {
                System.out.println(arr[lp] + " " + arr[rp]);
                return; // stop after finding one pair
            } else if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (rp - 1 + n) % n;
            }
        }

        System.out.println("No pair found");
    }
}