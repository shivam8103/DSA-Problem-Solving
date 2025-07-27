public class Brute {
    public static int missingNumber(int[] arr) {

        int result = -1;

        int[] temp = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]] = 1;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                result = i;
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        // int[] arr = { 3, 0, 1 }; // output = 2
        // int[] arr = {0,1}; //output = 2
        int[] arr = {9,6,4,2,3,5,7,0,1}; //output = 8

        System.out.println(missingNumber(arr));
    }
}

// Tc = O(2n)
// SC = o(N)