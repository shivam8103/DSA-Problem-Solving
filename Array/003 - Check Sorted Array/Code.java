public class Code{
    public static boolean checkSorted(int[] arr) {
        
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;  
    }

    public static void main(String args[]) {
        int[] arr = { 1,1,1,1,2};
        boolean flag = checkSorted(arr);

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
