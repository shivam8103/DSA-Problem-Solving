public class Optimal2 {
    public static int missingNumber(int[] arr) {

        int xorExpected = 0;
        int xorActual = 0;

        for(int i =0; i<arr.length; i++){
             xorActual = xorActual ^ arr[i];
             xorExpected = xorExpected ^ i;
        }

        xorExpected = xorExpected ^ arr.length;

        int result = xorExpected ^ xorActual;
        return result;

    }

    public static void main(String[] args) {

        // int[] arr = { 3, 0, 1 }; // output = 2
        // int[] arr = {0,1}; //output = 2
        int[] arr = {9,6,4,2,3,5,7,0,1}; //output = 8

        System.out.println(missingNumber(arr));
    }
}

//TC: O(n)
//SC: O(1)