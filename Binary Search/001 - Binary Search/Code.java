public class Code {
    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid+1;

            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        int key = 9;
        int answer = search(arr, key);
        System.out.println(answer);
    }
}
