public class Optimal {
    public static int missingNumber(int[] arr) {

        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;


        for (int num : arr) {
            actualSum = actualSum + num;
        }
        
        int result = expectedSum - actualSum;

        return result;

    }

    public static void main(String[] args) {

        // int[] arr = { 3, 0, 1 }; // output = 2
        int[] arr = {0,1}; //output = 2
        // int[] arr = {9,6,4,2,3,5,7,0,1}; //output = 8

        System.out.println(missingNumber(arr));
    }
}