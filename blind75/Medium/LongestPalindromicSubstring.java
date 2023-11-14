public class LongestPalindromicSubstring{
  public static void main(String[] args){
    //Give user-input here

    // call method
    String substringPalindrome =  longestPalindrome(s);
    //Print the result
  }
}

class Solution {
    public String longestPalindrome(String s) {
            // base condtion
            if(s == null || s.length() < 1){return "";}
            // initialize boundaries of the substring which shall be returned
            int start = 0;
            int end = 0;
            //for loop will iterate for each character of the substring
            for(int i = 0; i < s.length(); i++){
                // lengths of two conditions will be returned by calling the below method
                // len1 will be returned when there is a single char in the MIDDLE of the string and has no matches, so obvio it will be compared and matched with its ownself
                int len1 = expandFromMiddle(s, i, i);
                // len2 will return if one char matches another 
                int len2 = expandFromMiddle(s, i, i+1);
                // now, inorder to pick up and one length that is actaully required and qualified for a particular substring will be selected. So for that we will make use of max method
                int len = Math.max(len1, len2);

                // simple check required to move forward
                if(len > (end - start)){
                    // if this satisfies then both the pointers will be updated towards their respective directions so that we can check upcoming characters 
                    start = i - ((len-1) / 2); // decrement towards left of the array
                    end = i + (len / 2);       // increment towards right of the array
                }
                 
            }
            return (s.substring(start, end+1));
           
    }
    //////////////////////////////////////////////////////////////////////

      // Check for the substring length and return it in actual function
    public int expandFromMiddle(String str, int left, int right){
          // as we will start the pointers from the middle element of the array and keep on expanding it towards its respective ends
          
          // base condition
          if(str == null || left > right){return 0;}

          while(left >= 0 && right <= str.length()-1 && str.charAt(left) == str.charAt(right))
          {
               // decrement the left pointer 
          left--;
          // increment the right pointer towards the end
          right++;
          }
            // Either there are no more matches of chars in either side of string OR string is outOfBound.. in these two cases you can now return the length of the longest substring
      return(right - left - 1);
         
        }
    
    
}
