class code {
    public static int removeElement(int[] arr, int k) {

        int result = 0 ;

        for(int i = 0; i <arr.length; i++){
            if(arr[i] != k){
                arr[result] = arr[i];
                result++;
            }
        }
        
        
        return result;
    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int k = 2;

        int result = removeElement(arr, k);

        // Check if output is correct
        System.out.println(result);

        boolean flag = true;
        for (int i = 0; i < result; i++) {
            if (arr[i] == k) {
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println("Correct Output");
        }
    }
}