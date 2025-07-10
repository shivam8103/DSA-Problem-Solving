public class Improved {
    public static int secondLargest(int[] arr) {
        int slar = -1;
        int lar = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > slar && arr[i] != lar) {
                slar = arr[i];
            }
        }

        if (slar > -1) {
            return slar;
        }

        else
            return -1;
    }

    
    public static void main(String[] args) {

        int arr[] = { 8, 8, 7, 6, 5 };
        // int arr[] = {6,7,7,7,7 };
        // int arr[] = { 7, 7, 7, 7, 7 };
        System.out.println(secondLargest(arr));
    }
}
