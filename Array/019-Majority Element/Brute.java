import java.util.Arrays;
public class Brute{
    public static int majorityElement(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
    public static void main(String[] args){
        int arr[] = {3,3,4};
        System.out.println(majorityElement(arr));
    }
}