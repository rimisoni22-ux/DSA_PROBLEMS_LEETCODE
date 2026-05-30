package leeetcode_problems.array;

class searchinsertpos {

    public static int insert(int nums[], int target) {
        // using binary search
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;

    }

    public static void main(String[] args) {

        int nums[] = {2, 2, 4, 6, 7, 8};
        int target = 8;
        System.out.println("pos is" + insert(nums, target));

    }
}
