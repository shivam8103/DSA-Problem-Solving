public class Code{
    public static int lowerBound(int[] arr, int key){
        int ans = arr.length;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(key==arr[mid]){
                return mid;
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
        int[] arr1 = {3,5,8,15,19};
        int[] arr2 = {1,2,2,3};
        System.out.println(lowerBound(arr1, 9));
        System.out.println(lowerBound(arr2, 2));
    }
}