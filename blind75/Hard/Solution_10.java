class Solution_10 {
    int str_len; // declaring string size globally
    int ptn_len; // declaring pattern length globally
    int[][] cache; //dimension:indicates the possible entries 

    // Main method
    public static void main(String[] args){
        // Give user input here

        // Call the method - isMatch()
        boolean result = isMatch(str, pattern);
        // print result here

    } 
    public boolean isMatch(String s, String p) {
        // initialising lengths of string and pattern characters
        str_len = s.length(); // length of string
        ptn_len = p.length(); // length of pattern
        cache = new int [str_len+1][ptn_len]; // string will traverse over its last position

        // Recursively invoking the method
          return topDownPositions(0, 0, s, p);
    } // end of isMatch func

    public boolean topDownPositions(int i, int j, String s, String p)
    {
        // Base condition:
           if(i >= str_len && j >= ptn_len){return true;}
           else if(j >= ptn_len){return false;}

        //Indication and checking the possible entries and according to that calculating..
          if(cache[i][j] != 0)
          {
              if(cache[i][j] == -1){return false;}
            return true;
          }    
        // buildig a condition for matching chars at an initial stage, and then storing it in a variable
         boolean charMatch = (i < str_len && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') ); // string match helper
         boolean isMatch; // pattern match helper

         if(j < ptn_len-1 && p.charAt(j+1) == '*') // j+1 : asterik will be present next to any character
         {
            isMatch = ((charMatch && topDownPositions(i+1, j, s, p)) || topDownPositions(i, j+2, s, p));           //   (topDownPositions(i+1, j, s, p): means that move only the i pointer of string to the next character and dont move pattern pointer j, let it be where it is.. WHEN string character matches the character that is preceding the *

            //  topDownPositions(i, j+2, s, p): means that move your pattern position two indexes ahead if the letter in the string did not match the preceding character of the pattern
         }
         else
         {
             isMatch =(charMatch && topDownPositions(i+1, j+1, s, p)); // when both characters that have been matched are alphabets then move both of your pointers ahead
         }

         if(isMatch) // true
         {
             cache[i][j] = 1;
         }
         else{
             cache[i][j] = -1;
         }
         

        return isMatch;
    } //end of topDownPositions
} // end of the solution class
