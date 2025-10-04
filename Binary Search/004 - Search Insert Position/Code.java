public class Code {
    public static int insertPosition(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(key==arr[mid]){
                return mid+1;
            }else if(key<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return end+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(insertPosition(arr,5));
        System.out.println(insertPosition(arr,2));
        System.out.println(insertPosition(arr,7));
    }
}
