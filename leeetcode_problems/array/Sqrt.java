package leeetcode_problems.array;
public class Sqrt {

    public static int sqr(int n) {
        int lo = 0;
        int hi = n;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return hi; // floor square root
    }

    public static void main(String[] args) {
        int n = 20;

        System.out.println(sqr(n));
    }
}
