public class Improved {

    public static void leftRotateKPlace(int[] arr, int k) {

        k = k % arr.length;
        int brr[] = new int[k];

        for (int i = 0; i < k; i++) {
            brr[i] = arr[i];
        }

        for (int i = 0; i < (arr.length - k); i++) {
            arr[i] = arr[i + k];
        }
        for (int i = 0; i < k; i++) {
            arr[arr.length - k + i] = brr[i];
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 9;
        leftRotateKPlace(arr, k);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}


//TC = O(N)
//SC = O(K)
