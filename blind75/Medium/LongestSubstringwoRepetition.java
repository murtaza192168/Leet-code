public class  LongestSubstringwoRepetition{
  public static void main(String[] args){
    // Give user-input here
    // call the method
    int result = lengthOfLongestSubstring(str);
  }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Sliding Window Approach
        HashSet<Character> hashSet = new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        while(j < s.length())
        {
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(hashSet.size(),max);
            }
            else{
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return max;
              
       
    }
}
