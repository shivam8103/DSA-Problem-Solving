//https://leetcode.com/problems/max-consecutive-ones/submissions/1718382731/

public class Solution {
    public static int longestConsecutiveOnes(int[] arr) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > result) {
                    result = count;
                }
            } else {
                count = 0;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 };
        System.out.println(longestConsecutiveOnes(arr));
    }
}

//TC: O(n)