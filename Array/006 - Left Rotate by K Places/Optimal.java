public class Optimal {
    public static void reverse(int arr[], int a, int b){
        while(a<b){
            int temp = arr[b];
            arr[b] = arr[a];
            arr[a] = temp;
            a++; b--;
        }
    }
    public static void leftRotateKPlace(int arr[],int k){
        int z = arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, z-1);
        reverse(arr, 0, z-1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = 3;
        leftRotateKPlace(arr,k);

        for(int x :arr){
            System.out.print(x+" ");
        }
    }
}
