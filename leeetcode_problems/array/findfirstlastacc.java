package leeetcode_problems.array;

public class findfirstlastacc {

    // search element 
    // store value in ans variable return its index
    // find first accurance index of any element 
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;      // store answer
                high = mid - 1; // move left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;      // store answer
                low = mid + 1; // move left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 6};
        int target = 2;
        System.out.println(firstOccurrence(arr, target));
        System.out.println(lastOccurrence(arr, target));
    }
}
