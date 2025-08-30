public class Brute {

    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }

        String str = Integer.toString(x);
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++; end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a = 2121;

        boolean result = isPalindrome(a);

        System.out.println(result);
    }
}
