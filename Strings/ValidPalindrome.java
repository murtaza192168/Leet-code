public class ValidPalindrome {
    public static boolean isPalindrome(String str){
        // step1: Clean the string: Convert all chars to lowercase,
        // String should only contain Alphanumerics.
        // Should not contain: Symbols, Punctuations, Whitespaces.
        // For conditional basis, we are goin to use varius methods like: isLetterOrDigit() under Character class to check that it if string does not containe letter or digit, then we have to ignore and mov forward

        // TWO POINTER APPROACH

        int left = 0; // first element of the str
        int right = str.length()-1; // last element of the str
        // outer loop: the first loop:
        while(left < right){
            // ignore the elements if they are non-alphanumeric at left
            while((left < right) && !Character.isLetterOrDigit(str.charAt(left))){
                // simply ignore and move forward
                left++;
            }
            while((left < right) && !Character.isLetterOrDigit(str.charAt(right))){
                // simply ignore and move backward
                right--;
            }
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome palindromeObj = new ValidPalindrome();
        boolean result = ValidPalindrome.isPalindrome("diljit tiJliD");
        System.out.println(result);
    }
}
