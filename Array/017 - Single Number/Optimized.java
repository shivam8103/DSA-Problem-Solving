public class Optimized {
    public static int appearOnce(int[] arr) {
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result = result ^ arr[i];
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,3,4,4 };
        System.out.println(appearOnce(arr));
    }
}

// TC = O(n)
