public class Improved {
    public static int[] longestSubArray(int[] arr, int key) {
        int length = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                
                if (sum == key && length < (j - i + 1)) {
                    length = j - i + 1;
                    start = i;
                    end = j + 1;
                }
            }
        }

        int[] result = new int[length];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[start];
            start++;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1};
        int k = 15;
        int result[] = longestSubArray(arr, k);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
