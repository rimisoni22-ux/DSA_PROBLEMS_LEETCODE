package leeetcode_problems.array;

public class Numberofgoodpairs {
    public static void main(String[] args) {
         int nums [] = {1,1,1,1};
   
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;

                }
            }
        }

        System.out.print(count);
    }
}
        
    