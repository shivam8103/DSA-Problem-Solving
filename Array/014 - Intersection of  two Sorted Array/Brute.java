import java.util.ArrayList;
public class Brute {
    public static int[] intersectionArray(int[] arr1, int[] arr2){
        ArrayList<Integer> arr = new ArrayList<>();

        int[] vis = new int[arr2.length];



        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j] && vis[j] == 0){
                    arr.add(arr1[i]);
                    vis[j] = 1;
                    break;
                }
            }
        }

        
        
        int[] result = new int[arr.size()];
        for(int i=0; i<result.length; i++){
            result[i] = arr.get(i);
        }

        return result;

    }
    public static void main(String[] args) {

        int[] arr1 = { 1, 1, 2, 3, 3, 4, 4, 5, 6 };
        int[] arr2 = { 1, 3, 3, 4, 6 };

        int[] result = intersectionArray(arr1, arr2);

        for(int x : result){
        System.out.print(x+ " ");
        }
    }
}
//TC: O(n1*n2) 
//SC: O(n2)
// SC : Mention, created a new array of same size of ArrayList to return the result