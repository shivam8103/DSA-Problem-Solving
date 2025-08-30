public class Optimal {
    public static int longestSubArray(int[] arr, int key) {
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxLength = 0;

        while(right<arr.length){

            while(sum>key){
                sum = sum - arr[right];
                right++;
            }
            right ++;
            if(rightsum = sum + arr[right]{
                
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 0 };
        int k = 15;
        int x = longestSubArray(arr, k);
        System.out.println(x);

    }
}
