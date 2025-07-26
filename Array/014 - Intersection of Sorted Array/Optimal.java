import java.util.ArrayList;

public class Optimal {
    public static int[] intersectionArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();

        int s1 = 0;
        int s2 = 0;

        while(s1<arr1.length && s2<arr2.length){
            if(arr1[s1]==arr2[s2]){
                arr.add(arr1[s1]);
                s1++; s2++;
            }
            else if(arr1[s1]<arr2[s2]){
                s1++;
            }
            else if(arr1[s1]>arr2[s2]){
                s2++;
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
// TC: O(n1 + n2)

// If 2 arrays are not sorted, we have to sort them and time complexity of O(n1 log n1 + n2 log n2) will be added
// Final TC = O(n1 log n1 + n2 log n2)
// SC: O(min(n1,n2))
// SC : Mention, created a new array of same size of ArrayList to return the result