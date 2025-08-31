public class Brute {

    public static String longestCommonPrefix(String[] strs) {
        String result = "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) != c){
                    return result;
                } 
            }
            result=result+c;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs)); // Output: fl
    }
}
