public class Code {

    public static int linearSearch(int[] arr, int k){
        int index = -1;

        for(int i =0; i< arr.length; i++){
            if(arr[i] == k){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {5,1,6,2,4,3,7};
        int key = 4;
        int result = linearSearch(arr, key);

        if(result>-1){
            System.out.println("Index :" + result);
        }else{
            System.out.println("Not found");
        }
       
    }
}
