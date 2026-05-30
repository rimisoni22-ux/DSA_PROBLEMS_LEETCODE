package leeetcode_problems.array;
//
//firstly count positive and negative integers
//find their maximum

public class maxcountofposandneginteger {

    public static void main(String[] args) {
        int nums[] = {-3, -1, -4, -9, 7, 5, 8};
        int n = nums.length;
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos++;

            }
            if (nums[i] < 0) {
                neg++;

            }
        }
        System.out.print(Math.max(pos, neg));

    }
}
