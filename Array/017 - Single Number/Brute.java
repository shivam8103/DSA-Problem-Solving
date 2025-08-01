public class Brute {
    public static int appearOnce(int[] arr) {
         int n = arr.length;

        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,3,4,4 };
        System.out.println(appearOnce(arr));
    }
}

//TC: O(n^2)
//SC: O(1)