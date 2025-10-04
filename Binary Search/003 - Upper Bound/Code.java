public class Code {
    public static int upperBound(int[] arr, int key){
        int ans = arr.length-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(key==arr[mid]){
                start = mid+1;
            }
            else if(key<arr[mid]){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {3, 5, 8, 15, 19};
        System.out.println(upperBound(arr1, 2));
        System.out.println(upperBound(arr2, 9));
    }
}
