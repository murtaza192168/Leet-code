import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstrWithoutRepeatingChars {

    // method to implement finding the max length of the consecutive substr (w/o repeating chars)
    public static int findMaxLenOfSubstr(String str){
        int i=0, j=0, max=0;
        // initialise empty hashSet to manage substr char entries
        HashSet<Character> hashset = new HashSet<>();
        // looping throught the array of characters w.t.h. of SLIDING WINDOW APPROACH
        while(j <= str.length() - 1 ){
            if(!hashset.contains(str.charAt(j))){
                hashset.add(str.charAt(j));
                j++;
                max = Math.max(max, hashset.size());
            }
            else{
                hashset.remove(str.charAt(i));
                i++;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int result = LongestSubstrWithoutRepeatingChars.findMaxLenOfSubstr("nnnnn");
        System.out.println(result);
    }
}
