import java.util.TreeSet;
import java.util.Iterator;

public class Brute {
    static int[] unionArray(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        int[] arr = new int[set.size()];

        // int i = 0;
        // for (int x : set) {
        //     arr[i] = x;
        //     i = i + 1;
        // }

        Iterator<Integer> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            arr[i++] = it.next();
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 4, 5 };
        int[] arr2 = { 2, 2, 3, 5, 5, 6 };

        int[] arr = (unionArray(arr1, arr2));

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

//TC : O((n + m) * log(n + m))  -- 1 Insertion in a tree takes O(logK) TC
//SC : O(n + m)
