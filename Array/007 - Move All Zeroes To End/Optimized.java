public class Optimized {

    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void moveZeroesToEnd(int arr[]) {
        int j =-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        //No non zero present
        if(j==-1) return;

        for(int i = j+1; i<arr.length; i++){  
            if(arr[i]!= 0){
                swap(arr, i,j);
                j++;
            }
        }


       }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        // int arr[] = {0,0,0,0};
        // int arr[] = {1,2,3,4};
        // int arr[] = {0, 1, 0, 2, 0, 3};
        // int[] arr = {1, 2, 3, 0, 0, 0};
        // int[] arr = {1, 0, 2};
        // int[] arr = {0, 0, 0, 1};



        moveZeroesToEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

/*
 * TC = O(n)
 * SC = O(1)  //no extra space
 */