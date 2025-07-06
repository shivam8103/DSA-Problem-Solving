public class Optimal {
    public static int largestFun(int[] arr) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 5, 0, 2 };
        int largest = largestFun(arr);
        System.out.println("Largest element in the array is: " + largest);
    }
}