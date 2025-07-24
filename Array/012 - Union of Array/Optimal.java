import java.util.ArrayList;

public class Optimal {
    static ArrayList<Integer> unionArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (arr.isEmpty() || !arr.get(arr.size() - 1).equals(arr1[i])) {
                    arr.add(arr1[i]);
                }
                i++;
            } else {
                if (arr.isEmpty() || !arr.get(arr.size() - 1).equals(arr2[j])) {
                    arr.add(arr2[j]);
                }
                j++;
            }
        }

        // Leftover elements in arr1
        while (i < arr1.length) {
            if (arr.isEmpty() || !arr.get(arr.size() - 1).equals(arr1[i])) {
                arr.add(arr1[i]);
            }
            i++;
        }

        // Leftover elements in arr2
        while (j < arr2.length) {
            if (arr.isEmpty() || !arr.get(arr.size() - 1).equals(arr2[j])) {
                arr.add(arr2[j]);
            }
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 4, 5 };
        int[] arr2 = { 2, 2, 3, 5, 5, 6 };

        ArrayList<Integer> arr = unionArray(arr1, arr2);

        for (int x : arr) {
            System.out.print(x + " ");
            
        }
    }
}


// TC : O(n1+n2) = O(n)
// SC : O(n1+n2) = O(n)