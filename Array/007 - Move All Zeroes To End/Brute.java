public class Brute {
    public static void moveZeroesToEnd(int arr[]) {
        int size = arr.length;
        int[] temp = new int[size]; // same size as original, by default all values are zeroes.
        // temp[] = {0,0,0,0,0,0,0,0,0,0}
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // temp[] = {1,2,3,2,4,5,1,0,0,0}
        for (int i = 0; i < size; i++) {
            arr[i] = temp[i];
        }

    };

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        moveZeroesToEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

/*
 * TC = O(n+n)
 * SC = O(N) //extra space = new temporary space.
 */