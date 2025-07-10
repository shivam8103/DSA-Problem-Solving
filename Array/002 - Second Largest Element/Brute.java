import java.util.Arrays;

public class Brute {
    public static int secondLargest(int[] arr) {
        int slar = -1;

        Arrays.sort(arr);

        // check if multiple largest element are present.
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                slar = arr[i - 1];
                return slar;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 8, 8, 7, 6, 5 };
        // int arr[] = { 6, 7, 7, 7, 7 };
        // int arr[] = { 7, 7, 7, 7, 7 };
        
        System.out.println(secondLargest(arr));
    }
}
