import java.util.Arrays;
public class Optimal {

    public static String longestCommonPrefix(String[] str){
        String result = "";

        int ArraySize = str.length;

        Arrays.sort(str);

        for(int i=0; i<str[0].length(); i++){
            if(str[0].charAt(i) == str[ArraySize-1].charAt(i)){
                result = result+str[0].charAt(i);
            }
            else{
                break;
            }
        }


        return result;
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};

        String result = longestCommonPrefix(str);

        System.out.println(result);
    }
}

// TC: O(nlogn)
// SC: O(1)