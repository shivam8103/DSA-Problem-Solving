public class Optimal {
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }

        int temp = x;
        int reverse = 0;

        while(temp!=0){
            int digit = temp%10;

            reverse = reverse*10 + digit;

            temp/=10;

        }
        return x==reverse;
    }
    public static void main(String[] args) {
        int a = 121;

        boolean result = isPalindrome(a);

        System.out.println(result);
    }
}
