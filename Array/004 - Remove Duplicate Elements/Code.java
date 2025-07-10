public class Code {
    public static int removeDuplicates(int[] arr) {
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        //Return the no. of unique elements
        return j+1;
    }

    public static void main(String args[]) {
        int[] arr = { 1,1,2,2,3,3,3,4 };
        int index = removeDuplicates(arr);

        for(int i=0; i<index; i++){
            System.out.print(arr[i]+" ");
        }
    }
}