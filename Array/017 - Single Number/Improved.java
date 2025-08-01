public class Improved {
    public static int appearOnce(int[] arr) {
        int max = 0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        int[] hash = new int[max+1];

        for(int i=0; i<arr.length; i++){
            hash[arr[i]]++;
        }

        for(int i=0; i<hash.length; i++){
            if(hash[i]==1) return i;
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,3,4,4 };
        System.out.println(appearOnce(arr));
    }
}

// TC = O(3n)
// SC = O(n)

// Note: Limitations of using a hash array (i.e., direct indexing with arrays):
// 1. If the array contains negative numbers, we can't use them as indices in a hash array.
// 2. If the array contains very large numbers (e.g.10^5), we'd need to create a huge array to accommodate all possible indices,
//    which wastes memory and may be inefficient to iterate over.
// Therefore, in such cases, using a Map (like HashMap) is more efficient and recommended.
