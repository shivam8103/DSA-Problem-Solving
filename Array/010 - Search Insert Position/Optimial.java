public class Optimial {
    public static int searchInsertPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (high + low) / 2;


            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return high+1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        // int target = 3;
        // int target = 4;
        // int target = 6;
        int target = 7;
        System.out.println(searchInsertPosition(arr, target));
    }
    
}
