public class Code {
    public static int[] plusOne(int[] digits) { // 9,9,9
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else { // arr[i] == 0
                digits[i] = 0; // 0,0,0
            }
        }

        digits = new int[digits.length + 1]; // 0,0,0,0 -- initialized to zero
        digits[0] = 1; // 1,0,0,0

        return digits;
    }

    public static void main(String[] args) {

        int arr[] = { 9, 9, 9 };
        int[] result = plusOne(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }

    }
}
