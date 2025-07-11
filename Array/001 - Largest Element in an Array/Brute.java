import java.util.Arrays;

public class Brute{

    public static int largestFun(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        return largest;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 5, 0, 2 };
        int largest = largestFun(arr);
        
        System.out.println("Largest element in the array is: " + largest);
    }
}