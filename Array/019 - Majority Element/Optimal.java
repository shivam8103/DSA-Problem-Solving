public class Optimal{
    public static int majorityElement(int[] arr){
        int count = 0; int result = 0;
        for(int i=0; i<arr.length; i++){
            if(count==0){
                result = arr[i];
                count++;
            }
            else{
                if(arr[i]==result){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        return arr[arr.length/2];
    }
    public static void main(String[] args){
        int arr[] = {3,3,4};
        System.out.println(majorityElement(arr));
    }
}