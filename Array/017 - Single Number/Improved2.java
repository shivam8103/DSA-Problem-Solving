import java.util.Map;
import java.util.HashMap;
public class Improved2 {
    public static int appearOnce(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int key : arr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }


        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,3,4,4 };
        System.out.println(appearOnce(arr));
    }
}

// TC = O(2n)
// SC = O(n)

