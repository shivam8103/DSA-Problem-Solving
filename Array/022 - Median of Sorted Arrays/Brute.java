//not optimal . solved in O(m+n) TC & SC
// asked to solve in O(log(m+n)) TC

public class Brute {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        int n1 = 0;
        int n2 = 0;
        int index = 0;
        while(n1<nums1.length && n2<nums2.length){
            if (nums1[n1] <= nums2[n2]) {
                    arr[index] = nums1[n1];
                    n1++; index++;
            }else{
                arr[index] = nums2[n2];
                n2++; index++;
            }
        }

        while(n1<nums1.length){
            arr[index] = nums1[n1];
            n1++; index++;
        }

        while(n2<nums2.length){
            arr[index] = nums2[n2];
            n2++; index++;
        }


        for( int x : arr){
            System.out.print(x+" ");
        }
        double median = 0.0;

        if (arr.length % 2 == 0) { //even
            median = (arr[(arr.length/2)-1] + arr[(arr.length)/2]) / 2.0;

        } else { //odd

            median = arr[arr.length/2];
        }
        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2, 4 };

        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}
