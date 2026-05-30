 package Recursion;
class allocc {
    static void findAll(int[] arr, int key, int i) {
        // base case
        if (i == arr.length) {
            return;
        }

        // kaam
        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        // recursive call
        findAll(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 2, 6, 2};
        int key = 2;

        findAll(arr, key, 0);
    }
}
