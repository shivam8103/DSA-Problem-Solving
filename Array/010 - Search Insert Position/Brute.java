public class Brute {
    public static int searchInsertPosition(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
            else if (nums[i] > target)
                return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int target = 3;
        // int target = 4;
        // int target = 6;
        // int target = 7;
        System.out.println(searchInsertPosition(arr, target));
    }
}
