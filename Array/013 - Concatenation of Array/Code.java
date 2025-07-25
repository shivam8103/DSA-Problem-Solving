public class Code {
    public static int[] getConcatenation(int[] nums) {
        int arr[] = new int[2*nums.length];

        for(int i = 0 ; i< arr.length; i++){
            arr[i] = nums[i%nums.length];
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int result[] = getConcatenation(arr);

        for(int e : result){
            System.out.print(e+" ");
        }
    }
}
