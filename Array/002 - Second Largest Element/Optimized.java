public class Optimized {
    public static int secondLargest(int[] arr) {
        int slar = -1;
        int lar = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                slar = lar;
                lar = arr[i];
            } 
            else if (arr[i] < lar & arr[i] > slar) {
                slar = arr[i];
            }
            
        }
        return slar;
    }

    public static void main(String[] args) {

        int arr[] = { 8, 8, 7, 6, 5 };

        System.out.println(secondLargest(arr));
    }
}
