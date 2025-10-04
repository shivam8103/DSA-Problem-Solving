public class Code {
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int i = (start + end) / 2;
        while (start < end) {
            if (arr[i] == key) {
                return i;
            } else if (key > arr[i]) {
                start = i;
                i = (i + end) / 2;

            } else {
                end = i;
                i = (i + start) / 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        int key = 9;
        int answer = binarySearch(arr, key);
        System.out.println(answer);
    }
}
