public class Code{

    public static void leftRotateOnePlace(int[] arr){
        int temp = arr[0];

        for(int i=0; i<=arr.length -2 ; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = temp;

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};

        leftRotateOnePlace(arr);
        for(int x: arr){
            System.out.print(x+ " ");
        }
    }
}
