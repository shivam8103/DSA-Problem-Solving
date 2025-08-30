import java.util.*;

public class Optimal {
    public static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int PS = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            PS = PS + arr[i];

            if (PS == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(PS - k)) {
                maxLen = Math.max(maxLen, i - map.get(PS - k));
            }

            if (!map.containsKey(PS)) {
                map.put(PS, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,-10};
        int k = 15;
        System.out.println(longestSubarray(arr, k)); // Output: 6
    }
}
