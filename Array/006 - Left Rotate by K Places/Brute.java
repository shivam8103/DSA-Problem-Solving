public class Brute {

    public static void leftRotateKPlace(int[] arr, int k) {
        k = k % arr.length;
        while (k > 0) {
            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            k--;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 9; // 9%6 = 3
        leftRotateKPlace(arr, k);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

//TC = O(N*K)
//SC = O(1)