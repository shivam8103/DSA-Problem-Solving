public class Improved {
    public static int longestSubArray(int[] arr, int key) {
        int[] prefixSum = new int[arr.length];

        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
            prefixSum[i] = sum;
        }

        for(int j = 0; j<prefixSum.length; j++){
            for(int i=0; i<=j; i++){
                if(prefixSum[j] - prefixSum[i] == key){
                    return j-i;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1,0};
        int k = 15;
        int x = longestSubArray(arr, k);
        System.out.println(x);
        
    }
}
