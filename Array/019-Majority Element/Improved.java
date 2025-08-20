import java.util.HashMap;
import java.util.Map;

public class Improved {
    public static int majorityElement(int[] arr){
        Map<Integer,Integer> m = new HashMap<>();

        for (int x: arr){
            m.put(x, m.getOrDefault(x,0)+1);

            if(m.get(x)>arr.length/2) return x;

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 4 };
        System.out.println(majorityElement(arr));
    }
}
